package com.ttn.JPAwithHibernatePart1.repository;

import com.ttn.JPAwithHibernatePart1.entity.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
    @Override
    Optional<Employee> findById(Integer integer);
    public List<Employee> findByName(String name);
    public List<Employee> findByNameStartingWith(String name);
    public List<Employee> findByAge(int age);
    public List<Employee> findByAgeBetween(int startAge,int endAge);

}
