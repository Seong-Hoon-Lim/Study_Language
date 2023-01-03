import java.util.Scanner;

public class ConExam {
	
//	조건문 실습

	public static void main(String[] args) {
		
//		실습예제 1.
//		임의의 정수를 입력 받아 가장 큰 수를 출력하는 프로그램을 구현하세요.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("----실습예제1----");
		System.out.print("정수1 입력: ");
		int num1 = input.nextInt();
		System.out.print("정수2 입력: ");
		int num2 = input.nextInt();
		System.out.print("정수3 입력: ");
		int num3 = input.nextInt();
		
		//조건연산 방법도 있음.			
		
		if (num1 > num2) {
			System.out.println("가장 큰 수는 " + num1 + "입니다.");
		}
		else if (num1 > num3) {
			System.out.println("가장 큰 수는 " + num1 + "입니다.");
		}
		else if (num2 > num3) {
			System.out.println("가장 큰 수는 " + num2 + "입니다.");
		}
		else if (num3 > num1) {
			System.out.println("가장 큰 수는 " + num3 + "입니다.");
		}
		else {
			System.out.println("가장 큰 수는 " + num2 + "입니다.");
		}		
		
//		실습예제 2.
//		임의의 정수를 입력 받은 뒤 해당 값이 3의 배수인지 아닌지 판별하는 프로그램을 구현하세요.
		
		System.out.println("----실습예제2----");
		System.out.print("임의의 정수를 입력하세요. >>> ");
		int number = input.nextInt();
		boolean result = (number % 3) == 0;
		
		if (result) {
			System.out.println(number + "는(은) 3의 배수입니다.");
		}
		else {
			System.out.println(number + "는(은) 3의 배수가 아닙니다.");
		}
		
//		실습예제 3.
//		사용자로부터 시험 성적 3개를 입력 받고, 세 과목의 평균을 구해 평균에 따라 등급과 평균을 출력하세요.
//		평균은 소수점 1번째 자리까지 출력합니다. 평균이 80이상일 경우 A, 50이상일 경우 B, 30 이상일 경우 C, 그 이하일 경우 D를 출력하세요.
		
		System.out.println("----실습예제3----");
		System.out.print("국어 성적 입력: ");
		int korean = input.nextInt();
		System.out.print("수학 성적 입력: ");
		int math = input.nextInt();
		System.out.print("영어 성적 입력: ");
		int english = input.nextInt();
		
		double ave = (korean + math + english) / 3.0;
		System.out.printf("평균 점수 : %1f", ave);		
		System.out.println();
		String grade;
		
		if (ave >= 80) {	
			 grade = "A";
		}
		else if (ave >= 50) {
			 grade = "B";
		}
		else if (ave >= 30) {
			 grade = "C";
		}
		else {
			 grade = "D";
		}
		System.out.println("등급: " + grade);
	}

}
