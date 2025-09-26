package ArraysClssprograms;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesfromArraylist {
public static void main(String[] args) {
	ArrayList<Integer> al =new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(10);
	al.add(40);
	al.add(20);
	System.out.println("****enterd Arraylist******");
	for(Integer a:al) {
		System.out.println(a);
	}
	
	//by using set
	System.out.println("By using set after removeing duplicate the array id\n");
	HashSet<Integer>hs=new HashSet<Integer>(al);
	ArrayList<Integer>all=new ArrayList<Integer>(hs);
	for(Integer a:all) {
		System.out.println(a);
	}
	//without using set
	System.out.println("By using without using set after removeing duplicate the array id\n");
	ArrayList<Integer> al2=new ArrayList<Integer>();
	for(Integer i:al) {
		if(!al2.contains(i)) {
			al2.add(i);
		}
	}
	for(Integer k:al2) {
		System.out.println(k);
	}
}
}
