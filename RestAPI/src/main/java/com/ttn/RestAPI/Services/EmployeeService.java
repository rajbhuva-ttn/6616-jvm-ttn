package com.ttn.RestAPI.Services;

import com.ttn.RestAPI.Employee;
import com.ttn.RestAPI.Exceptions.EmpNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class EmployeeService {
    private static List<Employee> employees = new ArrayList<>();
    private static int idCounter = 0;

    static {
        employees.add(new Employee(++idCounter, "Raj Bhuva", 21));
        employees.add(new Employee(++idCounter, "Mohit Ramtari ", 21));
        employees.add(new Employee(++idCounter, "Ayush Jain", 22));
    }

    public List<Employee> getEmployeeList() {
        return employees;
    }

    public Employee getOneEmployee(int id) {
        Predicate<? super Employee> Predicate = employee -> employee.getId() == id;
        return employees.stream().filter(Predicate).findFirst().orElseThrow(() -> new EmpNotFoundException("Employee not found with id: " + id));
    }

    public void save(Employee employee) {
        employee.setId(++idCounter);
        employees.add(employee);
//        return employee;
    }

    public void delete(int id) {


        Predicate<? super Employee> Predicate = employee -> employee.getId() == id;
        Employee emp = employees.stream().filter(Predicate).findAny()
                .orElseThrow(() -> new EmpNotFoundException("Employee does not exist: " + id));
        employees.remove(emp.getId());
    }

    public Employee update(int id, Employee employee) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                e.setAge(employee.getAge());
                e.setName(employee.getName());

            } else {
                throw new EmpNotFoundException("Employee wrong record");
            }
        }

        return employee;
    }
}
