package com.paymoney.service;

public class CheckTarget {

	public void check(int[] transactions, int target) {

		int size = transactions.length;
		int sum = 0;
		int i = 0;
		boolean flag = false;
		while (sum < target && i < size) {
			sum = sum + transactions[i];
			if (sum >=target) {
				System.out.println("Target is Achieved at Transaction " + (i + 1));
				flag = true;
			}
			i++;
		}

		if (flag == false) {
			System.out.println(" Transaction can't be achieved ");
		}

	}

}
