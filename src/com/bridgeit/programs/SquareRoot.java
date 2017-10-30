package com.bridgeit.programs;

import java.util.Scanner;


import javax.rmi.CORBA.Util;

import com.bridgeit.utility.Utility;
public class SquareRoot {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter Non Negative Number to Find Square Root");
		Scanner scanner=new Scanner(System.in);
		double number=scanner.nextDouble();
		
		System.out.println("Square Root is: "+utility.sqrt(number));
	}

}
