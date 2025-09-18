package OneDArrayPrograms;

import java.util.Arrays;

public class SwapEveryElementWithNextElement {
public static void main(String[] args) {
	int ar[]= {1,5,6,7,8,9,45};
	int res[]=exchangeWithNigbour(ar);
	System.out.println(Arrays.toString(res));
}

private static int[] exchangeWithNigbour(int[] ar) {
	
	for(int i=0;i<ar.length-1;i=i+2) {
		int temp=ar[i];
		ar[i]=ar[i+1];
		ar[i+1]=temp;
	}
	return ar;
}
}
