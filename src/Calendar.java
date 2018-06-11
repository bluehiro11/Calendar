import java.util.Scanner;

public class Calendar {
	public static void main(String args[]) {
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		//System.out.println("Hello Calendar");
		
		System.out.println("월을 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.println(maxDays[a-1] + "일 입니다.");
		System.out.printf("%d월은 %d일 입니다.\n", a, maxDays[a-1]);
		
		/*if(a> 12 || a < 1){
			System.out.println("적당한 월이 아닙니다.");
		}else if(a == 2){
			System.out.println("28일입니다.");
		}else if(a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a ==10 || a == 12){
			System.out.println("31일입니다.");
		}else{
			System.out.println("30일입니다.");
		}*/
		
		scanner.close();
		
	}
}
