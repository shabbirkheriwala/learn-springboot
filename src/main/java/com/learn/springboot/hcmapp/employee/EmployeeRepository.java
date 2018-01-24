package com.learn.springboot.hcmapp.employee;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
/**
 * As a developer you write your repository interfaces,
 * including custom finder methods,
 * and Spring will provide the implementation automatically.
 */
}
