package com.azam.dsa.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Azam","Amir");
        List<String> capitalNames = names.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(capitalNames);
        
        List<List<Integer>> nums = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(1,2,3));
        List<Integer> listOfnums = nums.stream().flatMap(list->list.stream()).collect(Collectors.toList());
        System.out.println(listOfnums);

        List<String> list1 = Arrays.asList("apple","banana","cherry");
        List<String> list2 = Arrays.asList("watermelon","banana","cherry");
        
        Set<String> set = list2.stream().collect(Collectors.toSet());
        List<String> commonFruits = list1.stream().filter(set::contains).collect(Collectors.toList());
        System.out.println(commonFruits);
    }
}
