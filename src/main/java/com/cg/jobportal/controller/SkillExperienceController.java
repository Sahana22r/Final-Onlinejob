package com.cg.jobportal.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.jobportal.entity.SkillExperience;
import com.cg.jobportal.exceptions.InvalidSkillException;
import com.cg.jobportal.exceptions.InvalidSkillExperienceException;
import com.cg.jobportal.service.SkillExperienceService;
@RestController
public class SkillExperienceController {
	
	@Autowired
	private SkillExperienceService skillExServ;

	@PostMapping("/addExperience")
	public ResponseEntity<SkillExperience> addSkillExperience(@RequestBody SkillExperience skillexperience) throws InvalidSkillExperienceException {
		
			SkillExperience exp=skillExServ.addSkill(skillexperience);
			return new ResponseEntity<SkillExperience>(exp, HttpStatus.OK);
	}

	@GetMapping("/getExperience/{id}")
	public ResponseEntity<Object> getById(@PathVariable long id)throws InvalidSkillExperienceException {
	
			return new ResponseEntity<>(skillExServ.getById(id), HttpStatus.OK);
	}	
	
	
}
