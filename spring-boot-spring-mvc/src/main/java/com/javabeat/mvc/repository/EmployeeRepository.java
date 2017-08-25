package com.javabeat.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javabeat.mvc.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
