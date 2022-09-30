package com.java;
import java.util.Scanner;
public class NoOfDigitsInANumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit:");
		long number = sc.nextLong();
		int count = 0;
		while(number>0) {
			count = count + 1;
			number = number/10;
		}
		System.out.println("Count is:"+count);
		sc.close();
	}

}
