package bridge;

import java.util.Arrays;

public class SumOfItsNighbors {
public static void main(String[] args) {
	int ar[]= {2,4,6,8,10};
	int res[]=getNighourSum(ar);
	System.out.println(Arrays.toString(res));
}

private static int[] getNighourSum(int[] ar) {
	int res[]=new int[ar.length];
	for(int i=0;i<ar.length;i++) {
		if(i==0) {
			res[i]=ar[i]+ar[i+1];
		}else if(i==ar.length-1) {
			res[i]=ar[i-1]+ar[i];
		}else {
			res[i]=ar[i-1]+ar[i]+ar[i+1];
		}
	}
	return res;
}
}
