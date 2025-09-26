package OneDArrayPrograms;

import java.util.Arrays;

public class DeleteElementFromSpecificIndex {
public static void main(String[] args) {
	int ar[]= {1,4,5,63,7,8,9};
	int res[]=deleteElement(ar,2);
	System.out.println(Arrays.toString(res));
}
private static int[] deleteElement(int[] ar, int index) {
	if(index<0||index>=ar.length) {
		return ar;
	}
	int res[]=new int[ar.length-1];
	for(int i=0;i<res.length;i++) {
		if(i<index) {
			res[i]=ar[i];
		}else {
			res[i]=ar[i+1];
		}
	}
	return res;
}
}
