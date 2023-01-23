package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.cg.jobportal.entity.Skill;
import com.cg.jobportal.exceptions.InvalidSkillException;
import com.cg.jobportal.exceptions.SkillAlreadyExistsException;

import jakarta.validation.Valid;

public interface SkillService {

	Skill saveSkill(@Valid Skill skill) throws SkillAlreadyExistsException;

	List<Skill> getAllSkills() ;
	
	Skill updateSkill(Skill skill) throws InvalidSkillException;

	Skill getById(long skillId) throws InvalidSkillException;

	String deleteSkill(long skillId);

}
