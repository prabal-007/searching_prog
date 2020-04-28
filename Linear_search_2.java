package Searching_program;

import java.util.*;

public class Linear_search_2 {

		public static int linear(int[] arr, int search) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==search)
				{
					return i;
				}
			}
			return -1;
		}

	public static void main(String[] args) {
		int search,size,arr[];
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		size= s.nextInt();
		arr=new int[size];
		System.out.println("Enter the elements of array : ");
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the element to be searched : ");
		search=s.nextInt();
		
		linear(arr,search);
		
	
	}

	
}