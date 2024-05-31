package com.azam.dsa.InterviewBit;

public class PalindromWithRecursion {
    public static void main(String[] args) {
        System.out.println(isPalindrom("aba",0,2));           
    }

    private static boolean isPalindrom(String str, int start, int end) {
        if(start>=end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        return isPalindrom(str, start+1, end-1);
    }
}
