package com.servo.sort;

public class InsertionSort {
	
	public static void main(String arg[]) {
		int arr[] = {5,2,6,3,7,4};
		
		System.out.println("Before sorting the array elements");
		displayData(arr);
		
		System.out.println("After sorting the array elements");
		insertionSort(arr);
		displayData(arr);
		
		
	}
	
	
	
	
	

	public static void insertionSort(int arr[]) {

		int temp, j;

		for (int i = 1; i < arr.length; i++) {

			temp = arr[i];
			j = i;

			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;

			}
			arr[j] = temp;

		}
	}
	
	public static void displayData(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

}
