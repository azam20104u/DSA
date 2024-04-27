package com.azam.dsa;

import java.util.Arrays;

public class QuickSortDemo {
	public static void main(String[] args) {
		int[] arr = { 13, 2, 5, 8, 21, 20, 32, 9 };
		// 8 13
		int[] quickSort = quickSort(arr, 0, arr.length);
		System.out.println(Arrays.toString(quickSort));
	}

	private static int[] quickSort(int[] arr, int start, int end) {
		if (end - start <= 1) {// when single element array/empty array
			return arr;
		}
		int pivotIndex = findPositionAndArrange(arr, start, end);
//		int[] left = new int[end];//smaller elements from pivot
//		int[] right = new int[end];//larger elements from pivot
//		int l = 0, r = 0;
//		for (int i = start+1; i < end; i++) {
//			if (pivot > arr[i]) {
//				left[l++] = arr[i];
//			} else {
//				right[r++] = arr[i];
//			}
//		}
		quickSort(arr, start, pivotIndex);
		quickSort(arr, pivotIndex+1, end);
//		int a = 0;
//		for (int i = 0; i < l; i++) {
//			arr[a++] = left[i];
//		}
//		arr[a++] = pivot;
//		for (int i = 0; i < r; i++) {
//			arr[a++] = right[i];
//		}
		return arr;
	}

	private static int findPositionAndArrange(int[] arr, int start, int end) {
		int temp = start;// pivot index
		int pivot;
		for (int i = start + 1; i < end; i++) {
			pivot = arr[temp];
			if (pivot > arr[i]) {
				arr[temp] = arr[i];
				arr[i] = arr[temp+1];
				arr[temp+1] = pivot;
				temp++;
			}
		}
		return temp;
	}
}
