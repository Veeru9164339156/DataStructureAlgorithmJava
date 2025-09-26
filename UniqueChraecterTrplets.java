package bridge;

public class UniqueChraecterTrplets {
public static void main(String[] args) {
	String str="abcabcbb";
	int count=0;
	for(int i=0;i<str.length()-2;i++) {
		char ch1=str.charAt(i);
		char ch2=str.charAt(i+1);
		char ch3=str.charAt(i+2);
		if(ch1!=ch2 && ch2!=ch3 && ch1!=ch3) {
			count++;
		}
	}
	System.out.println(count);
}
}
