package TwoDArray2DArray;

import java.util.Scanner;

public class RowWiseProduct {
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
		int []rs=rowWiseProduct(mat);
		for(int i=0;i<rs.length;i++) {
			System.out.print(rs[i]+" ");
		}
	}
	static void display(int[][]x) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
	static int[] rowWiseProduct(int[][] mat) {
		int [] prod=new int[mat.length];
		for(int i=0;i<mat.length;i++) {
			prod[i]=1;
			for(int j=0;j<mat[i].length;j++) {
				prod[i]=prod[i]*mat[i][j];
			}
		}
		return prod;
	}
}
