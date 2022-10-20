package com.ttn.RestAPI.Controller;

import com.ttn.RestAPI.Employee;
import com.ttn.RestAPI.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }

    @RequestMapping(method = RequestMethod.GET, path = "/index")
    public String Welcome() {
        return "Welcome to Spring boot";
    }

    @GetMapping(path = "employees")
    public List<Employee> getEmployee() {
        return employeeService.getEmployeeList();
    }

    @GetMapping(path = "employees/{id}")
    public Employee getOneEmployee(@PathVariable int id) {
        return employeeService.getOneEmployee(id);
    }

    @PostMapping(path = "employees/add")
    public String createNewEmployee(@Valid @RequestBody Employee employee) {
        employeeService.save(employee);
        return "Employee Created";
    }

    @DeleteMapping(path = "employees/{id}/delete")
    public String deleteEmployee(@RequestBody int id) {
        employeeService.delete(id);
        return "Employee Deleted";
    }

    @PutMapping(path = "update/{id}")
    public void updateEmployee(@Valid @PathVariable int id, @RequestBody Employee employee) {
        Employee result = employeeService.update(id, employee);
        System.out.println(result);
    }


}
