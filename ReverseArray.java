package com.acadgild.session.four;

public class ReverseArray {

	public static void main(String[] args) {
		int arrnum[] = new int[] { 1, 2, 3, 4, 5, 6 };
		// print the original array
		System.out.println("printing actuall array");
		for (int i = 0; i < arrnum.length; i++) {
			System.out.println(arrnum[i]);
		}
		// print in reverse
		System.out.println("printing reversed array");
		for (int i = arrnum.length - 1; i >= 0; i--) {
			System.out.println(arrnum[i]);
		}
	}

}
