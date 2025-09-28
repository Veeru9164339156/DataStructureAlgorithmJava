package TwoDArray2DArray;

import java.util.Scanner;

public class ColoumWiseSmallElement {
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
		int []rs=colWiseSmallest(mat);
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
	static int[] colWiseSmallest(int[][] mat) {
		int [] small=new int[mat.length];
		for(int i=0;i<mat[0].length;i++) {
			small[i]=mat[0][i];
			for(int j=1;j<mat.length;j++) {
				if(mat[j][i]<small[i])
					small[i]=mat[j][i];
			}
		}
		return small;
	}
}
