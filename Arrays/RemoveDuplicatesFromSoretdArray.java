import java.util.Arrays;

public class RemoveDuplicatesFromSoretdArray {
	//remove Duplicates when we have both positive and negative but it works for only if the arrays is in sorted format.
public static void main(String[] args) {
	int ar[]= {1,2,2,3,4,4,5};
	int x=0;
	for(int i=1;i<ar.length;i++) {
		if(ar[i]!=ar[x]) {
			x++;
			ar[x]=ar[i];
		}
	}
	int rs[]=new int[x+1];
	for(int i=0;i<rs.length;i++) {
		rs[i]=ar[i];
	}
	System.out.println(Arrays.toString(rs));
}
}
