package com.azam.dsa;

public class PainterBinarySearch {
	public static void main(String[] args) {
		int noOfPainter = 3;/// no of painter
		int rateOfPaint = 3;// 3 seconds per feet
		int[] wallHeights = { 4, 3, 5, 6, 2 };// no of wall with deffn height
		int timeTaken = findMimTime(noOfPainter, rateOfPaint, wallHeights);
		System.out.println(timeTaken);
	}

	private static int findMimTime(int noOfPainter, int rateOfPaint, int[] wallHeights) {
		int r = totalTime(wallHeights, rateOfPaint);//max time 60sec ---> now 30sec possible now lets try less than 30 
		int l = 0;
		int mid;
		while (l < r) {//0<60 mid 30
			mid = (l + r) / 2;
			boolean possible = possibleTime(noOfPainter, rateOfPaint, wallHeights, mid);
			if (possible) {//30 seconds possible to paint all the walls. that means it could be lesser time
                r = mid;
            } else {
                l = mid + 1;// if 30sec not possible than l=31 sec and less than r=60 sec
            }
		}
		return l;
	}

	// wall heights 4,3,5,6,2 total 20, rate of paint 3sec/feet, mid =
	// (0+20*3)/2=30, no of painter 3
	private static boolean possibleTime(int noOfPainter, int rateOfPaint, int[] wallHeights, int mid) {
		int painterCounter = 0;
		for (int i = 0; i < wallHeights.length;) {
			int currentTime = 0;//
			painterCounter++;//2, 3rd painter
			if (painterCounter > noOfPainter) {
                return false;
            }
			while ((currentTime + wallHeights[i] * rateOfPaint)< mid) {//18+2*3=24<30 false
				currentTime += wallHeights[i++] * rateOfPaint;// 4*3 = 12 sec, 12+ 3*3=21, 21+ 5*3=36>30
			}
			
		}
		return true;
	}

	private static int totalTime(int[] wallHeights, int rateOfP) {
		int height = 0;
		for (int i = 0; i < wallHeights.length; i++) {
			height += wallHeights[i];
		}
		return height * rateOfP;
	}
}
