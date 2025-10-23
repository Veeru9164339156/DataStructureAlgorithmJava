package TwoDArray2DArray;
import java.util.Scanner;
public class CountPrimeInArray {
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
	int pCount=countPrime(mat);
	System.out.println("the count of prime no:"+pCount);
}
static int countPrime(int[][]x)
{
	int count=0;
	for(int i=0;i<x.length;i++) {
		for(int j=0;j<x[i].length;j++) {
			if(isPrime(x[i][j]))
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
static boolean isPrime(int n) {
	if(n<=1)
		return false;
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
			return false;
	}
	return true;
}
}
