package OneDArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class FillArrayWithArmStrongNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the size of array");
		int n = sc.nextInt();
		long[] arm = new long[n];
		 int count=0,k=0;
		 //.............. Using while loop..................
//	     int num = 1;
//	        while (count < n) {
//	            if (isArmStrong(num)) {
//	                arm[k++]=num;
//	                count++;
//	            }
//	            num++;
//	        }
		 ///............... Using for loop....................
		 for(int num=1;count<n;num++) {
			 if(isArmStrong(num)) {
				 arm[k++]=num;
				 count++;
			 }
		 }
		 
		System.out.println(Arrays.toString(arm));
	}

	private static boolean isArmStrong(int n) {
		int cd = countDigits(n);
		int sum = 0, temp = n;
		do {
			int d = n % 10;
			sum = sum + (int) Math.pow(d, cd);
			n /= 10;
		} while (n != 0);
		return sum == temp;
	}
	
	static int countDigits(int n) {
		int count = 0;
		do {
			count++;
			n /= 10;
		} while (n != 0);
		return count;
	}
}
