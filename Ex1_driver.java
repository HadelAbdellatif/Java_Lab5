package com.sun;

import java.util.Date;

public class Ex1_driver {

	static java.util.Date date =new java.util.Date();

	
	public static void main(String[] args) {

		Ex1_Employee[] array = new Ex1_Employee[4];

		
		
	array[0] = new Ex1_Employee(1, "Ahmad", 112233,getDateFromString("10/09/1990"), getDateFromString("12/08/2022"),2500);
	array[1] = new Ex1_Employee(2, "Basil", 445566, getDateFromString("12/05/1992"), getDateFromString("01/09/2022"),2700);
	array[2] = new Ex1_Employee(3, "Omar", 778899, getDateFromString("14/08/1994"), getDateFromString("16/07/2022"),3000);
	array[3] = new Ex1_Employee(4, "Murad", 101112, getDateFromString("16/10/1980"), getDateFromString("17/06/2022"),7500);


		// Printing array data
		for (int i = 0; i < array.length; i++) {
			System.out.println("Department Number : " + array[i].getDepartmentNo() + " , Name : " + array[i].getName()
					+ " , ID : " + array[i].getId() + " , Birth date : " + array[i].getBirthDate() + " , Hire date : "
					+ array[i].getHireDate() + " , Basic salary : " + array[i].getBasicSalary());
		}
		
		largestSalary(array);

	}
	
	@SuppressWarnings("deprecation")
	private static Date getDateFromString(String string) {
		Date result = new Date(string);
		return result; 
	}

	public static Ex1_Employee largestSalary (Ex1_Employee[] Employee) {
		double max_salary = 0;
		int index = 0;
		
		for (int i = 0; i < Employee.length; i++) {
			if (Employee[i].getBasicSalary() > max_salary)
			{
				max_salary = Employee[i].getBasicSalary();
				index = i;
			}
		}
		
		System.out.println("Employee with largest salary ...");
		System.out.println("Department Number : " + Employee[index].getDepartmentNo() + " , Name : " + Employee[index].getName()
				+ " , ID : " + Employee[index].getId() + " , Birth date : " + Employee[index].getBirthDate() + " , Hire date : "
				+ Employee[index].getHireDate() + " , Basic salary : " + Employee[index].getBasicSalary());
		return null;
		
	}
}
