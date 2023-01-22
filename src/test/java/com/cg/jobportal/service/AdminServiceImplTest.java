package com.cg.jobportal.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.jobportal.entity.Admin;
import com.cg.jobportal.repository.AdminRepository;

@SpringBootTest
class AdminServiceImplTest {

	
	
	@Autowired
	AdminService adminService;
	
	@MockBean
	private AdminRepository adminRepository;
	
	@BeforeEach
	void setup() {
		Optional<Admin> admin = Optional.of(new Admin(1, "john", "doe", "johndoe", "john@123", "john1234"));
		Mockito.when(adminRepository.findById((long) 1)).thenReturn(admin);
	}

	@Test
	public void testGetStudentById() {
		String admin_name = "john";
		Admin admin = adminService.getAdminById();
		assertEquals(admin_name, admin.getFirstName());
	}
}
