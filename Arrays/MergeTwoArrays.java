package OneDArrayPrograms;

import java.util.Arrays;

public class MergeTwoArrays {
public static void main(String[] args) {
	int ar1[]= {2,3,6,7,9,12,34};
	int ar2[]= {4,15,8,45,89};
	int merge[]=mergeArrays(ar1,ar2);
	System.out.println(Arrays.toString(merge));
}

private static int[] mergeArrays(int[] ar1, int[] ar2) {
	int res[]=new int[ar1.length+ar2.length];
	for(int i=0;i<res.length;i++) {
		if(i<ar1.length) {
			res[i]=ar1[i];			
		}else {
			res[i]=ar2[i-ar1.length];
		}
	}
	return res;
}
}
