package com.cg.employees.repository;

//import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.employees.entity.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	Employee findByUsername(String username);
	
}
