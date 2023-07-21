package com.cg.employees.service;

import java.util.List;

import com.cg.employees.dto.SkillsDTO;

public interface SkillsService {
	
	public SkillsDTO addSkill(SkillsDTO skillsDTO);
	public SkillsDTO updateSkills(SkillsDTO skillsDTO);
	public Boolean deleteSkills(SkillsDTO skillsDTO);
	public SkillsDTO getById(Integer id);
	
	public List<SkillsDTO> findAll();

	public List<SkillsDTO> findSkillsByEmployeeId(Integer id);
	public boolean findSkillsByName(String name);
}
