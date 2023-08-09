package Pract1;

//3 Write a program to calculate the sum of all elements in an integer array

public class Que3 {

	public static void addArray(int[] arr) {
		int result = 0;
		for (int data : arr) {

			result += data;

		}

		System.out.println(result);

	}

	public static void main(String args[]) {

		// int[] arr = { 21, 33, 44, 55, 66, 77, 88, 54, 66, 44 };

		addArray(new int[] { 21, 33, 44, 55, 66, 77, 88, 54, 66, 44 });// using anonymous array
	}

}
