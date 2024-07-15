/* Sum of natural numbers */

package com.day1;

import java.util.Scanner;

public class Prog15 { 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: "); 
		int n = sc.nextInt(); 
		int sum = 0; for (int i = 1; i <= n; i++)
		{ 
			sum += i;
		} 
		System.out.println("Sum of natural numbers up to " + n + " is: " + sum); 
		sc.close();
		} 
}
