package com.ttn.JPAWithHibernatePart2.Jpqlandnativesql.repository;

import com.ttn.JPAWithHibernatePart2.Jpqlandnativesql.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //Querying 1 Query Database using JPQL
    @Query("SELECT firstName, lastName FROM Employee WHERE salary > :avgsalary ORDER BY age ASC, salary DESC")
    public List<Object[]> findEmployeeBySalaryGreaterThanAvgSalary(@Param("avgsalary") double avgSalary);

    //Querying Database using JPQL
    @Query("SELECT AVG(salary) FROM Employee")
    public List<Object[]> findEmployeeAvgSalary();

    //Querying Database using JPQL
    @Query("SELECT MIN(salary) FROM Employee")
    public List<Object[]> findEmployeesWithMinSalary();

    //Querying 2 Query Database using JPQL
    @Modifying
    @Query("UPDATE Employee SET salary = salary + :salary WHERE salary < :avgsalary")
    public void updateEmployeeSalaryIfSalaryLessThanAvgSalary(@Param("salary") double salary, @Param("avgsalary") double avgSalary);

    //Querying 3 Query Database using JPQL
    @Modifying
    @Query("DELETE FROM Employee WHERE salary = :minsalary")
    public void deleteEmployeesWithMinSalary(@Param("minsalary") double minSalary);



    /*
    Native SQL Query:
    1. Display the id, first name, age of all employees where last name ends with "singh"
    2. Delete all employees with age greater than 45(Should be passed as a parameter)
     */

    //Querying 1 Query Database using Native SQL
    @Query(value = "SELECT empId, empFirstName, empAge FROM employee WHERE empLastName=:lastname", nativeQuery = true)
    public List<Object[]> findEmployeesWithLastName(@Param("lastname") String lastName);

    //Querying 2 Query Database using Native SQL
    @Modifying
    @Query(value = "DELETE FROM employee WHERE empAge > :age", nativeQuery = true)
    public void deleteEmployeesWithAgeGreaterThan(@Param("age") int age);
}
