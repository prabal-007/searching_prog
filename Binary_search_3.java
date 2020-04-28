package Searching_program;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_search_3 {

	public static void main(String[] args) {
		int arr[]= {12,23,34,45,56,66,78,89,90,100};
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the element to be searched : ");
		int key=s.nextInt();
		int result=Arrays.binarySearch(arr, key);
		if(result<0)
			System.out.println("Element not found! ");
		else
			System.out.println("Element found at index "+result);

	}

}
