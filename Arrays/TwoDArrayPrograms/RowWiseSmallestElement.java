package TwoDArray2DArray;
import java.util.Scanner;
public class RowWiseSmallestElement {
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
	int []rs=rowWiseSmallest(mat);
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
static int[] rowWiseSmallest(int[][] mat) {
	int [] small=new int[mat.length];
	for(int i=0;i<mat.length;i++) {
		small[i]=mat[i][0];
		for(int j=1;j<mat[i].length;j++) {
			if(mat[i][j]<small[i])
				small[i]=mat[i][j];
		}
	}
	return small;
}
}
