package numberSystem;
import java.util.Scanner;
public class LcdOfTwoNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 1st number");
	int m=sc.nextInt();
	System.out.println("enter 2nd  number");
	int n=sc.nextInt();
	int max=(m>n)?m:n;
	int k=max;
	while(true)
	{
		if(max%m==0 && max%n==0) {
			System.out.println(max+" is a lcm");
			break;
		}
		max=max+k;
	}
}
}
