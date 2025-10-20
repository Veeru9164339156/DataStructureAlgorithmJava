package numberSystem;
import java.util.Scanner;
public class MainDate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first Date");
		
		Date d1=new Date(15,8,1947);
		Date d2=new Date(04,03,2025);
		int d=noOfDays(d1,d2);
		System.out.println(d);
	}
	
}
