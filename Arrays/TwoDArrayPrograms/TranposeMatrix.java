package TwoDArray2DArray;
import java.util.Scanner;
//without using a new matrix
public class TranposeMatrix {
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
		int [][] t=getTransposedArray(mat,row,col);
		System.out.println("the tranpsosed matrix is:");
		display(t);
	}
	static int[][] getTransposedArray(int mat[][],int row,int col){
		int [][] temp=new int[col][row];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				temp[j][i]=mat[i][j];
			}
		}
		return temp;
	}
	static void display(int[][]x) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
}
