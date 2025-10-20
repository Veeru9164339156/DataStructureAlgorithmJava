package numberSystem;
import java.util.Scanner;
public class AramStrongNo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter th no");
	int n=sc.nextInt();
	if(isAramStrongNO(n))
		System.out.println(n+" is an AramStrongNO");
	else
		System.out.println(n+" is not an AramStrong No");
}
static boolean isAramStrongNO(int n) {
	int cd=countDigits(n);
	int sum=0,t=n;
	while(n!=0) {
		int d=n%10;
		sum=sum+pow(d,cd);
		n=n/10;
	}
	if(sum==t) 
		return true;
	else
		return false;
}
static int countDigits(int n) {
	int count=0;
	do {
		count++;
		n=n/10;
	}while(n!=0);
	return count;
}
static int pow(int n,int p) {
	int prod=1;
	while(p>0) {
		prod=prod*n;
		p--;
	}
	return prod;
}
}
