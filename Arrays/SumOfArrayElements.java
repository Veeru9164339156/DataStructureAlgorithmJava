package OneDArrayPrograms;

public class SumOfArrayElements {
public static void main(String[] args) {
	int ar[]= {1,3,4,65,7,7,8,9};
	int sum=getSum(ar);
	System.out.println(sum);
}

private static int getSum(int[] ar) {
	int sum=0;
	for(int ele:ar) {
		sum+=ele;
	}
	return sum;
}
}
