/* Armstrong number */

package com.day1;

import java.util.Scanner; 

public class Prog16 { 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a number: "); 
		int number = sc.nextInt();
		int originalNumber, remainder, result = 0, n = 0; originalNumber = number;
		while (originalNumber != 0)
		{ 
			originalNumber /= 10; ++n;
		}
		originalNumber = number;
		while (originalNumber != 0)
		{ 
			remainder = originalNumber % 10;
			result += Math.pow(remainder, n); 
			originalNumber /= 10;
		} 
		if (result == number)
			System.out.println(number + " is an Armstrong number."); 
		else
			System.out.println(number + " is not an Armstrong number.");
		sc.close();
		}
}
