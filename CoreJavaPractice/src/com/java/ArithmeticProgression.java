package com.java;

import java.util.Scanner;
public class ArithmeticProgression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first digit");
		int initial = sc.nextInt();
		System.out.println("Enter the difference");
		int diff = sc.nextInt();
		System.out.println("Enter no of progressions");
		int n = sc.nextInt();
		System.out.println("Enter the index");
		int k = sc.nextInt();
		int temp = initial;
		System.out.println("The arithmetic progression from "+initial+" to the "+n+"th digit is:");
		System.out.print(initial);
		for(int i=1;i<n;i++) {
			temp = temp+diff;
			System.out.print(" "+temp);
		}
		System.out.print("\n");
		System.out.println("The "+k+"th digit in AP is:"+(initial+(k-1)*diff));
	
		sc.close();
	}
}
