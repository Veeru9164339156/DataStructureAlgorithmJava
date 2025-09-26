package OneDArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotationArrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ar[]= {2,8,6,9,3,4};
		System.out.println("Enter the no how many time rotate array");
		int n=sc.nextInt();
		rightRotaion(ar,n);
		System.out.println(Arrays.toString(ar));
	}
	private static void rightRotaion(int[] ar, int n) {
		n=n%ar.length;
		reverse(ar,ar.length-n,ar.length-1);
		reverse(ar,0,ar.length-n-1);
		reverse(ar,0,ar.length-1);
	}
	private static void reverse(int[] ar, int low, int high) {
		while(low<high) {
			int temp=ar[low];
			ar[low]=ar[high];
			ar[high]=temp;
			low++;
			high--;
		}
	}
}
