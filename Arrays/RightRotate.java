package arrayprograms;

public class RightRotate {
public static void main(String[] args) {
	int []ar= {2,8,9,6,3,5,1};
	System.out.println("original array");
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]+" ");
	}
	System.out.println();
	leftRotation(ar, 2);
	System.out.println("Rotation array");
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]+" ");
	}
}
static void leftRotation(int[]x,int n) {
	n=n%x.length;
	reverse(x,0,x.length-n-1);
	reverse(x,x.length-n,x.length-1);
	reverse(x,0,x.length-1);
}
static  void reverse (int x[],int l,int h) {
	while(l<h)
	{
	int t=x[l];
	x[l]=x[h];
	x[h]=t;
	l++;
	h--;
	}
}
}
