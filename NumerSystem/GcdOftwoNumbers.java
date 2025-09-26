package numberSystem;
import java.util.Scanner;
public class GcdOftwoNumbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 1st number");
	int m=sc.nextInt();
	System.out.println("enter 2nd  number");
	int n=sc.nextInt();
	int gcd=getGcd(m,n);
	/*int min=(m<n)?m:n;
	int max=(m>n)?m:n;
	while(true) 
	{
	int r=max%min;
	if(r==0) {
		System.out.println(min+"is a gcd");
		return;
	}
	max=min;
	min=r;
	}*/
	
	}
static int getGcd(int m,int n)
{
	while(n!=0)
	{
		int t=m%n; 
		m=n;
		n=t;
	}
	return m;
}	
}
