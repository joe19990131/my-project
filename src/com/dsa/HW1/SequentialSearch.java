package com.dsa.HW1;

public class SequentialSearch {
	static int[] nums = new int[10];

	public static int sequentialsearch(int key) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == key) {
				return key;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			nums[i] = i;

		}
		System.out.print(sequentialsearch(4));
	}

}
