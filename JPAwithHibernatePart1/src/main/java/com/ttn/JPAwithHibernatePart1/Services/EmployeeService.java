package com.ttn.JPAwithHibernatePart1.Services;

import com.ttn.JPAwithHibernatePart1.entity.Employee;
import com.ttn.JPAwithHibernatePart1.repository.EmployeeRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    @Autowired 
    EmployeeRepository repository;

    public Iterable<Employee> findAllEmployees(){
        Iterable<Employee> result = repository.findAll();
        return result;
    }
    public Employee createEmployee(Employee employee){
        
        return repository.save(employee);               
    }                                                   
    public Employee updateEmployee(int id, Employee employee){
       
        Employee employee1 = repository.findById(id).get();
        employee1.setName(employee.getName());
        employee1.setAge(employee.getAge());
        employee1.setLocation(employee.getLocation());
        return repository.save(employee1);
    }

    public String removeEmployee(int id){
        repository.deleteById(id);
        return "Employee Deleted";
    }

    public int countEmployees(){
        return (int)repository.count();
    }

    public List<Employee> findByName(String name){
        return repository.findByName(name);
    }

    public List<Employee> findNameStartingWith(String firstChar){
        return repository.findByNameStartingWith(firstChar);
    }

    public List<Employee> findEmployeeBetweenAge(){
        return repository.findByAgeBetween(28,32);
    }

    public Page<Employee> findEmployeeSortByAgeAndPagination(int pageNumber){
        Pageable pageable = PageRequest.of(pageNumber-1,1, Sort.by(new Sort.Order(null, "name")));
        Page<Employee> result = repository.findAll(pageable);
        return result;
    }
}
