package StringPrograms;

public class RevrseTheWordsIntheSentence {
public static void main(String[] args) {
	String str="Java is good subject";
	String str1=reversewords(str);
	System.out.println(str1);
}
static String reversewords(String str) {
	String rev="";
	char []ch=str.toCharArray();
	for(int i=0;i<ch.length;i++) {
		int j=i;
		while(i<ch.length&&ch[i]!=' ') {
			i++;
		}
		int k=i-1;
		while(k>=j)
		{
			rev=rev+ch[k];
			k--;
		}
		rev=rev+" ";
	}
	return rev;
	
}
}
