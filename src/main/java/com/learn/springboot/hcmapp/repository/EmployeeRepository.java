package com.learn.springboot.hcmapp.repository;

import com.learn.springboot.hcmapp.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
