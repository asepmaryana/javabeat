package com.javabeat.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javabeat.mvc.EmployeeService;
import com.javabeat.mvc.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
    public List<Employee> listEmployees() {
        List<Employee> employees = employeeService.getList();
        return employees;
    }
	
    @RequestMapping(value="/add", method = RequestMethod.GET)
    public void addEmployee(@RequestParam(value = "employeeName", required = false) String employeeName,
    		@RequestParam(value = "employeeId", required = false) String employeeId,
    		@RequestParam(value = "employeeCity", required = false) String employeeCity){
    	Employee employee = new Employee(employeeId,employeeName,employeeCity);
    	employeeService.save(employee);
    }
}
