package OneDArrayPrograms;

public class MedianOfTwoSortedArrays {
public static void main(String[] args) {
	int [] ar1= {2,7,14,18};
	int [] ar2= {3,5,8,24};
	int median=getMedian(ar1,ar2);
	System.out.println("Median is "+median);
}

private static int getMedian(int[] ar1, int[] ar2) {
	int [] c=mergeSortedArrays(ar1,ar2);
	if(c.length%2==1) {
		return c[c.length/2];
	}else {
		return (c[c.length/2-1]+c[c.length/2])/2;
	}
}

private static int [] mergeSortedArrays(int[] ar1, int[] ar2) {
	int ar3[]=new int[ar1.length+ar2.length];
	int i=0,j=0,k=0;
	while(i<ar1.length && j<ar2.length) {
		if(ar1[i]<ar2[j]) {
			ar3[k++]=ar1[i++];
		}else {
			ar3[k++]=ar2[j++];
		}
	}
	while(i<ar1.length) {
		ar3[k++]=ar1[i++];
	}
	while(j<ar2.length) {
		ar3[k++]=ar2[j++];
	}
	return ar3;
}
}
