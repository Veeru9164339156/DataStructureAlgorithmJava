package OneDArrayPrograms;

import java.util.Arrays;

public class MergeTwoSortedArraysIntoSortedFromat {
	public static void main(String[] args) {
		int[] arr1={1,2,8,16,31,43,56,};
		int[] arr2={3,7,9,11,15,27,33,97};
		int[] arr3=getSortedArray(arr1,arr2);
		System.out.println(Arrays.toString(arr3));
	}
	private static int[] getSortedArray(int[] arr1, int[] arr2) {
		int arr3[]=new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		while(i<arr1.length&& j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				arr3[k++]=arr1[i++];
			}else {
				arr3[k++]=arr2[j++];
			}
		}
		while(i<arr1.length)
			arr3[k++]=arr1[i++];
		
		while(j<arr2.length)
			arr3[k++]=arr2[j++];

		return arr3;
	}
}
