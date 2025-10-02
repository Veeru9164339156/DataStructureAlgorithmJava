package TwoDArray2DArray;

import java.util.Scanner;

public class DifferenceBwPSumandSsum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the oder of matrix");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int mat[][]=new int[row][col];
		System.out.println("enter"+row*col+"values row wise");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("user enterd matrix is:");
		display(mat);
		System.out.println();
		int dif=getDiffbwpsumandSsum(mat);
			System.out.print(dif+" ");
	}
	static void display(int[][]x) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
	static int getDiffbwpsumandSsum(int[][]mat)
	{
		int pSum=mat[0][0], sSum=mat[0][mat.length-1];
		for(int i=1;i<mat.length;i++) {
			pSum+=mat[i][i];
			sSum+=mat[i][mat.length-1-i];
		}
		return pSum-sSum;
	}
}
