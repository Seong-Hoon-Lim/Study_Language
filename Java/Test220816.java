import java.util.Scanner;

//	java_1 day03 조건문,반복문1
//	if-else 조건문 사용 시 순서를 잘 못 맞추겠다면 정확한 조건식을 기재해주도록 한다.

public class Test220816 {

	public static void main(String[] args) {
		
////		if 조건문
////		예시
//		if (1 != 1) {
//			System.out.println("참 입니다.");
//		}
//		System.out.println("프로그램 끝");	
//		
////		if-else 조건문
////		예시
//		if (1 != 1) {
//			System.out.println("참 입니다.");
//		}
//		else {
//			System.out.println("거짓 입니다.");
//		}
//		System.out.println("프로그램 끝");	
		
//		if-else if 조건문
//		예시
		int age = 17;
		if (age >= 20) {
			System.out.println("성인 입니다.");
		}
		else if (age >= 17) { // == (20 <= age >= 17)
			System.out.println("고등학생 입니다.");
		}
		else if (age >= 14) {
			System.out.println("중학생 입니다.");
		}
		else {
			System.out.println("어린이 입니다.");
		}
		System.out.println("프로그램 끝");	
		
//		중첩 if 조건문 예시
		
		Scanner input = new Scanner(System.in);
//		String id = "java";
//		String pw = "java123";
//		
//		System.out.println("ID를 입력하세요 >> ");
//		String input_id = input.nextLine();
//		
//		if (id.equals(input_id)) { //String 은 기본 자료형이 아니므로 == 을 사용할 수 없음. .equals 를 사용하여 문자열 비교
//			System.out.println("ID가 일치합니다.");
//			System.out.println("PW를 입력하세요 >> ");
//			String input_pw = input.nextLine();
//			//입력한 input_pw 와 기존의 pw와 같다면
//			if (input_pw.equals(input_pw)) {
//				System.out.println("PW가 일치합니다.");
//				System.out.println("LOGIN 성공!");
//			}
//			else {
//				System.out.println("PW가 일치하지 않습니다.");
//			}
//		}
//		else {
//			System.out.println("ID가 일치하지 않습니다.");
//		}
//		
//		switch 조건문 == switch-case 조건문
		
		String addr = "청주";
		
		switch(addr) {
		case "대구":
			System.out.println("대구사람입니다.");
			break;
		case "서울":
			System.out.println("서울사람입니다.");
			break;
		case "부산":
			System.out.println("부산사람입니다.");
			break;
			default:
				System.out.println("그 외 지역입니다.");
		}
		
		
	}

}
