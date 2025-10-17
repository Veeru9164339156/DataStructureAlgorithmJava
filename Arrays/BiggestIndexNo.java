package arrayprograms;

public class BiggestIndexNo {
	public static void main(String[] args) {
		int []ar= {100,20,500,0,1,5,6,9,25,30,75};
		int bindexno=findBiggestIndexNo(ar);
		System.out.println("index of the biggest element is:"+bindexno);
	}
	static int findBiggestIndexNo(int[] ar)
	{
		int biggest=0;
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]>ar[biggest])
				biggest=i;
		}
		return biggest;
		
	}
}
