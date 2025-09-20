package StringPrograms;

public class PalindromeOrNot {
public static void main(String[] args) {
	String str="mom";
	if(checkPalindrome(str))
		System.out.println("palindrome");
	else
		System.out.println("Not a Palindrome");
}
static boolean checkPalindrome(String str) {
	int i=0,j=str.length()-1;
	while(i<j) {
		if(str.charAt(i)!=str.charAt(j))
			return false;
		i++;
		j--;
	}
	return true;
}
}
