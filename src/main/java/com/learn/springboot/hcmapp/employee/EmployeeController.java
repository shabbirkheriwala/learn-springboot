package com.learn.springboot.hcmapp.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/all")
	public @ResponseBody Iterable<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@GetMapping("/secured/all")
	public @ResponseBody Iterable<Employee> getAllEmployeesSecured() {
		return employeeRepository.findAll();
	}

	@RequestMapping(method=RequestMethod.POST, value="/secured/add")
	public @ResponseBody String addNewUser (@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return "Saved";
	}
}
