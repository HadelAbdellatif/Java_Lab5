package com.sun;

import java.util.Scanner;

public class Ex3_driver {

	public static void main(String[] args) {
		
		Ex3_City [] array = new Ex3_City[4];
		int sum = 0;
		int count = 0;
		double avg = 0;
		
		array[0] = new Ex3_City("Akka", 13.548, 12.548, 35);
		array[1] = new Ex3_City("Hayfa", 18.265, 7.264, 37);
		array[2] = new Ex3_City("Yafa", 20.658, 21.325, 40);
		array[3] = new Ex3_City("Jerusalem", 28.215, 25.326, 32);
		for(int i=0 ; i<array.length ; i++) {
		
			sum+= array[i].getTemprerature();
			count++;
		}
		
		avg = sum/count;
		
		System.out.println("The average tempreture of all cites : "+avg);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an average tempreture  : ");
		int avg2 = input.nextInt();
		
		belowAverage(array, avg2);
		input.close();
	}
	public static void belowAverage(Ex3_City [] cities , double AvgTemp) {
		
		System.out.println("cities that have a temperature below the given temperature.");
		for(int i=0 ; i<cities.length ; i++) {
			if(cities[i].getTemprerature()<AvgTemp)
			{
				cities[i].toString();
				
			}
		}
	}

}
