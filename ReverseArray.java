package OneDArrayPrograms;

import java.util.Arrays;

public class ReverseArray {
public static void main(String[] args) {
	int ar[]= {1,4,5,6,8};
	int rev[]=getReverseArray(ar);
	System.out.println(Arrays.toString(rev));
}

private static int[] getReverseArray(int[] ar) {
	int f=0,l=ar.length-1;
	while(f<l) {
		int temp=ar[f];
		ar[f]=ar[l];
		ar[l]=temp;
		f++;
		l--;
	}
	return ar;
}
}
