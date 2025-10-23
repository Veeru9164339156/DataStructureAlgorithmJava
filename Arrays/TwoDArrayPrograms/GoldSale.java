package TwoDArray2DArray;
import java.util.Scanner;
public class GoldSale {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the years and months");
		int year=sc.nextInt();
		int mon=sc.nextInt();
		int mat[][]=new int[year][mon];
		System.out.println("enter"+year*mon+"values row wise");
		System.out.println();
		for(int i=0;i<year;i++) {
			for(int j=0;j<mon;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("user enterd price of gold :");
		display(mat);
	}
	static void display(int[][]x) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
	 static void findAvearge(int[][]x) {
		 String []month= {"jan","feb","march","april","may","june","july","august","sept","nov","dec"};
		 int low=0,high=0;
		 double ave[]=new double[12];
		 for(int i=0;i<x.length;i++) {
			 double sum=0;
			 for(int j=0;j<x.length;j++) {
				 sum+=x[i][j];
			 }
			 ave[i]=sum/x.length;
		 }
		 for
	 }
	
	
}
