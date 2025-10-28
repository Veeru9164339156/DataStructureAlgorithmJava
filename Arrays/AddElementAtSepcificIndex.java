package ImportantArrayprgrams;

import java.util.Arrays;

public class AddElementAtSepcificIndex {
public static void main(String[] args) {
	int []ar= {1,2,3,4};
	int []ar2= {6,5,7};
//	int []rs=addElement(ar,10,-3);//1,2,3,10,4
	int []res=addArray(ar,ar2,2);//1,2,6,5,7,3,4
	if(res!=null) {		
		System.out.println(Arrays.toString(res));
	}else {
		System.out.println("index not in the range");
	}
}

private static int[] addArray(int[] ar, int[] ar2, int index) {
	if(index < 0 || index > ar.length) return null;
	int res[]=new int[ar.length+ar2.length];
	for(int i=0;i<ar2.length;i++) {
		res[index+i]=ar2[i];
	}
	for(int i=0;i<ar.length;i++) {
		if(i<index) {
			res[i]=ar[i];
		}else {
			res[i+ar2.length]=ar[i];
		}
	}
	return res;
}


private static int[] addElement(int[] ar, int ele, int index) {
	if(index<0 || index>ar.length)
	{
		return null;
	}
	int res[]=new int[ar.length+1];
	res[index]=ele;
	for(int i=0;i<ar.length;i++) {
		if(i<index) {
			res[i]=ar[i];
		}else
		res[i+1]=ar[i];
	}
	return res;
}
}
