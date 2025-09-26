package StringPrograms;

public class ReverseString {
public static void main(String[] args) {
	String str="veeresh k c";
	String rev="";
	for(int i=str.length()-1;i>=0;i--){
		char ch=str.charAt(i);
		rev+=ch;	
	}
	System.out.print(rev);
}
}
