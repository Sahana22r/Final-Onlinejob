package com.cg.jobportal.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.jobportal.entity.Skill;
import com.cg.jobportal.entity.SkillExperience;
import com.cg.jobportal.exceptions.InvalidSkillExperienceException;
import com.cg.jobportal.repository.SkillExperienceRepository;
@Service
public class SkillExperienceServiceImpl implements SkillExperienceService{
	@Autowired
	private SkillExperienceRepository skillExperienceRepo;

	@Override
	public SkillExperience addSkill(SkillExperience skillexperience) throws InvalidSkillExperienceException {
		return skillExperienceRepo.save(skillexperience);
	}
}