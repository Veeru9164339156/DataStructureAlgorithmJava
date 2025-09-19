package StringPrograms;

public class CountVowelAndConsonents {
public static void main(String[] args) {
	String str="I Love java";
	int vCount=0,cCount=0;
	str=str.toLowerCase();
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch>='a'&&ch<='z') {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			vCount++;
		}
		else
			cCount++;
	}
	}
	System.out.println("vowel count:"+vCount);
	System.out.println("Consonents count:"+cCount);
	}
}
