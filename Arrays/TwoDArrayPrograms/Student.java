package TwoDArray2DArray;
import java.util.Scanner;
public class Student {
int sId;
String sName;
double sMarks;
public Student(int sId, String sName, double sMarks) {
	super();
	this.sId = sId;
	this.sName = sName;
	this.sMarks = sMarks;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter how many student infomation");
	int n=sc.nextInt();
	Student[] st=new Student[n];
	for(int i=0;i<st.length;i++)
	{
		System.out.println("enter the sid,name and marks of student");
		int id=sc.nextInt();
		String name=sc.next();
		double marks=sc.nextDouble();
		st[i]=new Student(id,name,marks);
	}
	Student hp=st[0];
	for(int i=0;i<st.length;i++)
	{
		if(st[i].sMarks>hp.sMarks)
			hp=st[i];
	}
	System.out.println("highest marks student info");
	System.out.println(hp.sId+","+hp.sName+","+hp.sMarks);
}
}
