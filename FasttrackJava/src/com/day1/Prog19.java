/* Max & Min in array */

package com.day1;

import java.util.Scanner; 

public class Prog19 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the number of elements in the array: "); 
		int n = sc.nextInt(); 
		int[] array = new int[n]; 
		System.out.println("Enter the elements of the array:"); 
		for (int i = 0; i < n; i++)
		{ 
			array[i] = sc.nextInt();
		}
		int max = array[0]; int min = array[0]; 
		for (int i = 1; i < n; i++) 
		{
			if (array[i] > max)
			{
				max = array[i];
			}
			if (array[i] < min)
			{ 
				min = array[i]; 
			}
		} 
		System.out.println("Maximum element in the array: " + max); 
		System.out.println("Minimum element in the array: " + min);
		sc.close(); 
		} 
}
