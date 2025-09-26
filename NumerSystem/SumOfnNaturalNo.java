package Recursion;
import java.util.Scanner;
public class SumOfnNaturalNo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value");
	int n=sc.nextInt();
	int sum=getSum(n);
	System.out.println(sum);
}
static int  getSum(int n) {
	if(n==0)
		return 0;
	return n+getSum(n-1);
}
}
