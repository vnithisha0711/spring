package com.cg.employees.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.employees.dto.CertificatesDTO;
import com.cg.employees.dto.SkillsDTO;
import com.cg.employees.entity.Certificates;
import com.cg.employees.entity.Skills;
import com.cg.employees.exceptions.CertificatesNotFoundException;
import com.cg.employees.exceptions.SkillNotFoundException;
import com.cg.employees.repository.CertificateRepository;
import com.cg.employees.service.CertificatesService;

@Service
public class CertificatesServiceImpl implements CertificatesService{
	
	@Autowired
	private CertificateRepository repository;

	@Override
	public CertificatesDTO addCertificate(CertificatesDTO certificatesDTO) {
		Certificates certificates=new Certificates();
		certificatesDTO.setScorePercentage(certificatesDTO.getScore()*100/certificatesDTO.getMaxScore());
		BeanUtils.copyProperties(certificatesDTO, certificates);
		repository.save(certificates);
		return certificatesDTO;
	
	}

	@Override
	public CertificatesDTO updateCertificate(CertificatesDTO certificatesDTO) {
		Certificates certificates=new Certificates();
		BeanUtils.copyProperties(certificatesDTO, certificates);
		repository.save(certificates);
		return certificatesDTO;
		
	}

	@Override
	public boolean deleteCertificate(CertificatesDTO certificatesDTO) {
		Certificates certificates=new Certificates();
		BeanUtils.copyProperties(certificatesDTO, certificates);
		repository.delete(certificates);
		return true;
	}

	@Override
	public CertificatesDTO getById(int id) {
		Optional<Certificates> certificate = repository.findById(id);
		if(certificate.isPresent()) {
			CertificatesDTO dto=new CertificatesDTO();
			BeanUtils.copyProperties(certificate.get(), dto);
			return dto;
		}
		throw new CertificatesNotFoundException("Certificate with "+id+ " doesnot exists");
	}


	@Override
	public List<CertificatesDTO> findAll() {
		List<Certificates> certificates=(List<Certificates>) repository.findAll();
		List<CertificatesDTO> dtos=new ArrayList<>();
		for(Certificates certificate : certificates) {
			CertificatesDTO dto=new CertificatesDTO();
			BeanUtils.copyProperties(certificate, dto);
			dtos.add(dto);
		}
		return dtos;
		
	}


	@Override
	public List<CertificatesDTO> findCertificatesByEmployeeId(Integer id) {
		
		List<Certificates> certificates=repository.findByEmployeeId(id);
		List<CertificatesDTO> dtos=new ArrayList<>();
		for(Certificates certificate : certificates) {
			CertificatesDTO dto=new CertificatesDTO();
			BeanUtils.copyProperties(certificate, dto);
			dtos.add(dto);
		}
		return dtos;
	}

}
