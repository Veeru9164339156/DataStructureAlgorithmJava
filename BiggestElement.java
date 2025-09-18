package OneDArrayPrograms;

public class BiggestElement {
public static void main(String[] args) {
	int ar[]= {1,5,7,8,9,4,23};
	int big=getBiggest(ar);
	System.out.println(big);
}
private static int getBiggest(int[] ar) {
	int big=ar[0];//  first assign first element as a biggest
	for(int i=0;i<ar.length;i++) {
		if(ar[i]>big) {
			big=ar[i];
		}
	}
	return big;
}
}
