package com.sun;

import java.util.Scanner;

public class Ex2_driver {

	public static void main(String[] args) {

		int[] myArray2 = new int[10];

		Scanner input = new Scanner(System.in);
		System.out.println("Please inter 10 integers");
		for (int i = 0; i < myArray2.length; i++) {
			System.out.println("integer number " + (i + 1));
			myArray2[i] = input.nextInt();
		}
		input.close();

		int min = Ex2_MyArray.min(myArray2);
		System.out.println("The minimum number is : " + min);

		int max = Ex2_MyArray.max(myArray2);
		System.out.println("The maximum number is : " + max);

		double avg = Ex2_MyArray.avg(myArray2);
		System.out.println("The average is : " + avg);

		Ex2_MyArray.printArray(myArray2);

		int size = Ex2_MyArray.getSize(myArray2);
		System.out.println("The size is : " + size);

	}
}
