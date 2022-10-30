package com.ttn.JPAwithHibernatePart1.Controller;

import com.ttn.JPAwithHibernatePart1.Services.EmployeeService;
import com.ttn.JPAwithHibernatePart1.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/employees")
    public Iterable<Employee> getAllEmployees(){
        return employeeService.findAllEmployees();
    }

    @PostMapping(path = "/employees")
    public Employee addEmployees(@RequestBody Employee employee){
        Employee emp = employeeService.createEmployee(employee);
        return emp;
    }

    @PutMapping(path = "/employees/{id}/update")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id,employee);
    }

    @DeleteMapping(path = "/employees/{id}/delete")
    public String deleteEmployee(@PathVariable int id){
        return employeeService.removeEmployee(id);
    }

    @GetMapping(path = "/employees/count")
    public long getEmployeeCount(){
        return employeeService.countEmployees();
    }

    @GetMapping(path = "/employees/{name}")
    public List<Employee> getEmployeesByName(@PathVariable String name){
        return employeeService.findByName(name);
    }

    @GetMapping(path = "/employees/namestartingwith/{firstChar}")
    public List<Employee> getEmployeesByNameWithStartLetterA(@PathVariable String firstChar){
        return employeeService.findNameStartingWith(firstChar);
    }

    @GetMapping(path = "/employees/agebetween28and32")
    public List<Employee> getEmployeesByAgeBetween(){
        return employeeService.findEmployeeBetweenAge();
    }

    @GetMapping(path = "/employees/pages/{pageNumber}")
    public Page<Employee> getEmployeesByAgeAndPage(@PathVariable int pageNumber){
        return employeeService.findEmployeeSortByAgeAndPagination(pageNumber);
    }

}
