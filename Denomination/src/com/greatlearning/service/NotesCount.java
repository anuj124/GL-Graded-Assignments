package com.greatlearning.service;

public class NotesCount {

	public void notesCountImplementation(int[] notes, int amount) {
		int[] notesCount = new int[notes.length];

		try {
			for (int i = 0; i < notes.length; i++) {
				if (amount >=notes[i]) {
					notesCount[i] = amount/notes[i];
					amount = amount - notesCount[i] * notes[i];
				}
			}
			if (amount > 0) {
				System.out.println("This amouunt can not be paid by the available denominations of notes");
				System.out.println("Please enter the amount which can be paid by following denominations");
				for (int i = 0; i < notes.length; i++) {
					System.out.print(notes[i] + ",");
				}
			} else {
				System.out.println("Your Amount will be paid in following denominations: ");
				for (int i = 0; i < notes.length; i++) {
					System.out.println(notes[i] + "-->" + notesCount[i]);
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e + "notes of denomination in 0 is invalid");
		}
		{

		}
	}
}
