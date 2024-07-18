package com.azam.dsa.InterviewBit;

import java.util.ArrayList;

public class RemoveDuplicateSortedArray {
    static int removeDuplicates(int[] arr) {
        int n = arr.length;
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (j == -1 || arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
                System.out.println(arr[j]);
            }
        }
        return j + 1;
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}));
    }
}
