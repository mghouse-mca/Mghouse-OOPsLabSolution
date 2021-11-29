package com.greatlearning.service;

import com.greatlearning.model.*;
import java.util.Random;

public class CredentialService {
	private static final String DOMAIN_NAME = ".abc.com";


	public String generateEmailAddress(Employee emp) {
		// generate email address
		return emp.getFirstName().toLowerCase() + emp.getLastName().toLowerCase() + "@" + emp.getDepartment().toLowerCase() + DOMAIN_NAME;
	}
	
	public String generatePassword() {
		
		Random random = new Random();
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		
		String allowedChars = capitalLetters+smallLetters+numbers+specialCharacters;
		
		char[] password = new char[8];
		
		for(int i = 0;i<8;i++) {
			int idx = random.nextInt(allowedChars.length());
			password[i] = allowedChars.charAt(idx);
		}
		// Generate 8 digit random password
		
		return new String(password);
	}
	
	
	public void showCredentials(Employee emp,String email,String password) {
		// display credentials
		System.out.println("Dear " + emp.getFirstName() + "- here are your credentials");
		System.out.println("Email Address--> "+email);
		System.out.println("Pasword--> "+password);
	}
}
