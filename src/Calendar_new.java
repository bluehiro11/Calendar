import java.util.Scanner;

public class Calendar_new {
	private static final int[] MAX_DAYS = {21, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxDaysOfMonth(int month){
		return MAX_DAYS[month-1];
	}  
	
	public static void main(String args[]){
		System.out.println("월을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		Calendar_new cal = new Calendar_new();
		
		
		System.out.printf("%d 월은 %d 일입니다.\n", month, cal.getMaxDaysOfMonth(month));
		scanner.close();
	}
}
