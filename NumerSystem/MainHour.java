package numberSystem;
import java.util.Scanner;
public class MainHour {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first time(hour min am/pm)");
		int h1=sc.nextInt();
		int m1=sc.nextInt();
		String s1=sc.next();
		Hour hr1=new Hour(h1,m1,s1);
		System.out.println("enter the first time(hour min am/pm)");
		int h2=sc.nextInt();
		int m2=sc.nextInt();
		String s2=sc.next();
		Hour hr2=new Hour(h2,m2,s2);
		int diff=hr2.getHowMaNyHOurs()-hr1.getHowMaNyHOurs();
		if
		System.out.println("time bw two times "+diff);
	}

}
