import java.util.Scanner;

public class Date {
	
	int dd,mm,yy;
	int month []= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	String [] days= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
	public Date(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		if(yy%4==0||yy%100!=0||yy%400==0)
			month[2]=29;
	}
	public String toString()
	{
		return dd+"-"+mm+"-"+yy;
	}
	public int noOfDays()
	{
		int y=yy-1;
		int sum=dd;
		for(int i=1;i<mm;i++)
		{
			sum=sum+month[i];
		}
		sum=sum+365*y;
		sum=sum+(y/4+y/400-y/100);
		return sum;
	}
	public String getDayName()
	{
		int ds=noOfDays();
		return days[ds%7];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first date");
		int d1=sc.nextInt();
		int m1=sc.nextInt();
		int y1=sc.nextInt();
		
		System.out.println("Enter the Second date");
		int d2=sc.nextInt();
		int m2=sc.nextInt();
		int y2=sc.nextInt();
		
		Date dt1=new Date(d1, m1, y1);
		Date dt2=new Date(d2, m2, y2);
		
		System.out.println(dt2.noOfDays()-dt1.noOfDays());
		System.out.println(dt1.getDayName());
		System.out.println(dt2.getDayName());
	}
}
