import java.util.Scanner;

public class Calendar_review {
	public static void main(String args[]){
		int[] days = {21, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.println("월을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		//System.out.println(days[month-1]);
		System.out.printf("%d 월은 %d 일입니다.", month, days[month-1]);
		scanner.close();
	}
}
