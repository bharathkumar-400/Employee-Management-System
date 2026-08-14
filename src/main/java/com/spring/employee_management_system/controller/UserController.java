package com.spring.employee_management_system.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.employee_management_system.dto.RegisterRequest;
import com.spring.employee_management_system.dto.VerifyOtpRequest;
import com.spring.employee_management_system.service.OtpVerifyService;
import com.spring.employee_management_system.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private UserService service;
	private OtpVerifyService otpVerifyService;

	public UserController(UserService service, OtpVerifyService otpVerifyService) {
		super();
		this.service = service;
		this.otpVerifyService = otpVerifyService;
	}

	

	@PostMapping("/register")
			public String registerRequest(@RequestBody RegisterRequest registerRequest) {
		return service.regiserRequest(registerRequest);
	}
	
	@PostMapping("verify-otp")
	public String otpVerification(@RequestBody VerifyOtpRequest verifyOtpRequest) {
		return otpVerifyService.otpVerification(verifyOtpRequest);
		
	}

}
