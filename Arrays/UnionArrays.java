package OneDArrayPrograms;

import java.util.Arrays;

public class UnionArrays {
	public static void main(String[] args) {
		int a[]= {1,5,6,7,8};
		int b[]= {2,5,7,9,10};
		int c[]=getUnion(a,b);
		System.out.println(Arrays.toString(c));
	}

	private static int[] getUnion(int[] a, int[] b) {
		int res[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			res[i]=a[i];
		}
		int k=a.length;
		for(int i=0;i<b.length;i++) {
			boolean rs=true;
			for(int j=0;j<a.length;j++) {
				if(b[i]==a[j]) {
					rs=false;
					break;
				}
			}
			if(rs) {
				res[k++]=b[i];
			}
		}
		
		int [] arr=new int[k];
		for(int i=0;i<k;i++) {
			arr[i]=res[i];
		}
		return arr;
	}
}
