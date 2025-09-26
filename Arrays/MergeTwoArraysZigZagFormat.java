package OneDArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArraysZigZagFormat {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int arr1[]={10,20,30,40};
		int arr2[]={23,34,89,64,83,18};
		int arr3[]=mergeArraysZigZag(arr1,arr2);
		System.out.println(Arrays.toString(arr3));
	}

	private static int[] mergeArraysZigZag(int[] arr1, int[] arr2) {
		int arr3[]=new int[arr1.length+arr2.length];
		int i=0,j=0;
		while(i<arr1.length&& i<arr2.length) {
			arr3[j++]=arr1[i];
			arr3[j++]=arr2[i++];
		}
		while(i<arr1.length)
			arr3[j++]=arr1[i++];
		
		while(i<arr2.length) 
			arr3[j++]=arr2[i++];

		return arr3;
	}

}
