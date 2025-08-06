package com.palle;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {64, 34, 25, 12, 22, 11, 90};
		int n = arr.length;
		System.out.println("Original array:");
		for (int j : arr) {
		    System.out.print(j + " ");
		}
		System.out.println();

		for (int i = 1; i < n; i++) {
		    int key = arr[i];
		    int j = i - 1;
		    while (j >= 0 && arr[j] > key) {
		        arr[j + 1] = arr[j];
		        j--;
		    }
		    arr[j + 1] = key;
		}

		System.out.println("Sorted array:");
		for (int j : arr) {
		    System.out.print(j + " ");
		}


	}

}
