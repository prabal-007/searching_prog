package Searching_program;

import java.util.*;

public class Linear_search_3 {

	public static void main(String[] args) {
		int arr[],i,size,search;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		size=s.nextInt();
		arr=new int[size];
		System.out.println("enter the elements of array : ");
		for(i=0;i<size;i++) 
			arr[i]=s.nextInt();
			System.out.println("Enter the element to be searched : ");
			search=s.nextInt();
			if(arr[i]==search)
			{
				System.out.println(search+" is at the index "+(i+1));
			}
		if(i==size) 
			System.out.println(search+" not present i the array. ");

	}

}
