package TwoDArray2DArray;
import java.util.Scanner;
public class CountHappyNo {
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
		int hCount=countHappyNo(mat);
		System.out.println("the count of happy no:"+hCount);
	}
	static int countHappyNo(int[][]x)
	{
		int count=0;
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				if(isHappy(x[i][j]))
					count++;	
			}
		}
		return count;
	}
	static void display(int[][]x) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
	static boolean isHappy(int n) {
		while(n>9) {
			int sum=0;
			do {
				int d=n%10;
				sum=sum+d*d;
				n=n/10;
			}while(n!=0);
			n=sum;
		}
		if(n==1||n==7)
			return true;
		else
			return false;
	}
}
