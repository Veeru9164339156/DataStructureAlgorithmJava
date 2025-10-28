package ImportantArrayprgrams;

import java.util.Arrays;

public class DeleteAtSpecificIndex {
public static void main(String[] args) {
	int []ar= {1,2,3,4};
	int []rs=addElement(ar,2);//1,2,4
	if(rs!=null) {		
		System.out.println(Arrays.toString(rs));
	}else {
		System.out.println("index not in the range");
	}
}

private static int[] addElement(int[] ar, int index) {
	if(index<0 && index>ar.length) return null;
	
	int rs[]=new int[ar.length-1];
	for(int i=0;i<rs.length;i++) {
		if(i<index) {
			rs[i]=ar[i];
		}else {
			rs[i]=ar[i+1];
		}
	}
	return rs;
}
}
