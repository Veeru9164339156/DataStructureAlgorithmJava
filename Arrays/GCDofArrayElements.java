package arrayprograms;

class GCDofArrayElements {
public static void main(String[] args) {
	int ar[]= {16,32};
	getGcd(ar);
}
static void getGcd(int[]ar) {
	int x=ar[0];
	for(int i=1;i<ar.length;i++){
		x=gcd(x,ar[i]);
	}
	System.out.println("gcd of array elements is: "+x);
}
static int gcd(int a,int b) {
	
	while(b!=0)
	{
		int t=a%b;
	    a=b;
		b=t;
	}
	return a;
}
}
