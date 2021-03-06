import java.util.Scanner;

public class CalendarWhile {
	private static final int[] MAX_DAYS =  {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxDaysOfMonth(int month){
		return MAX_DAYS[month - 1];
	}
	
	public void printCalendar(int year, int month) {
		System.out.printf("           <<%4d 년%3d월>>\n", year, month);
		System.out.println("  SU MO TU WE TH FR SA");
		System.out.println("-------------------------------");
		int maxday = getMaxDaysOfMonth(month);
		for(int i = 1; i <= maxday; i++){
		System.out.printf("%4d",i);
		if(i %7 == 0){
			System.out.println();
		}
		}
		System.out.println();
	}
		
	
}
