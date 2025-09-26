package ArraysClssprograms;

import java.util.Arrays;

public class GreaterElement {
public static void main(String[] args) {
	int ar[]= {4, 5, 3, 7, 2, 11};
	int ar2[]=new int[ar.length];
	for(int i=0;i<ar.length;i++) {
		for(int j=i+1;j<ar.length;j++) {
			if(ar[j]>ar[i]) {
			ar[i]=ar[j];
			break;	
			}
		}
	}
	ar[ar.length-1]=0;
	for(int i=0;i<ar.length;i++) {
		System.out.print(ar[i]+" ");
	}
}
}
