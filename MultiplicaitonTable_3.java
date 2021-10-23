package com.practic.base;

import java.util.Scanner;

public class MultiplicaitonTable_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("40단 단수:");
		int num1 = scan.nextInt();
		for(int i = 1; i < 41; i++) {
			System.out.print(num1 * i + " ");
			
			if(i % 3 == 0) {
				System.out.println();
			}
		}
	}
}