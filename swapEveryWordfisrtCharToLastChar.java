package StringPrograms;

public class swapEveryWordfisrtCharToLastChar {

	public static void main(String[] args) {
		String str="java is a Good subject so we are learn javA";
		String str1=initCaps(str);
		System.out.println(str1);
	}
	static String initCaps(String str) {
		char []ch=str.toCharArray();
		int f=0;
		for(int i=0;i<ch.length;i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				f=i;
			}
			else if((i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' '))
			{
				char temp=ch[i];
				ch[i]=ch[f];
				ch[f]=temp;
				
			}
		}
		return new String(ch);
	}
}
