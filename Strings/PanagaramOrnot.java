package StringPrograms;
// By Using frequency technique slove this problem
public class PanagaramOrnot {
public static void main(String[] args) {
	String str="abcdefghijklmnopqrstuvwxyzs";
	if(isPanagram(str))
		System.out.println("Panagram");
	else
		System.out.println("Not a Panagram");
}
static boolean isPanagram(String str) {
	/*if(str.length()<26)
		return false;
	str=str.toLowerCase();
	for(char ch='a';ch<'z';ch++) {
		if(str.indexOf(ch)==-1)
			return false;
	}
	return true;*/
	if(str.length()<26)
		return false;
	int []rs=new int[26];
	for(int i=0;i<26;i++) {
		char ch=str.charAt(i);
		if(ch>='A'&&ch<='Z')
			rs[ch-'A']++;
		if(ch>='a'&&ch<='z')
			rs[ch-'a']++;	
	}
	for(int i=0;i<26;i++) {
		if(rs[i]==0)
			return false;
	}
	return true;
}
}
