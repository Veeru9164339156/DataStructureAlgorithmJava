package numberSystem;

public class SunStringPresentOrNotInMString {
public static void main(String[] args) {
	String mS="chithradurga is a fort city";
	String sS="durgaw";
	if(checkSubString(mS,sS))
		System.out.println("subString is part of a mainString");
	else
		System.out.println("not a part of main String");
}
static boolean checkSubString(String ms,String ss) {
	
	char[] mh=ms.toCharArray();
	char[] sh=ss.toCharArray();
	for(int i=0;i<mh.length;i++) {
		int j=0,k=i;
		while(j<sh.length&&k<mh.length && mh[k]==sh[j]){
			k++;
			j++;
		}
		if(j==sh.length)
			return true;
	}
	return false;
}
}
