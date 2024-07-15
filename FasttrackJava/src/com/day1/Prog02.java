/* Even or Odd */

package com.day1;

import java.util.Scanner;

public class Prog02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int no = sc.nextInt();
		if(no%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
		sc.close();;
	}
}
