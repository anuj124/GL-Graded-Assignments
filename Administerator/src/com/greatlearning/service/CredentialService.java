package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {
	String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetter = "abcdefghijklmnopqrstuvwxyz";
	String number = "0123456789";
	String specialCharacter = "!@#$%^&*()_+-={}|[];:?|/<>,.";
	char[] password = new char[8];
	String values = capitalLetter + smallLetter + number + specialCharacter;
	String email;

	public char[] generatePassword() {
		Random random = new Random();
		for (int i = 0; i <= 8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password;
	}

	public String generateEmail(String firstName, String lastName, String department) {
		return email = firstName + lastName + "@" + department + "abc.com";

	}

	public void showCredentials(Employee employee, String email, char[] generatedPassword, String department) {
		System.out.println("Dear " + employee.getFirstName() + " " + employee.getLastName()
				+ " your generated credentials as follows");
		System.out.println("Department : " +department);
		System.out.println("Email : " + email);
		System.out.println("Password : " + generatedPassword.toString());

	}

}
