package numberSystem;

public class ReverseString {
public static void main(String[] args) {
	String st="veeresh";
	//String rs=reverse(st);
	//System.out.println(rs);
	reverse(st);
}
/*static String reverse(String s) {
	char[] ch=s.toCharArray();
	int i=0,j=ch.length-1;
	while(i<j) {
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		i++;
		j--;
	}
	return new String(ch);
}*/
static void reverse(String s) {
	String rs="";
	for(int i=s.length()-1;i>=0;i--) {
		rs=rs+s.charAt(i);
	}
	System.out.println(rs);
}
}
