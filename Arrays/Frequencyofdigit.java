package arrayprograms;

public class Frequencyofdigit {
public static void main(String[] args) {
	int ar[]= {8,-1,4,8,-1,6,-1,6};
	printFrequency(ar);
}
static void printFrequency(int []x) {
	boolean []rs=new boolean[x.length];
	for(int i=0;i<x.length;i++){
		if(rs[i]==false) {
			int count=1;
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
					count++;
					rs[i]=true;
				}
			}
			System.out.println(x[i]+"-->"+count);
		}
	}
}
}
