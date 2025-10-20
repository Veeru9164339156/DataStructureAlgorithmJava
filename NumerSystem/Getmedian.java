package numberSystem;

public class Getmedian {
public static void main(String[] args) {
	int []a= {2,5,7,8,9};
	int []b= {1,4};
	int rs=getMedian(a,b);
	System.out.println(rs);
}
static int getMedian(int []a,int []b) {
	int n=a.length+b.length;
	int m1=0,m2=0,ct=n/2;
	int i=0,j=0;
	while(ct>=0)
	{
		//m2=m1;
		if(i<a.length && j<b.length)
		{
			m2=m1;
			if(a[i]<b[j]) {
				//m2=m1;
				m1=a[i];
				i++;
			}
			else {
				//m2=m1;
				m1=b[j];
				j++;
			}
		}
		else if(i<a.length )
		{
			//m2=m1;
			m1=a[i];
			i++;	
		}
		else if(j<b.length)
		{
			//m2=m1;
			m1=b[j];
			j++;
		}
		ct--;
	}
	if(n%2==1)
		return m1;
	else 
		return (m1+m2)/2;
}
}
