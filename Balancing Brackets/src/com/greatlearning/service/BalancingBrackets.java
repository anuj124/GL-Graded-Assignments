package com.greatlearning.service;

import java.util.EmptyStackException;
import java.util.Stack;

public class BalancingBrackets {

	public void checkBalancingBrackets(String expression) {
		Stack<Character> bracketStack = new Stack<Character>();
		boolean state=true;
		int size = expression.length();
//		for (int i = 0; i < size; i++) {
//			if(expression.charAt(i) == '{'||expression.charAt(i) == '('||expression.charAt(i) == '[') {
//				bracketStack.push(expression.charAt(i));
//			}
//		}
		try {

			for (int i = 0; i < size; i++) {

				char element = expression.charAt(i);
				switch (element) {
				case '}':
					if (bracketStack.peek() == '{') {
						bracketStack.pop();
						break;
					}
				case ')':
					if (bracketStack.peek() == '(') {
						bracketStack.pop();
						break;
					}
				case ']':
					if (bracketStack.peek() == '[') {
						bracketStack.pop();
						break;
					}
				default:
					bracketStack.push(element);
				}
			}
		} catch (EmptyStackException e) {
			System.out.println(e + " Please Don't Start Expression with Closing Bracket");
			state= false;
		}
		if (bracketStack.isEmpty() && state == true ) {
			System.out.println("Balanced Brackets");
		} else
			System.out.println("Unbalanced Brackets");

	}

}
