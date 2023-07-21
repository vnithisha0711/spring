package com.cg.employees.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.employees.dto.CertificatesDTO;
import com.cg.employees.dto.EmployeeDTO;
import com.cg.employees.dto.SkillsDTO;
import com.cg.employees.exceptions.CertificatesNotFoundException;
import com.cg.employees.exceptions.EmployeeNotFoundException;
import com.cg.employees.exceptions.SkillNotFoundException;
import com.cg.employees.service.CertificatesService;
import com.cg.employees.service.EmployeeService;
import com.cg.employees.service.SkillsService;

@RestController
@RequestMapping("/api/certificates")
public class CertificatesController {
	
	@Autowired
	private CertificatesService certificatesService;
	
	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private SkillsService skillsService;
	
	@PostMapping
	public ResponseEntity<CertificatesDTO> addCertificate(@RequestBody CertificatesDTO certificatesDTO){
		if((employeeService.getById(certificatesDTO.getEmployeeId()) != null)) {
			if(skillsService.findSkillsByName(certificatesDTO.getSkillName())) {
			return ResponseEntity.ok(certificatesService.addCertificate(certificatesDTO));
		}
			throw new SkillNotFoundException("Skill with id "+certificatesDTO.getSkillName()+"doesnot exists");
		}
		throw new EmployeeNotFoundException("Employee with id "+certificatesDTO.getEmployeeId() +"doesnot exists");
		
//		EmployeeDTO employeeDTO=employeeService.getById(certificatesDTO.getEmployeeId());
//		if(employeeDTO!=null) {
//			CertificatesDTO certificate=certificatesService.addCertificate(certificatesDTO);
//			return ResponseEntity.ok(certificate);
//		}
//		throw new EmployeeNotFoundException("employee with id "+ certificatesDTO.getEmployeeId() + "doesnot exsits");
		//return ResponseEntity.ok(service.addSkill(skillsDTO));
	}

	@GetMapping("/{id}")
	public ResponseEntity<CertificatesDTO> getCertificatesById(@PathVariable int id){
		CertificatesDTO certificatesDTO=certificatesService.getById(id);
		return new ResponseEntity<CertificatesDTO>(certificatesDTO, HttpStatus.FOUND);
	}
	
	@PutMapping
	public ResponseEntity<CertificatesDTO> updateCertificate(@RequestBody CertificatesDTO certificatesDTO){
		EmployeeDTO employeeDTO=employeeService.getById(certificatesDTO.getEmployeeId());
		if(employeeDTO!=null) {
			CertificatesDTO certificate=certificatesService.updateCertificate(certificatesDTO);
			return ResponseEntity.ok(certificate);
		}
		throw new EmployeeNotFoundException("employee with id "+ certificatesDTO.getEmployeeId() + "doesnot exsits");
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteCertificatesById(@PathVariable int id){
		CertificatesDTO certificatesDTO=certificatesService.getById(id);
		if(certificatesDTO!=null) {
			certificatesService.deleteCertificate(certificatesDTO);
			return new ResponseEntity<Boolean>(true, HttpStatus.ACCEPTED);
		}
		throw new CertificatesNotFoundException("Skill with id " +id+ "doesnot exists");
	}
	
	@GetMapping
	public ResponseEntity<List<CertificatesDTO>> getAllCertificates(){
		List<CertificatesDTO> list=certificatesService.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping("/employee/{employeeId}")
	public ResponseEntity<List<CertificatesDTO>> getAllCertificatesByEmployee(@PathVariable("employeeId") Integer id){
		
		List<CertificatesDTO> list=certificatesService.findCertificatesByEmployeeId(id);
		return ResponseEntity.ok(list);
	}
}
