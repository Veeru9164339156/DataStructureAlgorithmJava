package OneDArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllPossiblePairs {
 public static void main(String[] args) {
	 int[]ar= {4,5,4};
		List<int[]> list=getPair(ar,9);
		if(list==null) {
			System.out.println("not found");
		}else {
			for(int[] ele:list) {
				System.out.println(Arrays.toString(ele));
			}
		}
		
}
private static List<int[]> getPair(int[] ar, int target) {
	List<int[]> list=new ArrayList<int[]>();
	for(int i=0;i<ar.length;i++) {
		for(int j=i+1;j<ar.length;j++) {
			if(ar[i]+ar[j]==target) {
				list.add(new int[] {ar[i],ar[j]});
			}
			
		}
	}
	return list.isEmpty()?null:list;
}
}
