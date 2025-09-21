package numberSystem;
import java.util.Scanner;
public class EvenOrOdd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("entee the number");
	int n=sc.nextInt();
	//using modulus
	/*if(n%2==0)
		System.out.println(n+"  is Even no");
	else
		System.out.println(n+" is Odd no");*/
	//without using modulus
	/*if((n/2)*2==n)
		System.out.println("even");
	else
		System.out.println("odd");*/
	//without using if else
	/*switch(n%2) {
	case 0: System.out.println("even");
		break;
	case 1: System.out.println("Odd");
	}*/
	//without using control statements
	/*String []ar= {"even","odd"};
	System.out.println(ar[n%2]);*/
	//using bitwise operator
	if((n&1)==0)
		System.out.println("even");
	else
		System.out.println("even");
	
	}
}
