package com.test.matrix.interchange;

public class Solution {

	public static void main(String[] args) {
		int[][] a = new int[3][4];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[0][3] = 4;
		a[1][0] = 4;// OK
		a[1][1] = 3;// OK
		a[1][2] = 2;// OK
		a[1][3] = 1;// OK
		a[2][0] = 6;// OK
		a[2][1] = 7;// OK
		a[2][2] = 8;// OK
		a[2][3] = 9;// OK
		interchange(a, 3, 4);

	}

	static void interchange(int a[][], int r, int c) {
		int tempFirstValue = 0;
		int tempLastValue = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (j == 0) {
					tempFirstValue = a[i][j];
				}
				if (j == (c - 1)) {
					tempLastValue = a[i][c - 1];
					a[i][c - 1] = tempFirstValue;
					a[i][0] = tempLastValue;
				}
			}
		}
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	// Your code here

//		for (int i = 0; i < r; i++) {
//			for (int j = 0; j < c; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}
}
