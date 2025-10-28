
package ImportantArrayprgrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AllBasicArrayPrograms {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar[] = {1,2,3,4};
//		int x[] = {2,3,4,5,6};
		System.out.println(Arrays.toString(ar));
//		System.out.println("enter the size of an array");
//		int n = sc.nextInt();
//		int x[] = new int[n];
//		System.out.println("Eneter " + n + " values");
//		for (int i = 0; i < x.length; i++) {
//			x[i]=sc.nextInt();
//		}
//		int big=getBiggest(x);
//		System.out.println("Biggest element is :"+big); 

//		int small=getSmallest(x);
//		System.out.println("Smallest element is :"+small);  

//		int secondBig = getSecondBig(ar);
//		System.out.println(secondBig);

//		int secSmall=getSecondSmall(ar);
//		System.out.println(secSmall);

//		getAsscendingArray(ar);
//		System.out.println(Arrays.toString(ar));

//		getDesendingArray(ar);
//		System.out.println(Arrays.toString(ar));

//		reverseArray(ar);
//		System.out.println(Arrays.toString(ar));

//		int sum=getSum(ar);
//		System.out.println("Sum is :" +sum);

//		double avg=getAvg(ar);
//		System.out.println("averge is :"+avg);

//		int res[]=getCopyArray(ar);
//		System.out.println(Arrays.toString(res));

//		int nthBig=getNthBiggest(ar,4);

//		System.out.println(nthBig);

		// Using linear serach
//		int index=getElement(ar,23);
//		System.out.println("Element persent at index :"+index);

//		int index = getElementByBinary(ar, 23);
//		System.out.println("Element persent at index :" + index);

//		int rs[] = mergeArrays(ar, x);
//		System.out.println(Arrays.toString(rs));

//		int rs[]=mergeArraysZigZag(ar,x);
//		System.out.println(Arrays.toString(rs));

//		int rs[]=removeDuplicates(ar);
//		System.out.println(Arrays.toString(rs));

//		countFrequencyOFEcahElement(ar);  --for only ineteger
//		countFreqencyOfEachElementWithNegative(ar);  --for both negative and positive integer also

//		int ele=findMissingNoInarray(x);
//		System.out.println(ele);

//		int duplicates[] = getDuplicates(ar);
//		System.out.println(Arrays.toString(duplicates));

//		int occurence=getOccurencyOfSpecifinedEle(ar,45);
//		System.out.println(occurence);
		
//		rotateArrayLeft(ar,3);
//		System.out.println(Arrays.toString(ar));
		
//		rotateArrayRight(ar,3);
//		System.out.println(Arrays.toString(ar));
		
//		rotateArray(ar,1);
//		System.out.println(Arrays.toString(ar));
		
//		System.out.println(twoArraysEqualsOrNot(ar,x));
		
//		int rs[]=getIntersection(ar,x);
//		System.out.println(Arrays.toString(rs));
		
//		int rs[]=getUnionOTwoArrays(ar,x);
//		System.out.println(Arrays.toString(rs));
		
//		ArrayList<int[]> pairs = getPairs(ar,8);
//		for(int [] pair:pairs) {
//			System.out.println(Arrays.toString(pair));
//		}
		
		
		
		
		
		
		
		
	}

	private static ArrayList<int[]> getPairs(int[] ar, int ele) {
		ArrayList< int []>al=new ArrayList<int[]>();
		for(int i=0;i<ar.length;i++ ) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]+ar[j]==ele) {
//					System.out.println(ar[i]+" "+ar[j]);
					int pair[]={ar[i],ar[j]};
					al.add(pair);	
				}
			}
		}
		return al;
	}

	private static int[] getUnionOTwoArrays(int[] x, int[] y) {
		int z[]=new int[x.length+y.length];
		for(int i=0;i<x.length;i++) {
			z[i]=x[i];
		}
		int k=x.length;
		for(int i=0;i<y.length;i++) {
			boolean rs=true;
			for(int j=0;j<x.length;j++) {
				if(y[i]==x[j]) {
					rs=false;
					break;
				}
			}
			if(rs) {
				z[k++]=y[i];
			}
		}
		
		int rs[]=new int[k];
		for(int i=0;i<k;i++) {
			rs[i]=z[i];
		}
		return rs;
	}

	private static int[] getIntersection(int[] ar1, int[] ar2) {
		int ar3[]=new int[ar1.length];
		int k=0;
		for(int i=0;i<ar1.length;i++) {
			for(int j=0;j<ar2.length;j++) {
				if(ar1[i]==ar2[j]) {
					ar3[k++]=ar1[i];
					break;
				}
			}
		}
		int rs[]=new int[k];
		for(int i=0;i<k;i++) {
			rs[i]=ar3[i];
		}
		return rs;
	}

	private static boolean twoArraysEqualsOrNot(int[] ar, int[] x) {
		if(ar.length!=x.length)
			return false;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=x[i])
				return false;
		}
		return true;
	}

	private static void rotateArray(int[] ar, int k) {
		k=k%ar.length;
		 int n=ar.length;
		int []temp=new int[ar.length];
		for(int i=0;i<ar.length;i++) {
			temp[(i+k+n)%n]=ar[i];
		}
		System.out.println(Arrays.toString(temp));
	}

	private static void rotateArrayRight(int[] ar, int n) {
		n=n%ar.length;
		reverse(ar,ar.length-n,ar.length-1);
		reverse(ar,0,ar.length-n-1);
		reverse(ar,0,ar.length-1);
		
	}

	private static void rotateArrayLeft(int[] ar, int n) {
		n=n%ar.length;
		reverse(ar,0,n-1);
		reverse(ar,n,ar.length-1);
		reverse(ar,0,ar.length-1);
	}
	private static void reverse(int[] ar, int i, int j) {
		
		while(i<j) {
			int temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			i++;
			j--;
		}
		
	}

	private static int getOccurencyOfSpecifinedEle(int[] ar, int ele) {
		int count=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==ele) {
				count++;
			}
		}
		
		return count;
	}

	private static int[] getDuplicates(int[] ar) {
		ArrayList<Integer> al=new ArrayList<>();

		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					if(!al.contains(ar[i])) {
						al.add(ar[i]);
					}
				}
			}
		}
		int rs[]=new int [al.size()];
		for(int i=0;i<al.size();i++) {
			rs[i]=al.get(i);
		}
		return rs;
	}

	private static int findMissingNoInarray(int[] ar) {
		int n = ar.length + 1;
		int expectedsum = n * (n + 1) / 2;
		int asum = 0;
		for (int i = 0; i < ar.length; i++) {
			asum += ar[i];
		}

		return expectedsum - asum;
	}

	private static void countFreqencyOfEachElementWithNegative(int[] ar) {
		boolean res[] = new boolean[ar.length];
		for (int i = 0; i < ar.length; i++) {
			if (res[i] == false) {
				int count = 1;
				for (int j = i + 1; j < ar.length; j++) {
					if (ar[i] == ar[j]) {
						count++;
						res[i] = true;
					}
				}
				System.out.println(ar[i] + " ->" + count);
			}
		}
	}

	private static void countFrequencyOFEcahElement(int[] ar) {
		int big = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > big) {
				big = ar[i];
			}
		}
		int freq[] = new int[big + 1];
		for (int i = 0; i < ar.length; i++) {
			freq[ar[i]]++;
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != 0) {
				System.out.println(i + " ->" + freq[i]);
			}
		}
	}

	private static int[] removeDuplicates(int[] ar) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != -1) {
				for (int j = i + 1; j < ar.length; j++) {
					if (ar[i] == ar[j]) {
						ar[j] = -1;
						count++;
					}
				}
			}
		}
		int rs[] = new int[ar.length - count];
		for (int i = 0, j = 0; i < ar.length; i++) {
			if (ar[i] != -1) {
				rs[j++] = ar[i];
			}
		}
		return rs;
	}

	private static int[] mergeArraysZigZag(int[] arr1, int[] arr2) {
		int arr3[] = new int[arr1.length + arr2.length];
		int i = 0, j = 0;
		while (i < arr1.length && i < arr2.length) {
			arr3[j++] = arr1[i];
			arr3[j++] = arr2[i++];
		}
		while (i < arr1.length)
			arr3[j++] = arr1[i++];

		while (i < arr2.length)
			arr3[j++] = arr2[i++];

		return arr3;
	}

	private static int[] mergeArrays(int[] ar1, int[] ar2) {
		int res[] = new int[ar1.length + ar2.length];
		for (int i = 0; i < res.length; i++) {
			if (i < ar1.length) {
				res[i] = ar1[i];
			} else {
				res[i] = ar2[i - ar1.length];
			}
		}
		return res;
	}

	private static int getElementByBinary(int[] ar, int ele) {
		int low = 0, high = ar.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (ar[mid] == ele) {
				return mid;
			}
			if (ele > ar[mid]) {
				low = mid + 1;
			} else
				high = mid - 1;
		}
		return -1;
	}

	private static int getElement(int[] ar, int ele) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == ele) {
				return i;
			}
		}
		return -1;
	}

	private static int getNthBiggest(int[] ar, int n) {
		for (int i = 0; i < ar.length; i++) {
			int count = 0;
			for (int j = 0; j < ar.length; j++) {
				if (ar[j] > ar[i]) {
					count++;
				}
			}
			if (count == n - 1) {
				return ar[i];
			}
		}
		return 0;

	}

	private static int[] getCopyArray(int[] ar) {
		int res[] = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			res[i] = ar[i];
		}
		return res;
	}

	private static double getAvg(int[] ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		return sum / ar.length;
	}

	private static int getSum(int[] ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}
		return sum;
	}

	private static void reverseArray(int[] ar) {
		int low = 0, high = ar.length - 1;
		while (low < high) {
			int temp = ar[low];
			ar[low] = ar[high];
			ar[high] = temp;
			low++;
			high--;
		}
	}

	private static void getDesendingArray(int[] ar) {
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = 0; j < ar.length - i - 1; j++) {
				if (ar[j] < ar[j + 1]) {
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}

	}

	private static void getAsscendingArray(int[] ar) {
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = 0; j < ar.length - i - 1; j++) {
				if (ar[j] > ar[j + 1]) {
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}

	}

	private static int getSecondSmall(int[] ar) {
		int fsmall = ar[0], ssmall = ar[1];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < fsmall) {
				ssmall = fsmall;
				fsmall = ar[i];
			} else if (ar[i] < ssmall && ar[i] != fsmall) {
				ssmall = ar[i];
			}
		}
		return ssmall;
	}

	private static int getSecondBig(int[] ar) {
		int fbig = ar[0], sbig = ar[1];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > fbig) {
				sbig = fbig;
				fbig = ar[i];
			} else if (ar[i] > sbig && ar[i] != fbig) {
				sbig = ar[i];
			}
		}
		return sbig;
	}

	private static int getSmallest(int[] ar) {
		int small = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] < small)
				small = ar[i];
		}
		return small;
	}

	private static int getBiggest(int[] ar) {
		int big = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > big)
				big = ar[i];
		}
		return big;
	}
}
