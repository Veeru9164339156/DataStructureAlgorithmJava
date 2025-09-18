package OneDArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArraysIntoSingleArrayOneAnotherNext {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int arr1[]={1,2,3,4};
	int arr2[]={5,6,7,8,9};
	int arr3[]=mergeArrays(arr1,arr2);
	System.out.println(Arrays.toString(arr3));
}

private static int[] mergeArrays(int[] arr1, int[] arr2) {
	int arr3[]=new int[arr1.length+arr2.length];
	for(int i=0;i<arr3.length;i++) {
		if(i<arr1.length)
			arr3[i]=arr1[i];
		else
			arr3[i]=arr2[i-arr1.length];
	}
	return arr3;
}
}
