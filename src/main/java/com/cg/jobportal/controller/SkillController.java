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
import org.springframework.web.bind.annotation.RestController;


import com.cg.jobportal.entity.Skill;

import com.cg.jobportal.exceptions.InvalidSkillException;
import com.cg.jobportal.service.SkillService;
@RestController
public class SkillController {
	@Autowired
	private SkillService serv;

	@PostMapping("/addSkill")
	public ResponseEntity<Skill> saveSkill(@RequestBody Skill skill) throws InvalidSkillException {
		Skill savedskill = serv.saveSkill(skill);
		return new ResponseEntity<Skill>(savedskill, HttpStatus.CREATED);
	}

	@GetMapping("/allSkills")
	public ResponseEntity<List<Skill>> getAllSkills() throws InvalidSkillException{
		List<Skill> Skills = serv.getAllSkills();
		return new ResponseEntity<List<Skill>>(Skills, HttpStatus.OK);
	}
	
	@GetMapping("/getSkills/{id}")
	public ResponseEntity<Optional<Skill>> getSkillById(@PathVariable long id) throws InvalidSkillException {
		Optional<Skill> std=serv.getSkillById(id);
		return new ResponseEntity<>(std, HttpStatus.OK);
		
	}


	@DeleteMapping("/deleteSkill/{id}")
	public ResponseEntity<String> deleteSkillById(@PathVariable int id) throws InvalidSkillException {
		String msg = serv.deleteSkill(id);
		return new ResponseEntity<String>(msg, HttpStatus.GONE);
	}
	
	@PutMapping("/updateSkill")
	public Skill updateSkill(@RequestBody Skill skill) throws InvalidSkillException {
			Skill up = serv.updateSkill(skill);
			return up;
	}
}
