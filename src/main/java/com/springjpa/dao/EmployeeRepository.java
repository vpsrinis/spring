package com.springjpa.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springjpa.model.Employee;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    List<Employee> findByEmail(String email);

    @Query("select e from Employee e where e.email = :email")
    Stream<Employee> findByEmailReturnStream(@Param("email") String email);

    List<Employee> findByDateOfBirth(Date date);

    //@Query("select c from Customer c")
    //Stream<Customer> findAllAndStream();

    //List<Customer> findByDateBetween(Date from, Date to);

}
