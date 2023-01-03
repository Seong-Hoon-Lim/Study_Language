import java.util.Scanner;

public class Test220816_1 {

	public static void main(String[] args) {
		
//		while 반복문: 반복 종료 조건을 설정
		
		Scanner input = new Scanner(System.in);

//		예제
//		System.out.println("단어를 입력하세요 >> ");
//		String word = input.nextLine();
//		
//		while (!word.equals("a")) {
//			System.out.println("단어를 다시 입력하세요 >> ");
//			word = input.nextLine();
//		}
//		System.out.println("a를 입력해서 종료합니다.");
		
		String code = "";
		
		while (!code.equals("AAAAA")) {
			System.out.println("현재까지 code: " + code);
			code += "A";
		}
		System.out.println("최종 code: " + code);
		
		
//		do-while 반복문

//		예제
		int a = 100;
		do {
			System.out.println("적어도 한번 실행");
		} while (a > 10);

		
//		for 반복문: 원하는 반복 횟수 설정

	}

}
