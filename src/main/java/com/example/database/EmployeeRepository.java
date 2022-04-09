package com.example.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByNameEqualsIgnoreCase(String name);


    @Query("select count(e) from Employee e")
    Long employeeCount();
}