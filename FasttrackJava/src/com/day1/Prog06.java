/* String reverse */

package com.day1;

import java.util.Scanner;

public class Prog06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--)
        {
            reversedStr += str.charAt(i);
        }

        System.out.println("Reversed string: " + reversedStr);
        sc.close();
    }
}
