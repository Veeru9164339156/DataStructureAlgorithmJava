package arrayprograms;

public class HowManyElementsbwMandN {
public static void main(String[] args) {
	int []ar= {100,20,0,1,5,6,9,25,30,75};
	int ele=findHowManyElements(ar,1,25);
	System.out.println("elements bw m&n is:"+ele);
}
static int findHowManyElements(int []ar,int m,int n)
{
	int count=0;
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]>=m && ar[i]<=n)
		{
			count++;
		}
		
	}
	return count;
}
}
