import java.util.Arrays;

public class RemoveDuplicateFromUnSortedArray {
//remove duplicates from unsorted array
public static void main(String[] args) {
	int ar[]= {1,2,3,2,4,3,5,1,-1,-6,-7,-6};
	int br[]=new int[ar.length];
	int x=0;
	for(int i=0;i<ar.length;i++) {
		int j=0;
		for(;j<x;j++) {
			if(ar[i]==br[j])
				break;
		}
		if(j==x) {
			br[x++]=ar[i];
		}
	}
	int cr[]=new int[x];
	for(int i=0;i<cr.length;i++) {
		cr[i]=br[i];
	}
	System.out.println(Arrays.toString(cr));
}
}
