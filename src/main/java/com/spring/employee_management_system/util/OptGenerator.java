package com.spring.employee_management_system.util;

import java.util.Random;

public class OptGenerator {
	public static String  generateOtp() {
		Random random=new Random();
		int opt=100000+random.nextInt(900000);
		return String.valueOf(opt);
	}

}
