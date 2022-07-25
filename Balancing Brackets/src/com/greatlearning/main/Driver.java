package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.service.BalancingBrackets;

public class Driver {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BalancingBrackets bracket = new BalancingBrackets();
		String expression;
		System.out.println("Enter the Expression");
		expression = sc.nextLine();
		bracket.checkBalancingBrackets(expression);

	}

}
