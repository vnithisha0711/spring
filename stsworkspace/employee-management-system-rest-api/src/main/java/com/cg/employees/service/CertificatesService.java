package com.cg.employees.service;

import java.util.List;

import com.cg.employees.dto.CertificatesDTO;
import com.cg.employees.dto.EmployeeDTO;

public interface CertificatesService {
	
	public CertificatesDTO addCertificate(CertificatesDTO certificatesDTO);
	public CertificatesDTO updateCertificate(CertificatesDTO certificatesDTO);
	public boolean deleteCertificate(CertificatesDTO certificatesDTO);
	public CertificatesDTO getById(int id);
	
	//public Boolean getByUsername(String username);
	
	public List<CertificatesDTO> findAll();
	public List<CertificatesDTO> findCertificatesByEmployeeId(Integer id);

}
