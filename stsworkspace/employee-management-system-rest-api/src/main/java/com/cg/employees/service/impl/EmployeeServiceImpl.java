package com.cg.employees.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.employees.dto.EmployeeDTO;
import com.cg.employees.entity.Employee;
import com.cg.employees.repository.EmployeeRepository;
import com.cg.employees.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {
		// convert the DTO in the entity object
		Employee employee = new Employee(); // empty entity object
		BeanUtils.copyProperties(employeeDTO, employee);
		repository.save(employee);
		return employeeDTO;
	}

	@Override
	public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO) {
		// convert the DTO in the entity object
		Employee employee = new Employee(); // empty entity object
		BeanUtils.copyProperties(employeeDTO, employee);
		repository.save(employee);
		return employeeDTO;
	}

	@Override
	public boolean deleteEmployee(EmployeeDTO employeeDTO) {
		Employee employee = new Employee(); // empty entity object
		BeanUtils.copyProperties(employeeDTO, employee);
		repository.delete(employee);
		return true;
	}

	@Override
	public EmployeeDTO getById(int id) {
		Optional<Employee> employee=repository.findById(id);
		if(employee.isPresent()) {
			//convert the entity to DTO
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(employee.get(), dto);
			return dto;
		}
		return null;
	}

	@Override
	public List<EmployeeDTO> findAll() {
		Iterable<Employee> list = repository.findAll();
		List<EmployeeDTO> dtos=new ArrayList<>();
		for(Employee emp: list) {
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(emp, dto);
			dtos.add(dto);
		}
		return dtos;
	}

	@Override
	public Boolean getByUsername(String username) {
		if(repository.findByUsername(username)!=null) {
			return true;
		}
		return false;
	}


}
