package com.cg.jobportal.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.jobportal.entity.Skill;
import com.cg.jobportal.entity.SkillExperience;
import com.cg.jobportal.exceptions.InvalidSkillException;
import com.cg.jobportal.exceptions.InvalidSkillExperienceException;
import com.cg.jobportal.service.SkillExperienceService;


@RestController

public class SkillExperienceController {
	
	@Autowired
	private SkillExperienceService skillExperienceService;

	@PostMapping("/addExperience")
	public ResponseEntity<SkillExperience> addSkillExperience(@RequestBody SkillExperience skillexperience) throws InvalidSkillExperienceException {
		
			SkillExperience experience=skillExperienceService.addSkill(skillexperience);
			return new ResponseEntity<SkillExperience>(experience, HttpStatus.OK);
	}

	@GetMapping("/getExperience/{id}")
	public ResponseEntity<Object> getById(@PathVariable long id)throws InvalidSkillExperienceException {
	
			return new ResponseEntity<>(skillExperienceService.getById(id), HttpStatus.OK);
	}	
	

	@DeleteMapping("/deleteSkill/{id}")
	public ResponseEntity<String> deleteSkillById(@PathVariable long id) throws InvalidSkillExperienceException {
		String msg = skillExperienceService.deleteSkill(id);
		return new ResponseEntity<>(skillExperienceService.deleteSkill(id), HttpStatus.GONE);
	}
	
	@PutMapping("/updateSkill")
	public Skill updateSkill(@RequestBody long skill) throws InvalidSkillExperienceException {
			Skill up = skillExperienceService.updateSkill(skill);
			return up;
	
	
}
