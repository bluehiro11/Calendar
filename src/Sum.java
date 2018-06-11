import java.util.Scanner;

public class Sum {
	public static void main(String args[]){
			int a, b;
			Scanner sc = new Scanner(System.in);
			String s1, s2;
			System.out.println("두 수를 입력해주세요 :      ");
			s1 = sc.next();
			s2 = sc.next();
			
			//System.out.println(s1 + "," + s2);
			a = Integer.parseInt(s1);
			b = Integer.parseInt(s2);
			System.out.println(a + "," + b);
			//int c = a + b;
			//System.out.println("두 수의 합은 " + c  + "입니다.");
			//System.out.println("두 수의 합은 " + (a + b) + "입니다.");
			System.out.printf("두 수의 합은 %d 입니다.", a + b);
			System.out.printf("%d 와 %d 의 합은 %d 입니다.",a, b,  a + b);
			
			sc.close();
	}
}
