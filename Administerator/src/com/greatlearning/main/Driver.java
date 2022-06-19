package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class Driver {
	public static void main(String[] args) {
		CredentialService credential = new CredentialService();
		Employee employee = new Employee("Anuj", "Sharma");
		String department = null;
		System.out.println("Please Enter the Department of employee from the following: ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			department = "Technical";
			break;
		case 2:
			department = "Admin";
			break;
		case 3:
			department = "HR";
			break;
		case 4:
			department = "HR";
			break;
		default:
			System.out.println("Wrong Choice");
			break;
		}

		String email = credential.generateEmail(employee.getFirstName().toLowerCase(),
				employee.getLastName().toLowerCase(), department.toLowerCase());
		char[] Password = credential.generatePassword();
		credential.showCredentials(employee, email, Password,department);
		sc.close();
	}
}
