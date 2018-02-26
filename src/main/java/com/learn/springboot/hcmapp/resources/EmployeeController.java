package com.learn.springboot.hcmapp.resources;

import com.learn.springboot.hcmapp.model.Employee;
import com.learn.springboot.hcmapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/all")
	public @ResponseBody Iterable<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@PreAuthorize("hasAnyRole('ADMIN')")
	@GetMapping("/secured/alladmin")
	public @ResponseBody Iterable<Employee> getAllEmployeesSecuredAdmin() {
		return employeeRepository.findAll();
	}

	@PreAuthorize("hasAnyRole('USER')")
	@GetMapping("/secured/alluser")
	public @ResponseBody Iterable<Employee> getAllEmployeesSecuredUser() {
		return employeeRepository.findAll();
	}

	@RequestMapping(method=RequestMethod.POST, value="/add")
	public @ResponseBody String addNewEmployee (@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return "Employee Saved";
	}
}
