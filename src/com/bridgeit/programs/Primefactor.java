package com.bridgeit.programs;

import java.util.Scanner;

import com.bridgeit.utility.Utility;
public class Primefactor {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Utility utility=new Utility();
		System.out.println("Enter Number to Find to Prime Factor");
		int number=scanner.nextInt();
		utility.primeFactors(number);
	}

}
