package TwoDArray2DArray;
import java.util.Scanner;
public class Gold {
public static void main(String[] args) {
	System.out.println("eter the values rate");
	int[][] g=read();
	find(g);
}
static int[][] read(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter how many years");
	int [][]ar=new int[sc.nextInt()][12];
	for(int i=0;i<ar.length;i++)
	{
		System.out.println("enter"+(i+1)+"year gold rate");
		for(int j=0;j<ar[i].length;j++) {
			ar[i][j]=sc.nextInt();
		}
	}
	return ar;
}
static void find(int[][]x)
{
	String []month= {"jan","feb","march","april","may","june","july","august","sep","oct","nov","dec"};
	int low=0,high=0;
	double av[]=new double[12];
	for(int i=0;i<12;i++) {
	double sum=0;
	for(int j=0;j<x.length;j++) {
		sum=sum+x[j][i];
	}
	av[i]=sum/x.length;
	}
	
	for(int i=0;i<12;i++) {
		if(av[i]<av[low])
			low=i;
		if(av[i]>av[high])
			high=i;
	}
	System.out.println("you can buy gold in the month :"+month[low]+"\n you can sale gold in the month :"+month[high]);
}
}
