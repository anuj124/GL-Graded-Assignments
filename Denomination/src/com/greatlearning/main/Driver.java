package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.service.MergeSortlmplementation;
import com.greatlearning.service.NotesCount;
public class Driver {

	public static void main(String[] args) {
		int [] denominations;
		int sizeOfDenominations;
		int amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations: ");
		sizeOfDenominations=sc.nextInt();
		denominations = new int[sizeOfDenominations];
		System.out.println("Enter the currency denominations value: ");
		for(int i=0; i < sizeOfDenominations; i++ ) {
			denominations[i]=sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay: ");
		amount= sc.nextInt();
		MergeSortlmplementation sort = new MergeSortlmplementation();
		sort.mergeSort(denominations, 0 , sizeOfDenominations-1);
		NotesCount notesCount = new NotesCount();
		notesCount.notesCountImplementation(denominations, amount);
		
		
		sc.close();

	}

}
