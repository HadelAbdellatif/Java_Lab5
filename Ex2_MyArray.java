package com.sun;


public class Ex2_MyArray {

	int[] myArray = new int[10];

	public Ex2_MyArray(int[] myArray) {
		super();
		this.myArray = myArray;
	}

	public int[] getMyArray() {
		return myArray;
	}

	public void setMyArray(int[] myArray) {
		this.myArray = myArray;
	}

	public static int min(int[] myArray) {
		int minimum = myArray[0];

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] < minimum) {
				minimum = myArray[i];
			}
		}

		return minimum;
	}

	public static int max(int[] myArray) {
		int maximum = myArray[0];

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] > maximum) {
				maximum = myArray[i];
			}
		}

		return maximum;
	}

	public static double avg(int[] myArray) {
		int sum = 0;
		int count = 0;
		double avg;

		for (int i = 0; i < myArray.length; i++) {
			sum += myArray[i];
			count++;
		}

		avg = sum / count;
		return avg;
	}

	public static void printArray(int[] myArray) {

		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}

	public static int getSize(int[] myArray) {
		int Size = 0;
		for (int i = 0; i < myArray.length; i++) {
			Size++;
		}
		return Size;
	}
	
}
