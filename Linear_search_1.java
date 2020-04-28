

public class Linear_search_1 {

	public static int linear(int[] arr, int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {21,45,32,78,22,67};
		int key = 32;
		System.out.println(key+" is found at index : "+linear(arr, key));

	}

}
