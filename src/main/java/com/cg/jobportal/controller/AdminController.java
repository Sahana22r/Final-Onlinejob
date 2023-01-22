package com.cg.jobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.jobportal.entity.Admin;
import com.cg.jobportal.exceptions.AdminAlreadyExistException;
import com.cg.jobportal.exceptions.InvalidAdminException;
import com.cg.jobportal.service.AdminService;

@RequestMapping("/Admin")
@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/loginAdmin")
	public ResponseEntity<String> loginAdmin(@RequestBody Admin admin){
		String login=adminService.loginAdmin(admin);
		return new ResponseEntity<>(login,HttpStatus.OK);
	}

	@PostMapping("/save")
	public ResponseEntity<Admin> saveAdmin(Admin admin)throws AdminAlreadyExistException{
		Admin save=adminService.saveAdmin(admin);
		return new ResponseEntity<>(save,HttpStatus.CREATED);
		
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<Admin>> getAllAdmins(){
		List<Admin> Admin=adminService.getAllAdmins();
		return new ResponseEntity<>(Admin, HttpStatus.OK);
	}
	

	@GetMapping("/getAdmin/{adminId}")
	public ResponseEntity<Admin> getAdminById(@PathVariable long adminId) throws InvalidAdminException{
		Admin admin=adminService.getAdminById(adminId);
		return null;
	}
	@GetMapping("/{adminId}")
	public ResponseEntity<Admin> getAdminById(@PathVariable long adminId) throws InvalidAdminException{
		Admin admin=adminService.getAdminById(adminId);

		return new ResponseEntity<>(admin, HttpStatus.OK);
		
	}
	
	@PutMapping("/{adminId}")
	public ResponseEntity<Admin> updateAdmin(@PathVariable long adminId, @RequestBody Admin admin) throws InvalidAdminException{
		Admin update=adminService.updateAdmin(adminId,admin);
		return new ResponseEntity<>(update, HttpStatus.ACCEPTED);
		
	}
}
