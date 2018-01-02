package com.learn.springboot.hcmapp.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/all")
	public @ResponseBody Iterable<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/add")
	public @ResponseBody String addNewUser (@RequestBody Employee employee) {
//		Employee employee = new Employee();
//		employee.setFname(fname);
//		employee.setLname(lname);
		employeeRepository.save(employee);
		return "Saved";
	}
}
