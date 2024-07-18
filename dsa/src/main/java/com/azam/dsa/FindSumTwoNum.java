package com.azam.dsa;

import java.util.HashSet;

public class FindSumTwoNum {
    public static void main(String[] args) {
        System.out.println(ifTowNumSum(new int[]{-1, -2, 3,4},2));
    }

    private static boolean ifTowNumSum(int[] arr, int target) {
        HashSet hs = new HashSet();
        for (int num : arr) {
            int complement = target - num;
            if (hs.contains(complement)) {
                System.out.println(num + " " + complement);
                return true;
            } 
            hs.add(num);
        }
        return false;
    }
}
