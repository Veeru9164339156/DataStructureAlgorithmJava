package OneDArrayPrograms;

import java.util.Arrays;

public class MergeTwoSortedArrayInSingleArraySorted {
	public static void main(String[] args) {
		int ar1[]= {23,45,67,89};
		int ar2[]= {19,28,37,46,55};
		int merge[]=mergeSortedArrays(ar1,ar2);
		System.out.println(Arrays.toString(merge));
	}

	private static int[] mergeSortedArrays(int[] ar1, int[] ar2) {
		int res[]=new int[ar1.length+ar2.length];
		int i=0,j=0,k=0;
		while(i<ar1.length && j<ar2.length) {
			if(ar1[i]<ar2[j]) {
				res[k++]=ar1[i++];
			}else {
				res[k++]=ar2[j++];
			}
		}
		while(i<ar1.length) {
			res[k++]=ar1[i++];
			
		}
		while(j<ar2.length) {
			res[k++]=ar2[j++];
			
		}
		return res;
	}
}
