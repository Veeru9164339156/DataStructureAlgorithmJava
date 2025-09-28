package TwoDArray2DArray;
import java.util.Scanner;
public class CountEvenOdd {
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
	System.out.println("count of even no and odd no :");
	countEvenOdd(mat);
}
static void display(int[][]x) {
	for(int i=0;i<x.length;i++) {
		for(int j=0;j<x[i].length;j++) {
			System.out.print(x[i][j]+" ");
		}
		System.out.println();
	}
}
static void countEvenOdd(int[][]x) {
	int ec=0,oc=0;
	for(int i=0;i<x.length;i++) {
		for(int j=0;j<x[i].length;j++) {
			if(x[i][j]%2==0)
				ec++;
			else
				oc++;
		}	
	}
	System.out.println("even count is :"+ec);
	System.out.println("odd count is :"+oc);
}
}
