package com.spring.employee_management_system.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class EmailService {
	private JavaMailSender javaMailSender;
	
	
	public EmailService(JavaMailSender javaMailSender) {
		
		this.javaMailSender = javaMailSender;
	}
	public void sendOtp(String toEmail,String otp) {
		SimpleMailMessage mailMessage= new SimpleMailMessage();
		mailMessage.setTo(toEmail);
		mailMessage.setSubject("OTP VERIFICATION");
		mailMessage.setText("YOUR OTP IS "+ " "+otp);
		javaMailSender.send(mailMessage);
	}

}
