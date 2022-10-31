package com.ttn.JPAWithHibernatePart2;

import com.ttn.JPAWithHibernatePart2.Jpqlandnativesql.entity.Employee;
import com.ttn.JPAWithHibernatePart2.Jpqlandnativesql.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
class JPAWithHibernatePart2ApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;
	@Test
	void contextLoads() {
	}

	@Test
	public void testCreateEmployee(){
		Employee employee = new Employee();
		employee.setAge(21);
		employee.setFirstName("Raj");
		employee.setLastName("Bhuva");
		employee.setSalary(10000);
		employeeRepository.save(employee);
	}

	@Test
	public void testFindEmployeesBySalaryGreaterThanAvgSalary(){
		List<Object[]> empAvgSalList = employeeRepository.findEmployeeAvgSalary();
		List<Object[]> empList = employeeRepository.findEmployeeBySalaryGreaterThanAvgSalary((Double)empAvgSalList.get(0)[0]);
		empList.forEach(employee-> System.out.println(employee[0]+" "+employee[1]));
	}

	@Test
	@Transactional
	@Rollback(false)
	public void testUpdateEmployeeSalaryIfSalaryLessThanAvgSalary(){
		List<Object[]> empAvgSalList = employeeRepository.findEmployeeAvgSalary();
		employeeRepository.updateEmployeeSalaryIfSalaryLessThanAvgSalary(10000, (Double) empAvgSalList.get(0)[0]);
	}

	@Test
	@Transactional
	@Rollback(true)
	public void testDeleteEmployeesWithMinSalary(){
		List<Object[]> empMinSalary = employeeRepository.findEmployeesWithMinSalary();
		employeeRepository.deleteEmployeesWithMinSalary((Double)empMinSalary.get(0)[0]);
	}

	@Test
	public void testFindEmployeeWithLastName(){
		List<Object[]> empList;
		empList = employeeRepository.findEmployeesWithLastName("Bhuva");
		empList.forEach(employee-> System.out.println(employee[0]+" "+employee[1]+" "+employee[2]));
	}

	@Test
	@Transactional
	@Rollback(true)
	public void testDeleteEmployeeWithAgeGreaterThan(){
		employeeRepository.deleteEmployeesWithAgeGreaterThan(45);
	}


}
