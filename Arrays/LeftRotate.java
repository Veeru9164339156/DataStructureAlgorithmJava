package arrayprograms;

public class LeftRotate {
public static void main(String[] args) {
	int []ar= {2,8,6,9,3,4};
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
//static void leftRotation(int[]x,int n) {
//	n=n%x.length;
//	reverse(x,0,n-1);
//	reverse(x,n,x.length-1);
//	reverse(x,0,x.length-1);
//}
//static  void reverse (int x[],int l,int h) {
//	while(l<h)
//	{
//	int t=x[l];
//	x[l]=x[h];
//	x[h]=t;
//	l++;
//	h--;
//	}
//}
//	//another way to leftrotate with
//	public static void main(String[] args) {
//		int []ar= {2,8,6,9,3,4};
//		System.out.println("original array");
//		for(int i=0;i<ar.length;i++)
//		{
//			System.out.print(ar[i]+" ");
//		}
//		System.out.println();
//		rightRotation(ar, 2);
//		System.out.println("Rotation array");
//		for(int i=0;i<ar.length;i++)
//		{
//			System.out.print(ar[i]+" ");
//		}
//	}
//	static void rightRotation(int x[], int n)
//	{
//		n=n%x.length;
//		int y[]=new int[n];
//		for(int i=0;i<n;i++)
//		{
//			y[i]=x[x.length-n+i];
//		}
//		for(int i=x.length-1;i>=
//				n;i--)
//		{
//			x[i]=x[i-n];
//		}
//		for(int i=0;i<y.length;i++)
//		{
//			x[i]=y[i];
//		}
//	}
public static void leftRotation(int []nums,int k) {
		k=k%nums.length;
		int x[]=new int[k];
		for(int i=0;i<k;i++) {
			x[i]=nums[i];
		}
		for(int i=0;i<nums.length;i++) {
			nums[i]=nums[k+i];
		}
		for(int i=k;i<=nums.length-k-i-1;i--) {
			nums[k+1]=x[i];
		}
}
}
	
