package com.cg.employees.service;

import java.util.List;

import com.cg.employees.dto.EmployeeDTO;

public interface EmployeeService {
	
	public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);
	public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO);
	public boolean deleteEmployee(EmployeeDTO employeeDTO);
	public EmployeeDTO getById(int id);
	public Boolean getByUsername(String username);
	
	public List<EmployeeDTO> findAll();

	
}
