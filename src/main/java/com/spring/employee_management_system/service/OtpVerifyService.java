package com.spring.employee_management_system.service;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.employee_management_system.dto.VerifyOtpRequest;
import com.spring.employee_management_system.entity.User;
import com.spring.employee_management_system.repository.UserRepository;
@Service
public class OtpVerifyService {
	
	private UserRepository userRepository;
	
	public OtpVerifyService(UserRepository userRepository) {
		
		this.userRepository = userRepository;
	}




	public String otpVerification(VerifyOtpRequest verifyOtpRequest) {
		
	Optional<User>	op=userRepository.findByEmail(verifyOtpRequest.getEmail());
	if(op.isPresent()) {
		User user=op.get();
		if (!Objects.equals(user.getOtp(), verifyOtpRequest.getOtp())) {
//		if(!user.getOtp().equals(verifyOtpRequest.getOtp())) {
			return "invalid otp";
			
		}
		if(LocalDateTime.now().isAfter(user.getOtpExpire())) {
			return "Otp Got Expired";
		}
		else {
			user.setVerified(true);
			user.setOtp(null);
			user.setOtpExpire(null);
			userRepository.save(user);
			return "verifird successfully";
		}
	
	}
	else {
		return "user not found with email "+ verifyOtpRequest.getEmail();
	}
	 
		
	}

}
