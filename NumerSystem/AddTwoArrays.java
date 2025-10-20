package numberSystem;

public class AddTwoArrays {
public static void main(String[] args) {
	int a[] = {8,8,9};
	int b[]	= {5,6};
	int c[]=sumOfTwoArray(a,b);
	for(int i=0;i<c.length;i++) {
		System.out.print(c[i]+" ");
	}
}
static int[] sumOfTwoArray(int[]a,int[]b) {
	int []c;
	if(a.length>b.length)
		c=new int[a.length+1];
	else 
		c=new int[b.length+1];
	int i=0,carry=0;
	while(i<a.length &&i<b.length) {
		c[i]=a[i]+b[i]+carry;
		carry=c[i]/10;
		c[i]=c[i]%10;
		i++;
	}
	while(i<a.length) {
		c[i]=a[i]+carry;
		carry=c[i]/10;
		c[i]=c[i]%10;
		i++;
	}
	while(i<b.length) {
		c[i]=b[i]+carry;
		carry=c[i]/10;
		c[i]=c[i]%10;
		i++;
	}
	if(carry!=0) {
		c[i]=carry;
		return c;
	}
		
	else {
		int rs[]=new int[c.length-1];
		for(int j=0;j<rs.length;j++) {
			rs[j]=c[j];
		}
		return rs;
		}
}
}
