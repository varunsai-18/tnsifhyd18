/* Multiplication */ 

package com.day1;

import java.util.Scanner;

public class Prog18 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		System.out.print("Enter the range: "); 
		int range = sc.nextInt();
		System.out.println("Multiplication Table for " + number + ":"); 
		for (int i = 1; i <= range; i++)
		{ 
			System.out.println(number + " * " + i + " = " + (number * i));
		} 
		sc.close();
		}
}
