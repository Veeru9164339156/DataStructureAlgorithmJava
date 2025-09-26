package OneDArrayPrograms;
import java.util.Arrays;
public class IntersectionArrays {
public static void main(String[] args) {
	int a[]= {1,5,6,7,8};
	int b[]= {2,5,7,9,10};
	int c[]=getIntersection(a,b);
	System.out.println(Arrays.toString(c));
}
private static int[] getIntersection(int[] a, int[] b) {
	int res[]=new int[a.length];
	int k=0;
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<b.length;j++) {
			if(a[i]==b[j]) {
				res[k++]=a[i];
				break;
			}
		}
	}
	int rs[]=new int[k];
	for(int i=0;i<k;i++) {
		rs[i]=res[i];
	}
	return rs;
}
}
