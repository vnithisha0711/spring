package com.cg.employees.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.employees.dto.EmployeeDTO;
import com.cg.employees.exceptions.EmployeeNotFoundException;
import com.cg.employees.exceptions.UsernameAlreadyExistsException;
import com.cg.employees.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	@PostMapping
	public ResponseEntity<EmployeeDTO> saveEmployee(@Valid @RequestBody EmployeeDTO employeeDTO) {
		if(service.getByUsername(employeeDTO.getUsername())) {
			throw new UsernameAlreadyExistsException("Username "+ employeeDTO.getUsername() + " already exsits");
		}
//		if(result.hasErrors()) {
//			throw new InvalidDataException("Employee Data is not Valid");
//		}
		EmployeeDTO employee=service.saveEmployee(employeeDTO);
		return ResponseEntity.ok(employee);
		//service.saveEmployee(employeeDTO);
		//return employeeDTO;
	}

	//http://localhost:9091/api/employees/1
	@GetMapping("/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable int id) {
		EmployeeDTO dto=service.getById(id);
		if(dto!=null) {
			return new ResponseEntity<EmployeeDTO>(dto, HttpStatus.FOUND);
		}
		throw new EmployeeNotFoundException("Employee with id " +id+"doesnot exist");
		//return new ResponseEntity<String>("the employees id " + id + " doesnot exsits", HttpStatus.NOT_FOUND);
	}
	
	//http://localhost:9091/api/employees
	@GetMapping
	public ResponseEntity<List<EmployeeDTO>> getAllEmployees() {
		List<EmployeeDTO> list = service.findAll();
		//return List;
		return new ResponseEntity<List<EmployeeDTO>>(list, HttpStatus.FOUND);
	}
	
	//http://localhost:9091/api/employees/1
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable int id) {
		EmployeeDTO dto=service.getById(id);
		if(dto!=null) {
			return new ResponseEntity<Boolean>(service.deleteEmployee(dto), HttpStatus.OK);
		}
		throw new EmployeeNotFoundException("Employee with id " +id+"doesnot exist");
		//return new ResponseEntity<String>("the employees id " + id + " doesnot exsits", HttpStatus.NOT_FOUND);
		//return service.deleteEmployee(employeeDTO);
		
	}
	
	//http://localhost:9091/api/employees
	@PutMapping
	public ResponseEntity<EmployeeDTO> updateEmployee(@RequestBody EmployeeDTO dto) {
		 return new ResponseEntity<EmployeeDTO>(service.updateEmployee(dto), HttpStatus.ACCEPTED);
		//service.updateEmployee(dto);
		//return dto;
	}
}
