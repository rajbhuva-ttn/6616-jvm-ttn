package com.ttn.JPAWithHibernatePart2.Jpqlandnativesql.repository;


import com.ttn.JPAWithHibernatePart2.Jpqlandnativesql.entity.EmbeddedEmployee;
import org.springframework.data.repository.CrudRepository;

public interface EmbeddedEmployeeRepository extends CrudRepository<EmbeddedEmployee,Integer> {

}