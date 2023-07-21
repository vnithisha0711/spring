package com.cg.employees.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.employees.dto.SkillsDTO;
import com.cg.employees.entity.Skills;
import com.cg.employees.exceptions.SkillNotFoundException;
import com.cg.employees.repository.SkillsRepository;
import com.cg.employees.service.SkillsService;

@Service
public class SkillsServiceImpl implements SkillsService{

	@Autowired
	private SkillsRepository skillsRepository;
	
	@Override
	public SkillsDTO addSkill(SkillsDTO skillsDTO) {
		Skills skills=new Skills();
		BeanUtils.copyProperties(skillsDTO, skills);
		skillsRepository.save(skills);
		return skillsDTO;
	}

	@Override
	public SkillsDTO updateSkills(SkillsDTO skillsDTO) {
		Skills skills=new Skills();
		BeanUtils.copyProperties(skillsDTO, skills);
		skillsRepository.save(skills);
		return skillsDTO;
		
	}

	@Override
	public Boolean deleteSkills(SkillsDTO skillsDTO) {
		Skills skills=new Skills();
		BeanUtils.copyProperties(skillsDTO, skills);
		skillsRepository.delete(skills);
		return true;
		
	}

	@Override
	public SkillsDTO getById(Integer id) {
		Optional<Skills> skill = skillsRepository.findById(id);
		if(skill.isPresent()) {
			SkillsDTO dto=new SkillsDTO();
			BeanUtils.copyProperties(skill.get(), dto);
			return dto;
		}
		throw new SkillNotFoundException("Skill with "+id+ " doesnot exists");

	}

	@Override
	public List<SkillsDTO> findAll() {
		List<Skills> skills=(List<Skills>) skillsRepository.findAll();
		List<SkillsDTO> dtos=new ArrayList<>();
		for(Skills skill : skills) {
			SkillsDTO dto=new SkillsDTO();
			BeanUtils.copyProperties(skill, dto);
			dtos.add(dto);
		}
		return dtos;
	}

	@Override
	
	public List<SkillsDTO> findSkillsByEmployeeId(Integer id) {
		
		List<Skills> skills=skillsRepository.findByEmployeeId(id);
		List<SkillsDTO> dtos=new ArrayList<>();
		for(Skills skill : skills) {
			SkillsDTO dto=new SkillsDTO();
			BeanUtils.copyProperties(skill, dto);
			dtos.add(dto);
		}
		return dtos;
	}

	@Override
	public boolean findSkillsByName(String name) {
		List<Skills> list = skillsRepository.findByName(name);
		if(list.size()>0) {
			return true;
		}
		return false;
	}

}
