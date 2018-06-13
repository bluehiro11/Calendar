import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class CalendarWhile {
	private static final int[] MAX_DAYS =  {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxDaysOfMonth(int month){
		return MAX_DAYS[month - 1];
	}
	
	public static void main(String args[]){
		String PROMPT = "cal> ";
		Scanner scanner = new Scanner(System.in);
		CalendarWhile cal = new CalendarWhile();
		
		int month = 1;
		
		while(true){
			System.out.println("월을 입력하세요");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if(month == -1){
				break;
			}
			if(month > 12){
				continue;
			}
			System.out.printf("%d 월은 %d 일입니다", month, cal.getMaxDaysOfMonth(month));
			}
		System.out.println("Bye~~");
		scanner.close();
	}
	
}
