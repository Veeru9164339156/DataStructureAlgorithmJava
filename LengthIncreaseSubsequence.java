package OneDArrayPrograms;

public class LengthIncreaseSubsequence {
public static void main(String[] args) {
	int ar[]= {10, 22, 45, 33, 21, 50, 41, 60};
	int length=getLengthIncreaseSubSequence(ar);
	System.out.println(length);
}
private static int getLengthIncreaseSubSequence(int[] ar) {
	int hl=1;
	for(int i=1;i<ar.length;i++) {
		int count=1;
		while(i<ar.length && ar[i]>ar[i-1]) {
			count++;
			i++;
		}
		if(count>hl) {
			hl=count;
		}
	}
	return hl;
}
}
