package com.greatlearning.service;

import java.util.Collections;
import java.util.Stack;

public class Construction {

	public void build(int[] floor, int n) {
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		for (int i = n - 1; i >= 0; i--) {
			stack1.push(floor[i]);
		}

		int max = Collections.max(stack1);
		int max1, max2;
		int min = Collections.min(stack1);

		for (int day = 1; day <= n; day++) {

			if (stack1.peek() >= max) {
				System.out.print("Day" + day + ": ");
				stack2.push(stack1.pop());
				while (!stack2.isEmpty() && stack2.peek() <= max && stack2.peek() >= min) {
					System.out.print(stack2.pop() + " ");
					if (!stack1.isEmpty() && !stack2.isEmpty()) {
						max1 = Collections.max(stack1);
						max2 = Collections.max(stack2);
						if (max1 > max2)
							max = max1;
						else
							max = max2;
					}

					if (!stack1.isEmpty()) {
						min = Collections.min(stack1);
					} else if (!stack2.isEmpty()) {
						min = Collections.min(stack2);
					}
				}
				System.out.println();
			} else {
				System.out.println("Day" + day + ": ");
				stack2.push(stack1.pop());
				max1 = Collections.max(stack1);
				max2 = Collections.max(stack2);
				if (!stack1.isEmpty() && !stack2.isEmpty()) {
					max1 = Collections.max(stack1);
					max2 = Collections.max(stack2);
					if (max1 > max2)
						max = max1;
					else
						max = max2;
				}
			}
		}
	}

}
