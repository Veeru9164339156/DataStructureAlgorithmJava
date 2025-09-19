package StringPrograms;

public class CheckSpecifiedWordPresentInTheStringOrNot {
public static void main(String[] args) {
	String ms="chithradurga is fort city";
	String ss="chithradurga";
	if(check(ms,ss))
	System.out.println("present");
	else 
		System.out.println("Not present");
}
static boolean check(String ms,String ss) {
	char []mh=ms.toCharArray();
	char []sh=ss.toCharArray();
	for(int i=0;i<mh.length;i++) {
		int j=0,k=i;
		while(j<sh.length&&k<mh.length&&mh[k]==sh[j]) {
			j++;
			k++;
		}
		if(j==sh.length) {
			if((i==0||mh[i-1]==' ')&&(mh[k]==' '||k==mh.length-1))
			return true;
		}
		}
	return false;
	}
}
