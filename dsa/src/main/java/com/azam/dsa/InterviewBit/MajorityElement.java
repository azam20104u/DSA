package com.azam.dsa.InterviewBit;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(findElement(new int[] {2,1,2,1,1}));
    }

    private static int findElement(int[] A) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : A) {
            if (map.containsKey(i)) {
                map.put(i,map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > A.length/2) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
