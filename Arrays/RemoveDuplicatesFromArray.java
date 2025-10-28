
package ImportantArrayprgrams;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromArray {
public static void main(String[] args) {
	int ar[]= {1,2,3,2,5,6,7,7};
	int res[]=removeDuplicate(ar);
//	int rs[]=removeDuplicates(ar);
	System.out.println(Arrays.toString(res));
}

private static int[] removeDuplicates(int[] ar) {
	
	HashSet<Integer> hs=new HashSet<Integer>();
	for(int i=0;i<ar.length;i++) {
		hs.add(ar[i]);
	}
	int i=0;
	int rs[]=new int[hs.size()];
	for(int ele:hs) {
		rs[i++]=ele;
	}
	return rs;
}

private static int[] removeDuplicate(int[] ar) {
	int br[]=new int[ar.length];
	int x=0;
	for(int i=0;i<ar.length;i++) {
		int j=0;
		for(;j<x;j++) {
			if(ar[i]==br[j]) {
				break;
			}
		}
		if(j==x) {
			br[x++]=ar[i];
		}
	}
	
	int res[]=new int[x];
	for(int i=0;i<x;i++) {
		br[i]=res[i];
	}
	return res;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	int br[]=new int[ar.length];
//	int x=0;
//	for(int i=0;i<ar.length;i++) {
//		int j=0;
//		for(;j<x;j++) {
//			if(ar[i]==br[j])
//				break;
//		}
//		if(j==x) {
//			br[x++]=ar[i];
//		}
//	}
//	int cr[]=new int[x];
//	for(int i=0;i<x;i++) {
//		cr[i]=br[i];
//	}
//	return cr;

}
}
