package com.day3.handson.barceja2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */

public class Fibonacci {
	public static String choice ="";
	public static Integer ctr= 0;
	
	public void acceptChoice(String a) {
		choice = a;
	}

	public static void increaseFib(int a, int b) {
		
		if (choice.equals("1")) {
			if(b < 100) {
				System.out.print(b + " ");
				increaseFib(b, a+b);	
			}	
		}else if (choice.equals("2")) {
			if(ctr <= 100) {
				System.out.print(b + " ");
				ctr++;
				increaseFib(b, a+b);
			}	
		}else {
			System.out.print("Please select [1] or [2] only");
		}
		

	}
	
}
