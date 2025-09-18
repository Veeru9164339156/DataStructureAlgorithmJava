package OneDArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class NthBiggest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int ar[]= {1,4,7,3,9,6};
	System.out.println("enter the no");
	int n=sc.nextInt();
	int big=getNthBiggest(ar,n);
	System.out.println(big);
}

private static int getNthBiggest(int[] ar, int n) {
	for(int i=0;i<ar.length-1;i++) {
		for(int j=0;j<ar.length-1-i;j++) {
			if(ar[j]>ar[j+1]) {
				int temp=ar[j];
				ar[j]=ar[j+1];
				ar[j+1]=temp;
			}
		}
	}
	return ar[ar.length-n];
}

//private static int getNthBiggest(int[] ar, int n) {
//	for(int i=0;i<ar.length;i++) {
//		int count=0;
//		for(int j=0;j<ar.length;j++) {
//			if(ar[j]>ar[i]) {
//				count++;
//			}
//		}
//		if(count==n-1) {
//			return ar[i];
//		}
//	}
//	return 0;
//}
}
