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

<<<<<<< HEAD
@RequestMapping("/Skill")
=======
/**********************************************************************
 * @author sangeetha
 * Created Date: 23 January, 2023  
 * Description: This class is the controller for the Recruiter module
 **********************************************************************/
>>>>>>> 0afedd5f9c5b050f7184c8029eb6066d2b596b5e
@RestController
public class SkillController {

	@Autowired
	private SkillService skillService;

<<<<<<< HEAD
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
		
=======
	/*************************************************************
	 * @param skill
	 * @return: Response Entity of Object type
	 * @throws InvalidSkillException
	 * @postmapping: Post mapping requests a body from the user which is then
	 *               persisted onto the database.
	 *************************************************************/
	@PostMapping("/addSkill")
	public ResponseEntity<Skill> saveSkill(@RequestBody Skill skill) throws InvalidSkillException {
		Skill savedskill = serv.saveSkill(skill);
		return new ResponseEntity<Skill>(savedskill, HttpStatus.CREATED);
	}

	@GetMapping("/allSkills")
	public ResponseEntity<List<Skill>> getAllSkills() throws InvalidSkillException {
		List<Skill> Skills = serv.getAllSkills();
		return new ResponseEntity<List<Skill>>(Skills, HttpStatus.OK);
	}

	/*******************************************************************
	 * @param id
	 * @return: Response Entity of Object type
	 * @throws InvalidSkillException
	 *******************************************************************/
	@GetMapping("/getSkills/{id}")
	public ResponseEntity<Optional<Skill>> getSkillById(@PathVariable long id) throws InvalidSkillException {
		Optional<Skill> std = serv.getSkillById(id);
		return new ResponseEntity<>(std, HttpStatus.OK);

>>>>>>> 0afedd5f9c5b050f7184c8029eb6066d2b596b5e
	}

	/*****************************************************************************
	 * @param id
	 * @return: Response Entity of Object type
	 * @throws InvalidSkillException
	 * @DeleteMapping: Delete mapping expects a PathVariable to be passed which is
	 *                 used to delete the object from the database.
	 ****************************************************************************/
	@DeleteMapping("/deleteSkill/{id}")
	public ResponseEntity<String> deleteSkillById(@PathVariable long id) throws InvalidSkillException {
		String msg = skillService.deleteSkill(id);
		return new ResponseEntity<String>(msg, HttpStatus.GONE);
	}

	/***********************************************************************
	 * @param skill
	 * @return Response Entity of Object type
	 * @throws InvalidSkillException 
	 * Description : This method updates the existing skill Application.
	 * @putmapping: Put mapping requests a body from the user which is then
	 *              persisted onto the database.
	 ***********************************************************************/
	@PutMapping("/updateSkill")
	public Skill updateSkill(@RequestBody Skill skill) throws InvalidSkillException {
<<<<<<< HEAD
			Skill up = skillService.updateSkill(skill);
			return up;
=======
		Skill up = serv.updateSkill(skill);
		return up;
>>>>>>> 0afedd5f9c5b050f7184c8029eb6066d2b596b5e
	}
}
