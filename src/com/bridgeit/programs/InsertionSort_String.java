package com.bridgeit.programs;
import com.bridgeit.utility.Utility;
public class InsertionSort_String {

	public static void main(String[] args) {
		Utility util =new Utility(); 
		String[] array={"Zian","Ajit","Imran","faisal"};
		array=util.insertionSort(array);
		for(String x:array ){
			System.out.println(x);
		}
	}

}
