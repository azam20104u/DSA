package com.azam.dsa.java8;

import java.util.Arrays;
import java.util.List;

public class SumEvenNum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,1,2,3);
        Integer sum = list.stream()
        .filter(num->num%2==0)
        .map(num->num*num)
        .reduce(0,Integer::sum);
        System.out.println(sum);

    }
}
