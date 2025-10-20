package numberSystem;

public class ReverseSentenceOfAString {
public static void main(String[] args) {
	String s="I LoVe Java";
	String rs=reverse(s);
	System.out.println(rs);
}
static String reverse(String s) {
	char ch[]=s.toCharArray();
	String rs="";
	for(int i=ch.length-1;i>=0;i--) {
		int j=i;
		while(i>=0&&ch[i]!=' ') {
			i--;
		}
		int k=i+1;
		while(k<=j) {
			rs+=ch[k];
			k++;
		}
		if(i>=0)
		rs+=ch[i];
	}
	return rs;
}
}
