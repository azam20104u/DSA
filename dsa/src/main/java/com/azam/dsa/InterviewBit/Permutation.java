package com.azam.dsa.InterviewBit;

public class Permutation {
    public static void main(String[] args) {
        String str = "ABC";
        permute(str,0,str.length()-1);
    }

    private static void permute(String str, int i, int j) {
        if (i == j) {
            System.out.println(str);
        }else{
            for (int k = i; k <= j; k++) {
                str = swap(str,i,k);
                permute(str,i+1,j);
                str = swap(str,i,k);
            }
        }
    }

    private static String swap(String str, int i, int k) {
        char[] ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[k];
        ch[k] = temp;
        return String.valueOf(ch);
    }
}
