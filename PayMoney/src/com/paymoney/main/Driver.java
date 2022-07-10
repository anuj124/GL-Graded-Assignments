package com.paymoney.main;

import java.util.Scanner;

import com.paymoney.service.CheckTarget;

public class Driver {

	public static void main(String[] args) {

		int sizeOfArray;
		int target;
		int noOfTarget;
		int[] transactions;
		CheckTarget checkTarget = new CheckTarget();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		sizeOfArray = sc.nextInt();
		transactions = new int[sizeOfArray];
		System.out.println("Enter the values of Transaction");
		for (int i = 0; i < sizeOfArray; i++) {
			transactions[i] = sc.nextInt();
		}
		System.out.println("Enter the No of Targets:");
		noOfTarget = sc.nextInt();
		for (int i = 0; i < noOfTarget; i++) {
			System.out.println("Enter the value of Target " + (i + 1) + " Value:");
			target = sc.nextInt();
			checkTarget.check(transactions, target);
		}

		sc.close();

	}

}
