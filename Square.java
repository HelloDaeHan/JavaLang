package com.practic.base2;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("제곱의 결과:");
		int num1 = scan.nextInt();
		int result = 1;
		for(int i = 1; i<11; i++) {
			result = result * num1;
			System.out.print(result + " ");
		}
	}
}