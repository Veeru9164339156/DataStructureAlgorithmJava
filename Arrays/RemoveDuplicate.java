package arrayprograms;

public class RemoveDuplicate {
public static void main(String[] args) {
	int[] ar= {1,2,-1,2,-1,5,3};
	int[] rs=removeDuplicate(ar);
	for(int i=0;i<rs.length;i++) {
		System.out.print(rs[i]+" ");
	}
}
static int[] removeDuplicate(int []x) {
	boolean []rs=new boolean[x.length];
	int count=0;
	for(int i=0;i<x.length;i++) {
		if(rs[i]==false) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j])
				{
					count++;
					rs[j]=true;	
				}
			}
		}
	}
	int [] newar=new int[x.length-count];
	for(int i=0 ,j=0;i<x.length;i++) {
		if(rs[i]!= true)
			newar[j++]=x[i];
	}
	return newar;
}
}
