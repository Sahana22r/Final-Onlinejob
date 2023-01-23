package com.cg.jobportal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cg.jobportal.entity.Skill;

import com.cg.jobportal.exceptions.InvalidSkillException;
import com.cg.jobportal.exceptions.SkillAlreadyExistsException;
import com.cg.jobportal.service.SkillService;

@RequestMapping("/Skill")
@RestController
public class SkillController {
	@Autowired
	private SkillService skillService;

	@PostMapping("/save")
	public ResponseEntity<Skill> saveSkill(Skill skill)throws SkillAlreadyExistsException {
		Skill save= skillService.saveSkill(skill);
		return new ResponseEntity<>(save, HttpStatus.CREATED);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Skill>> getAllSkills() {
		List<Skill> Skill = skillService.getAllSkills();
		return new ResponseEntity<>(Skill, HttpStatus.OK);
	}
	
	@GetMapping("/{skillId}")
	public ResponseEntity<Skill> getSkillById(@PathVariable long skillId) throws InvalidSkillException {
		Skill skill=skillService.getById(skillId);
		
		return new ResponseEntity<>(skill, HttpStatus.OK);
		
	}


	@DeleteMapping("/deleteSkill/{id}")
	public ResponseEntity<String> deleteSkillById(@PathVariable long id) throws InvalidSkillException {
		String msg = skillService.deleteSkill(id);
		return new ResponseEntity<String>(msg, HttpStatus.GONE);
	}
	
	@PutMapping("/updateSkill")
	public Skill updateSkill(@RequestBody Skill skill) throws InvalidSkillException {
			Skill up = skillService.updateSkill(skill);
			return up;
	}
}
