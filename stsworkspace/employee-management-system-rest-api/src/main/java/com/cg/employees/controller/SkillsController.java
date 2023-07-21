package com.cg.employees.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.employees.dto.EmployeeDTO;
import com.cg.employees.dto.SkillsDTO;
import com.cg.employees.exceptions.EmployeeNotFoundException;
import com.cg.employees.exceptions.SkillNotFoundException;
import com.cg.employees.service.EmployeeService;
import com.cg.employees.service.SkillsService;

@RestController
@RequestMapping("/api/skills")
public class SkillsController {
	
	@Autowired
	private SkillsService skillsService;
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public ResponseEntity<SkillsDTO> addSkill(@RequestBody SkillsDTO skillsDTO){
		EmployeeDTO employeeDTO=employeeService.getById(skillsDTO.getEmployeeId());
		if(employeeDTO!=null) {
			SkillsDTO skill=skillsService.addSkill(skillsDTO);
			return ResponseEntity.ok(skill);
		}
		throw new EmployeeNotFoundException("employee with id "+ skillsDTO.getEmployeeId() + "doesnot exsits");
		//return ResponseEntity.ok(service.addSkill(skillsDTO));
	}

	@GetMapping("/{id}")
	public ResponseEntity<SkillsDTO> getSkillById(@PathVariable int id){
		SkillsDTO skillsDTO=skillsService.getById(id);
		return new ResponseEntity<SkillsDTO>(skillsDTO, HttpStatus.FOUND);
	}
	
	@PutMapping
	public ResponseEntity<SkillsDTO> updateSkills(@RequestBody SkillsDTO skillsDTO){
		EmployeeDTO employeeDTO=employeeService.getById(skillsDTO.getEmployeeId());
		if(employeeDTO!=null) {
			SkillsDTO skill=skillsService.updateSkills(skillsDTO);
			return ResponseEntity.ok(skill);
		}
		throw new EmployeeNotFoundException("employee with id "+ skillsDTO.getEmployeeId() + "doesnot exsits");
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteSkillById(@PathVariable int id){
		SkillsDTO skillsDTO=skillsService.getById(id);
		if(skillsDTO!=null) {
			skillsService.deleteSkills(skillsDTO);
			return new ResponseEntity<Boolean>(true, HttpStatus.ACCEPTED);
		}
		throw new SkillNotFoundException("Skill with id " +id+ "doesnot exists");
	}
	
	@GetMapping
	public ResponseEntity<List<SkillsDTO>> getAllSkills(){
		List<SkillsDTO> list=skillsService.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping("/employee/{employeeId}")
	public ResponseEntity<List<SkillsDTO>> getAllSkillsByEmployee(@PathVariable("employeeId") Integer id){
		
		List<SkillsDTO> list=skillsService.findSkillsByEmployeeId(id);
		return ResponseEntity.ok(list);
	}
}
