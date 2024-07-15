/* reverse number */

package com.day1;

import java.util.Scanner;

public class Prog14 { 
	 public static void main(String[] args) { 
		 Scanner sc = new Scanner(System.in); 
		 System.out.print("Enter a number: "); 
		 int number = sc.nextInt(); 
		 int reversedNumber = 0; 
		 while (number != 0) {
			 int digit = number % 10;
			 reversedNumber = reversedNumber * 10 + digit; number /= 10; 
			 } 
		 System.out.println("Reversed number: " + reversedNumber);
		 sc.close(); 
		 } 
}
