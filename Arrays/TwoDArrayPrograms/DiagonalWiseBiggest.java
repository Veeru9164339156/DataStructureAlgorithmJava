package TwoDArray2DArray;

import java.util.Scanner;

public class DiagonalWiseBiggest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][]mat=new int [4][4];
		System.out.println("eneter the values");
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++){
				mat[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
			System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("------");
		int a[]=diagonalBiggest(mat);
		for(int i=0;i<mat.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	static int[] diagonalBiggest(int[][]mat) {
		int ar[]=new int[mat.length];
		for(int i=0;i<mat.length;i++)
		{
			int big=0;
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[j][i]>big)
					big=mat[j][i];
			}
			ar[i]=big;
		}
		return ar;
	}
}
