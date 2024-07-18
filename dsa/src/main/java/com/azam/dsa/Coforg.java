package com.azam.dsa;

import java.util.Arrays;

public class Coforg {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int rotate = 3;
        for (int i = 0; i < rotate; i++) {
            int temp = array[0];
            array[0]=array[array.length-1];
            for (int j = array.length-1; j >0; j--) {
                array[j]=array[j-1];
            }
            array[1]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
