package com.azam.dsa.pattern;

public class MirrorImageTriangle19 {
	public static void main(String[] args) {
		int rows = 7;
		int str = 4;
		int spc = 0;
		int num = 1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= spc; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= str; j++) {
				System.out.print(num++ +" ");
			}
			System.out.println();
			if (i<=rows/2) {
				spc++;
				str--;
				num = i+1;
			} else {
				spc--;
				str++;
				num = num-str;
			}
		}
	}
}
