package com.cg.jobportal.service;



import com.cg.jobportal.entity.Skill;
import com.cg.jobportal.entity.SkillExperience;

public interface SkillExperienceService {

	SkillExperience addSkill(SkillExperience skillexperience);

	Object getById(long id);

	Skill updateSkill(long skill);
	
	Object deleteById(long id);

	String deleteSkill(long id);

}
	


