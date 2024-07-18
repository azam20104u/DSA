package com.azam.dsa.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.text.html.parser.Entity;

public class Java8Program {
    public static void main(String[] args) {
        // find odd and even numbers from the list
        // List<Integer> list = Arrays.asList(1,2,3,4,5);
        // Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(i->i%2==0));
        // collect.forEach((bol,odevn)->{
        //     if (bol) {
        //         System.out.println("Even Numbers");
        //         System.out.println(odevn);
        //     }else{
        //         System.out.println("Odd Numbers");
        //         System.out.println(odevn);
        //     }
        // });

        //remove duplicates elements
        // List<Integer> list = Arrays.asList(1,2,2,3,4,3,5);
        // Set<Integer> collect = list.stream().collect(Collectors.toSet());
        // System.out.println(collect);

        // frequency of each string
        // String str = "allah";
        // Map<Character, Long> collect = str.chars().mapToObj(c->(char)c)
        // .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        // System.out.println(collect);

        // sort the elements
        // List<Integer> list = Arrays.asList(3,4,1,2,5);
        // List<Integer> collect = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        // System.out.println(collect);

        //find duplicates only
        // List<Integer> list = Arrays.asList(1,2,2,3,4,3,5);
        // Set<Integer> set = new HashSet<>();
        // Set<Integer> collect = list.stream().filter(i->!set.add(i)).collect(Collectors.toSet());
        // System.out.println(collect);

        //sort the hashmap by values with stream api
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 30);
        map.put("Banana", 10);
        map.put("Cherry", 40);
        map.put("Date", 20);
        map.put("fate", 20);

        // Set<Entry<String, Integer>> entrySet = map.entrySet();
        // Map<String, Integer> collect2 = entrySet.stream().sorted(Entry.comparingByValue()).collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
        // System.out.println(collect2);

        List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.comparingByValue());
        Map<String, Integer> sortedmap = new LinkedHashMap<>();
        for (Entry<String,Integer> entry : list) {
            sortedmap.put(entry.getKey(), entry.getValue());
        }
        System.out.println(sortedmap);

        int a = m();
		System.out.println(a);
    }
    static int m() {
		try {
			int res = 10 / 0;
		} catch (Exception e) {
			System.out.println("catch");
			return 10;
		} finally {
			System.out.println("finally");
			return 20;
		}
	}
}
