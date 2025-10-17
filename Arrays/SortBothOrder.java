package arrayprograms;

public class SortBothOrder {
public static void main(String[] args) {
	int ar[]= {1,6,4,9};
	boolean rs=isSort(ar);
	System.out.println(rs);
}
static boolean isSort(int[]ar)
{
	boolean as=true;
	boolean ds=true;
	for(int i=0;i<ar.length-1;i++)
	{
		if(ar[i]>ar[i+1])
			as=false;
		else if(ar[i]<ar[i+1])
			ds=false;
	}
	return as||ds;
}
}
