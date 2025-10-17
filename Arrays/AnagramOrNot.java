package arrayprograms;
import java.util.Scanner;
public class AnagramOrNot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first string");
	String s1=sc.nextLine();
	System.out.println("eneter the second String");
	String s2=sc.nextLine();
	if(isAnagram(s1,s2))
	System.out.println("Anagram");
	else
		System.out.println("Not a Anagram");
}
static boolean isAnagram(String s1,String s2)
{
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	int []cts1=new int [26];
	int []cts2=new int [26];
	for()
	
}
}
