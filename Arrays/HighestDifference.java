package arrayprograms;

public class HighestDifference {
public static void main(String[] args) {
	int[] ar= {2,5,6,8,9,12,56,43};
	int hDiffrence=findHighestDifference(ar);
	System.out.println("Highest difference bw two conjegative values is: "+hDiffrence);
}
static int findHighestDifference(int[] a)
{
	int  maxdiff=a[1]-a[0];
	if(maxdiff<0)
		maxdiff=-maxdiff;
	for(int i=1;i<a.length-1;i++)
	{
		 int diff=a[i+1]-a[i];
		 if(diff<0)
			 diff=-diff;
		 if(diff>maxdiff)
			 maxdiff=diff;
	}
	return maxdiff;
}
}
