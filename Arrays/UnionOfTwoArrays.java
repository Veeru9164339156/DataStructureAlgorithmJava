package ImportantArrayprgrams;

import java.util.Arrays;

public class UnionOfTwoArrays {
public static void main(String[] args) {
	int []a= {1,2,3};
	int []b= {3,5,4,2};
	int []c=union(a,b);
	System.out.println(Arrays.toString(c));
}

private static int[] union(int[] a, int[] b) {
	int res[]=new int[a.length+b.length];
	for(int i=0;i<a.length;i++) {
		res[i]=a[i];
	}
	int in=a.length;
	for(int i=0;i<b.length;i++) {
		int j=0;
		for(;j<a.length;j++) {
			if(b[i]==a[j]) {
				break;
			}
			if(j==a.length) {
				res[in++]=b[i];
			}
		}
	}
	int []rs=new int[in];
	for(int i=0;i<in;i++) {
		rs[i]=res[i];
	}
	return rs;
}
}
