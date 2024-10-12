import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

public class Demo3 {

	public static void main(String[] args) {
		
		String day=findDay(04, 06, 2012);
		System.out.println(day);
//		LocalDate d=LocalDate.of(2023,04, 26);
//		DayOfWeek day = d.getDayOfWeek();
//		System.out.println();
		
	}
	 public static String findDay(int month, int day, int year) {
	        String [] days={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
	        int [] mon={0,31,28,31,30,31,30,31,31,30,31,30,31};
	int y=year-1;
	int dd=day;
	if(year%4==0 && year%100!=0||year%400==0)
		mon[2]=29;
	for(int i=1;i<month;i++)
	{
	    dd=dd+mon[i];
	}
	
	dd=dd+(y*365)+(y/4)+(y/400)-(y/100);
	return days[dd%7];
	    }
}
