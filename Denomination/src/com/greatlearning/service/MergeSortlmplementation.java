package com.greatlearning.service;

public class MergeSortlmplementation {

	public int[] array;
	public int length;

	public int[] merge(int array[], int left, int mid, int right) {
		int len1 = mid - left + 1;
		int len2 = right - mid;

		int[] leftarr = new int[len1];
		int[] rightarr = new int[len2];

		for (int i = 0; i < len1; i++) {
			leftarr[i] = array[left + i];
		}
		for (int j = 0; j < len2; j++) {
			rightarr[j] = array[mid + 1 + j];
		}

		int i, j, k;
		i = 0;
		j = 0;
		k = left;

		while (i < len1 && j < len2) {
			if (leftarr[i] >= rightarr[j]) {
				array[k] = leftarr[i];
				i++;
			} else {
				array[k] = rightarr[j];
				j++;
			}
			k++;
		}

		while (i < len1) {
			array[k] = leftarr[i];
			i++;
			k++;
		}
		while (j < len2) {
			array[k] = rightarr[i];
			j++;
			k++;
		}

		return (array);
	}

	public void mergeSort(int array[], int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			this.array = merge(array, left, mid, right);

		}
	}

}
