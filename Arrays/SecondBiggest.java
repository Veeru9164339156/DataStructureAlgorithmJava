package OneDArrayPrograms;

public class SecondBiggest {
public static void main(String[] args) {
	int ar[]= {1,5,7,8,9,4,23,34,76,87};
	int big=getSecondBiggest(ar);
	System.out.println(big);
}

private static int getSecondBiggest(int[] ar) {
	int fbig=ar[0],sbig=ar[1];
	for(int i=0;i<ar.length;i++) {
		if(ar[i]>fbig) {
			sbig=fbig;
			fbig=ar[i];
		}
		else if(ar[i]>sbig && ar[i]!=fbig) {
			sbig=ar[i];
		}
	}
	return sbig;
}
}
