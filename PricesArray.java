package ArraysClssprograms;

public class PricesArray {
public static void main(String[] args) {
	int []prices = {4,7,1,14,2,3};
	int maxindex=Integer.MIN_VALUE;
	int minindex=Integer.MAX_VALUE;
	for(int i=0;i<prices.length;i++) {
		if(prices[i]>maxindex) {
			maxindex=i;
		}
		if(prices[i]<minindex) {
			minindex=i;
		}
	}
	int profit=maxindex-minindex;
	System.out.println(prices[profit]);
	
}
}
