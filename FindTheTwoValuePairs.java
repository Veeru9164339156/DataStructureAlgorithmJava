package OneDArrayPrograms;

import java.util.Arrays;

public class FindTheTwoValuePairs {
public static void main(String[] args) {
	int[]ar= {2,3,4,5,6,1,8,7};
	int pair[]=getPair(ar,9);
	System.out.println(Arrays.toString(pair));
}

private static int[] getPair(int[] ar, int target) {
	for(int i=0;i<ar.length;i++) {
		for(int j=i+1;j<ar.length;j++) {
			if(ar[i]+ar[j]==target) {
				return new int[]{ar[i],ar[j]};
			}
		}
	}
	return null;
}
}
