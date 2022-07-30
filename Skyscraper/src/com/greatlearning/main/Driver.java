package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.service.Construction;

public class Driver {

	public static void main(String[] args) {

		int noOfFloors;
		int[] floor;
		Scanner sc = new Scanner(System.in);
		Construction building = new Construction();
		System.out.println("Enter the no of floors you want to build: ");
		noOfFloors = sc.nextInt();
		floor = new int[noOfFloors];
		System.out.println("Enter the floor size.......");
		for (int i = 0; i < noOfFloors; i++) {
			System.out.println("Enter the floor size arrived on day" + (i + 1));
			floor[i] = sc.nextInt();
		}

		building.build(floor, noOfFloors);

		sc.close();
	}

}
