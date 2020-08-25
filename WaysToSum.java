package com.java.dhacker;

public class WaysToSum {

	public static void findCombinations(int[] arr, int index, int num, int reducedNum) {
		if (reducedNum < 0)
			return;
		if (reducedNum == 0) {
			for (int i = 0; i < index; i++)
				System.out.print(arr[i] + " ");
			System.out.println();
			return;
		}
		int prev = (index == 0) ? 1 : arr[index - 1];
		for (int j = prev; j <= num; j++) {
			arr[index] = j;
			findCombinations(arr, index + 1, num, reducedNum - j);
		}
	}

	public static void main(String[] args) {
		int num = 8;
		int k = 2;
		int[] arr = new int[num];
		findCombinations(arr, 0, k, num);
	}
}
