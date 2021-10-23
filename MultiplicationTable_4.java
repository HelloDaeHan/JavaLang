package com.practic.base;

import java.util.Scanner;

public class MultiplicationTable_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단 짝수 출력:");
		int num1 = scan.nextInt();
		for(int i = 1; i < 10; i++) {
			int a = num1 * i;
			if(a % 2 == 0) {
				System.out.print(a + " ");
			}
		}
	}
}