package arrayprograms;

public class SpecifiedElementpresent {
	public static void main(String[] args) {
		int ar[]= {1,4,7,2,5,7,8,3,7,7,8};
		int countspefiedele=findSpecifiedElementpresent(ar,7);
		System.out.println("element prerent in array :"+countspefiedele);
	}
	static int findSpecifiedElementpresent(int[] ar,int ele)
	{	int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==ele)
				count++;
		}
		return count;
	}
	}
