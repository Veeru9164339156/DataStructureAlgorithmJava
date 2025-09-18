package OneDArrayPrograms;

public class FrequencyOfElementsOnlyPositiveInetger {
public static void main(String[] args) {
	int ar[]= {1,2,4,5,6,7,8,9,1,2,3,5};
	frequencyOfEachElement(ar);
}
private static void frequencyOfEachElement(int[] ar) {
	int big=ar[0];
	for(int i=0;i<ar.length;i++) {
		if(ar[i]>big) {
			big=ar[i];
		}
	}
	int freq[]=new int[big+1];
	for(int i=0;i<freq.length;i++) {
		freq[ar[i]]++;
	}
	
	for(int i=0;i<freq.length;i++) {
		if(freq[i]!=0) {
			System.out.println(i+"->"+freq[i]);			
		}
	}
}
}
