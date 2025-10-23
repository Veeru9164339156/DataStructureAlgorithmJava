package TwoDArray2DArray;
import java.util.Scanner;
public class RowWiseSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][]mat=new int [3][3];
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
		int a[]=rowSum(mat);
		for(int i=0;i<mat.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	static int[] rowSum(int[][]mat) {
		int ar[]=new int[mat.length];
		for(int i=0;i<mat.length;i++)
		{
			int sum=0;
			for(int j=0;j<mat[i].length;j++)
			{
					sum=sum+mat[i][j];
			}
			ar[i]=sum;
		}
		return ar;
	}
}
