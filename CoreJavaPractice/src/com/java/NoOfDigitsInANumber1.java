package com.java;
import java.lang.Math;
import java.util.Scanner;
public class NoOfDigitsInANumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit:");
		long number = sc.nextLong();
		int count = (int) (Math.log10(number)+1);
		System.out.println("Count is:"+count);
		sc.close();
	}

}