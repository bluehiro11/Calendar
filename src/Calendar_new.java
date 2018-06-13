import java.util.Scanner;

public class Calendar_new {
	private static final int[] MAX_DAYS = {21, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxDaysOfMonth(int month){
		return MAX_DAYS[month-1];
	}  
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		Calendar_new cal = new Calendar_new();
		
		System.out.println("반복횟수를 입력하세요");
		int round = scanner.nextInt();
		
		for(int i = 0; i  < round ; i++){
		System.out.println("월을 입력하세요");
		int month = scanner.nextInt();	
		System.out.printf("%d 월은 %d 일입니다.\n", month, cal.getMaxDaysOfMonth(month));
		}
		System.out.println("Bye~~");
		scanner.close();
	}
}
