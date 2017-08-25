package com.javabeat.mvc;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javabeat.mvc.model.Employee;
import com.javabeat.mvc.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	@Transactional
    public Employee save(@NotNull @Valid final Employee employee) {
        return repository.save(employee);
    }

    @Transactional(readOnly = true)
    public List<Employee> getList() {
        return repository.findAll();
    }
}
