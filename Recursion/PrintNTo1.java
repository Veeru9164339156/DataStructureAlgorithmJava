package Recursion;
import java.util.Scanner;
public class PrintNTo1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value");
	int n=sc.nextInt();
	System.out.println("main method stated");
	display(n);
	System.out.println("main method ended");
}
static void display(int n) {
	if(n==0)
		return;
	System.out.println(n);
	display(n-1);
}
}
