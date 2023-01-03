package org.java_mentorseries.day01;
// 입력기능을 내 코드에 연결
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		
//		※한 줄씩 주석 단축키: Ctrl+/, 여러줄 주석 단축키: Ctrl+Shift+/
//		※한 줄씩 복사 단축키: Ctrl+Alt+방향키
		
//		■ 출력메서드
		
//		 1) System.out.print(출력값);
//		  : 줄바꿈 없이 출력값을 그냥 출력
//		 2) System.out.println(출력값);
//		  : 출력값을 출력한 후 줄을 바꿈 (ln -> line)
//		    ※sysout 커서 뒤에 Ctrl+Space 누르면 System.out.println 자동완성
//		 3) System.out.printf("형식지정자", 출력값);
//		  : 출력값을 지정한 형식으로 출력 (f -> format: 형식지정)
		
//		System.out.print("문자열값"); //문자열값
//		System.out.print('A'); //문자형값
//		System.out.print(100); //정수형값
//		System.out.print(3.14); //실수형값
		
//		System.out.println("문자열값"); //문자열값
//		System.out.println('A'); //문자형값
//		System.out.println(100); //정수형값
//		System.out.println(3.14); //실수형값

//		System.out.printf("%s", "문자열값"); //문자열: String
//		System.out.printf("%s", 'A'); //문자형: Character
//		System.out.printf("%s", 100); //정수형: Decimal
//		System.out.printf("%s", 3.14); //실수형: Float
		
//		 ■ 입력메서드 
//		  sc.next형식(); 으로 사용.
//		  반드시 아래에 라이브러리에서 import 후 진행
//		  import java.util.Scanner;
//		  main 함수에서 아래 명령어 입력
		  Scanner sc = new Scanner(System.in);
//		  Scanner를 sc라는 이름에서 scan 이나 scanner 로도 사용은 가능
//		  ※ 기능자체가 키보드로 입력한 입력값이됨
//		   -> System.out.println(sc.next()); 로 사용
		
//		 1) sc.next();
//		  : 문자열로 입력을 받아라
//		 2) sc.nextInt();
//		  : 정수값으로 입력 받아라
//		 3) sc.nextFloat();
//		  : 실수값으로 입력 받아라
//		 4) sc.nextLine();
//		  : 문자열로 띄어쓰기까지 입력받아라	
		
		System.out.println(sc.next());
		System.out.println(sc.nextInt());
		System.out.println(sc.nextFloat());
		System.out.println(sc.nextLine());
		 
		 
	}

}
