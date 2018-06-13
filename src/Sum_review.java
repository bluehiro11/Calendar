import java.util.Scanner;

public class Sum_review {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요");
		String s1, s2;
		s1 = scanner.next();
		s2 = scanner.next();
		int a, b;
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		System.out.printf("%d 와 %d 의 합은 %d 입니다.\n",a,b,a+b);
		
	}
}
