/* Average of numbers */

package com.day1;

import java.util.Scanner; 

public class Prog11
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the first number: "); 
		double num1 = sc.nextDouble(); 
		System.out.print("Enter the second number: "); 
		double num2 = sc.nextDouble(); 
		double average = (num1 + num2) / 2;
		System.out.println("The average of " + num1 + " and " + num2 + " is: " + average); 
		sc.close(); 
   } 
}
