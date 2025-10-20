package numberSystem;

public class Date {
		int dd;
		int mm;
		int yy;
		int[]month= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String[]dName= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		Date(int dd,int mm, int yy)
		{
			this.dd=dd;
			this.mm=mm;
			this.yy=yy;
			if(yy%400==0||yy%4==0 &&yy%100!=0)
			month[2]=29;
		}
static int noOfDays() {
	int x=yy-1;
	int days=x*365+x/4-x/100+x/400;
	for(int i=1;i<mm;i++) {
		
	}
	return days;
}
}	
		
