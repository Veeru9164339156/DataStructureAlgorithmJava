package OneDArrayPrograms;

import java.util.Arrays;

public class MergeZigZagOrder {
public static void main(String[] args) {
	int ar1[]= {2,3,6,7,9,12,34};
	int ar2[]= {4,15,8,45,89};
	int merge[]=mergeZigZag(ar1,ar2);
	System.out.println(Arrays.toString(merge));
}

private static int[] mergeZigZag(int[] ar1, int[] ar2) {
	int res[]=new int[ar1.length+ar2.length];
	int i=0,j=0;
	while(i<ar1.length && i<ar2.length) {
		res[j++]=ar1[i];
		res[j++]=ar2[i++];
	}
	while(i<ar1.length) {
		res[j++]=ar1[i++];
	}
	while(i<ar2.length) {
		res[j++]=ar2[i++];
	}
	return res;
}
}
