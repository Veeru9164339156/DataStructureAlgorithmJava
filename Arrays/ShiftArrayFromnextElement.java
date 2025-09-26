package OneDArrayPrograms;

import java.util.Arrays;

public class ShiftArrayFromnextElement {
public static void main(String[] args) {
	int arr[]= {2,4,6,8,9,7,3,5};
	int n=arr.length;
	int k=1;
	k=k%n;
	int temp[]=new int[n];
	for(int i=0;i<arr.length;i++) {
		temp[(i+k+n)%n]=arr[i];
	}
	System.out.println(Arrays.toString(temp));
}
}
