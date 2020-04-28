package Searching_program;
import java.util.Arrays;
import java.util.Scanner;

public class Binary_search {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size=s.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter elements of the array : ");
		for(int i=0;i<size;i++)
			arr[i]=s.nextInt();
		System.out.println("Enter the element to be searched : ");
		int key=s.nextInt();
		
		int result=Arrays.binarySearch(arr,key);
		if(result<0)
			System.out.println(" Result is not found. ");
		else 
			System.out.println(" Result is found at index "+result);

	}

}
