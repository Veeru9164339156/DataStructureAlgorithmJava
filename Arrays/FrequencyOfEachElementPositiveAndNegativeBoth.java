package OneDArrayPrograms;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfEachElementPositiveAndNegativeBoth {
public static void main(String[] args) {
	int ar[]= {1,3,4,5,6,7,-1,-7,-4,3,6,-7};
	Map<Integer,Integer>map=frequencyOfEachElemt(ar);
	map.forEach((k,v)->System.out.println(k+"->"+v));
	
}
private static Map<Integer,Integer> frequencyOfEachElemt(int ar[]){
	Map<Integer,Integer> mp=new LinkedHashMap<>();
	for(int ele:ar) {
		if(mp.containsKey(ele)) {
			mp.put(ele, mp.get(ele)+1);
		}else {
			mp.put(ele, 1);
		}
	}
	return mp;	
}

//private static void FrequencyOfEachElemt(int[] ar) {
//	 
//	boolean []rs=new boolean[ar.length];
//	for(int i=0;i<ar.length;i++) {
//		if(rs[i]==false) {
//		int count=1;
//			for(int j=i+1;j<ar.length;j++) {
//				if(ar[i]==ar[j]) {
//					count++;
//					rs[i]=true;
//				}
//			}
//			System.out.println(ar[i]+"->"+count);
//		}
//	}
//}
}
