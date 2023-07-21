package com.cg.employees.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.employees.entity.Certificates;

@Repository
public interface CertificateRepository extends CrudRepository<Certificates, Integer>{

	List<Certificates> findByEmployeeId(Integer id);
	
}
