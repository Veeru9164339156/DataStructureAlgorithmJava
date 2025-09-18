package OneDArrayPrograms;

import java.util.stream.IntStream;

public class Test {
public static void main(String[] args) {
	int n=8;
	boolean res=IntStream.rangeClosed(1, n/2)
	.filter(i->n%i==0).sum()==n;
	if(res) {
		System.out.println("perfect");
	}else {
		System.out.println("Not a perfect no");
	}
	
	boolean prime=IntStream.rangeClosed(2, n/2)
			.noneMatch(i->n%i==0);
	if(prime) {
		System.out.println("prime");
	}else {
		System.out.println("not a prime");
	}
}
}
