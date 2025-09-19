package StringPrograms;

public class CheckSpecifiedStringPresentInMainStringOrNot {
public static void main(String[] args) {
	String ms="javascript is java a good subject java";
	String ss="b";
	//if(checkPresentOrNot(ms,ss))
		//System.out.println("present");
	//else
		//System.out.println("Not present");
	System.out.println(checkPresentOrNot(ms,ss)); 
}
static int checkPresentOrNot(String ms,String ss) {
	char mh[]=ms.toCharArray();
	char sh[]=ss.toCharArray();
	int count=0;
	for(int i=0;i<mh.length;i++) {
		int j=i,k=0;
		while(j<mh.length&&k<sh.length&&mh[j]==sh[k])
		{
			k++;
			j++;
		}
		if(sh.length==k)
			count++;
		i=j;
			//return true;
		
	}
	//return false;
	return count;
}
}
