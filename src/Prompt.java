import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "cal> ";
	
	public void runPrompt(){
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
			cal.printCalendar(2017, month);
			}
		System.out.println("Bye~~");
		scanner.close();

	}
	
	public static void main(String args[]){
		Prompt p = new Prompt();
		p.runPrompt();
	}

	
}
