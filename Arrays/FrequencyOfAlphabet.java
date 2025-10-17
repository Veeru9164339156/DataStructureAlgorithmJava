package arrayprograms;

public class FrequencyOfAlphabet {
public static void main(String[] args) {
	String str="Amma";
	int[]ct=new int[26];
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch>='A'&& ch<='Z')
			ct[ch-65]++;
		else if(ch>='a'&& ch<='z')
			ct[ch-97]++;
	}
	for(int i=0;i<26;i++)
	{
		if(ct[i]!=0)
			System.out.println((char)(65+i)+"-->"+ct[i]);
	}
}
}
