

package numberSystem;
import java.util.Scanner;
public class Karpekar {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the integer");
	int n=sc.nextInt();
	if(isKarpekarNo(n))
	System.out.println("Karpekar no");
	else 
	System.out.println("Not a Karpekar");
}
static boolean isKarpekarNo(int n)
{
	int cd=countDigits(n);
	int x=n*n;
	int res=(x%(int)Math.pow(10, cd))+(x/(int)Math.pow(10,cd));
	if(res==n)
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
}
