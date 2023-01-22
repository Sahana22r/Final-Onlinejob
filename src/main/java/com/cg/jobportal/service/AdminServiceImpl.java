package com.cg.jobportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.jobportal.entity.Admin;
import com.cg.jobportal.exceptions.AdminAlreadyExistException;
import com.cg.jobportal.exceptions.InvalidAdminException;
import com.cg.jobportal.repository.AdminRepository;


@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Admin saveAdmin(Admin admin) throws AdminAlreadyExistException {
		if (adminRepository.existsByUserName(admin.getUserName())) {
			throw new AdminAlreadyExistException();
		}
		return adminRepository.save(admin);
	}

	@Override
	public List<Admin> getAllAdmins() {
		return adminRepository.findAll();
	}

	@Override
	public Admin getAdminById(long adminId) throws InvalidAdminException {

		if (repo.findById(adminId) != null) {
			return repo.findById(adminId);

		if (adminRepository.existsById(adminId)) {
			return adminRepository.findById(adminId).get();

		} else {
			throw new InvalidAdminException();
		}
	}

	@Override
	public Admin updateAdmin(long adminId, Admin admin) throws InvalidAdminException {
		if (adminRepository.existsById(adminId)) {
			return adminRepository.save(admin);
		}else {
			throw new InvalidAdminException();
		}
		
	}

	@Override
	public String loginAdmin(Admin admin) {
		List<Admin> a = adminRepository.getByEmail(admin.getEmail());
		List<Admin> b = adminRepository.getByPassword(admin.getPassword());
		if (a.equals(admin.getEmail()) && b.equals(admin.getPassword())) {
			return "Login Successfull";
		}
		return "Invalid email or password";
	}
}
