package com.cg.employees.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cg.employees.entity.Employee;
import com.cg.employees.repository.EmployeeRepository;
import com.cg.employees.service.EmployeeService;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Employee employee=repository.findByUsername(username);
		return new User(employee.getUsername(),employee.getPassword(), new ArrayList<>());
						
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
