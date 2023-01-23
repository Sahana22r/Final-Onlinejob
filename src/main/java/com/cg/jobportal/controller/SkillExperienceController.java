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
import com.cg.jobportal.exceptions.InvalidSkillExperienceException;
import com.cg.jobportal.service.SkillExperienceService;

<<<<<<< HEAD

=======
/**********************************************************************************
 * @author sangeetha
 * Created Date: 23 January, 2023 
 * Description: This class is the controller for the SkillExperience module
 **********************************************************************************/
>>>>>>> 0afedd5f9c5b050f7184c8029eb6066d2b596b5e
@RestController

public class SkillExperienceController {
	
	@Autowired
	private SkillExperienceService skillExperienceService;

	/******************************************************************************
	 * @param skillexperience
	 * @return: Response Entity of object type 
	 * @throws InvalidSkillExperienceException
	 * @postmapping: Post mapping requests a body from the user which is then
	 *               persisted onto the database.
	 *****************************************************************************/
	@PostMapping("/addExperience")
	public ResponseEntity<SkillExperience> addSkillExperience(@RequestBody SkillExperience skillexperience) throws InvalidSkillExperienceException {
		
			SkillExperience experience=skillExperienceService.addSkill(skillexperience);
			return new ResponseEntity<SkillExperience>(experience, HttpStatus.OK);
	}

	/********************************************************************************
	 * @param id
	 * @return: Response Entity of object type 
	 * @throws InvalidSkillExperienceException
	 * @GetMapping: Get mapping expects a PathVariable to be passed which is then
	 *              used to return the entity object that is fetched from the
	 *              database.
	 *********************************************************************************/
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
