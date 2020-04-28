package Searching_program;

public class Binary_search_2 {
	
	public static int binary(int arr[], int first, int last, int key) {
		if(last>=first)
		{
			int mid = first + (last-first)/2;
			if(arr[mid]==key)
			{
				return mid;
			}
			if(arr[mid]>key) {
				return binary(arr,first,mid-1,key);
			}else {
				return binary(arr,first,mid+1,key);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {12,34,56,78,89,90,101,112,154};
		int key=89;
		int last=arr.length-1;
		int result=binary(arr,0,last,key);
		if(result==-1) 
			System.out.println("Element not found!");
	   	else 
			System.out.println(" Element is found at index "+result);

	}

}
