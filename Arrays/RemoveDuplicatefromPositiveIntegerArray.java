package OneDArrayPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatefromPositiveIntegerArray {
public static void main(String[] args) {
	int []ar= {1,2,4,5,6,3,2};
	int [] res=getRemoveDuplicatedArray(ar);
	System.out.println(Arrays.toString(res));
}
//remove dulicate without using any built in methods and efficient code
private static int[] getRemoveDuplicatedArray(int[] ar) {
	int count=0;
	for(int i=0;i<ar.length;i++) {
		if(ar[i]!=-1) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					count++;
					ar[j]=-1;
				}
			}
		}
	}
	int y[]=new int[ar.length-count];
	for(int i=0,j=0;i<ar.length;i++) {
		if(ar[i]!=-1) {
			y[j++]=ar[i];
		}
	}
	return y;
	
//	 Set<Integer> st=new HashSet<Integer>();
//	 for(int ele:ar) {
//		 st.add(ele);
//	 }
//	int res[]=new int[st.size()];
//	int i=0;
//	for(int ele:st) {
//		res[i++]=ele;
//	}
//	return res;
}
}
