package com.servo.sort;

public class BubbleSort {

	public static void main(String arg[]) {
		int arr[] = { 5, 2, 6, 3, 7, 4 };

		System.out.println("Before sorting the array elements");
		displayData(arr);

		System.out.println("After sorting the array elements");
		bubbleSort(arr);
		displayData(arr);

	}

	public static void bubbleSort(int[] arr) {
		int temp, flag;
		for (int i = 0; i < arr.length; i++) {

			flag = 0;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0)
				break;
		}
	}
	
public static void displayData(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	
	
}
