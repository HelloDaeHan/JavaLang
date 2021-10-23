package com.practic.base;

import java.util.Scanner;

public class MultiplicationTable_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("구구단 단수:");
		int num1 = scan.nextInt();
		for(int i = 1; i < 10; i++) {
			System.out.print(num1 * i + " ");
			
			if(i == 3) {
				System.out.println();
			}
			
			else if(i == 6) {
				System.out.println();
			}
			
			else if(i == 9) {
				System.out.println();
			}
		}
	}
}