package com.cg.employees.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.employees.entity.Skills;
@Repository
public interface SkillsRepository extends CrudRepository<Skills, Integer>{

	List<Skills> findByEmployeeId(Integer id);
	List<Skills> findByName(String name);
}
