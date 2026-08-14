package com.spring.employee_management_system.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.employee_management_system.dto.RegisterRequest;
import com.spring.employee_management_system.entity.User;
import com.spring.employee_management_system.repository.UserRepository;
import com.spring.employee_management_system.util.OptGenerator;
@Service
public class UserService {
	private UserRepository  repository;

	private EmailService emailService;

	public UserService(UserRepository repository, EmailService emailService) {
		
		this.repository = repository;
		this.emailService = emailService;
	}

	public String regiserRequest(RegisterRequest registerRequest) {
	Optional<User> ou=repository.findByEmail(registerRequest.getEmail());
	if(ou.isPresent()) {
		return "emailid Already Exists "+ou.get();
	}
	else {
		User user=new User();
		user.setName(registerRequest.getName());
		user.setEmail(registerRequest.getEmail());
		user.setPassword(registerRequest.getPassword());
		user.setRole("ROLE_USER");
		user.setVerified(false);
		String otp=OptGenerator.generateOtp();
		user.setOtp(otp);
		user.setOtpExpire(LocalDateTime.now().plusMinutes(5));
		repository.save(user);
		//************************************************************************//
		emailService.sendOtp(registerRequest.getEmail(), otp);
		
		return "otp sent";
	}
	}
}
