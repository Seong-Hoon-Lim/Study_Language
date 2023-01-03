import java.util.Scanner;

//	java_1 day04 반복문2
//	다중 for 반복문은 2회 이상은 사용하지 않는 것이 좋다.
//	continue 와 break 명령문은 프로그램이 커지면 사용하는 것이 좋다.
//	반복문에 변수명 처럼 지정 해줄 수 있음 (while 도 됨)
//		ex)  for1 : for (int i = 0; i < 5; i++)
//	프로그래밍에서 나누기 연산은 시간이 오래 걸리므로 잘 사용하지 않는 것이 좋다.

public class Test220818 {

	public static void main(String[] args) throws Exception {
//		int i = 0;
//		while (i < 10) {
//			int j = 0;
//			while (j < 10) {
//				System.out.println("i = " + i);
//				System.out.println("j = " + j);
//				System.out.println();
//				j++;
//			}
//			i++;
//		}
		
//		예제
//			int hour = 0;
//			while (hour < 24) {
//				int min = 0;
//				while (min < 60) {
//				
//					int sec = 0; //초
//					while (sec < 60) {
//						System.out.println(hour + "시 " + min + "분 " + sec + "초 ");
//						Thread.sleep(1000);
//						sec++; //1초 증가
//					}
//					min++; //1분 증가
//				}
//				hour++;
//			}
			
//			실습예제 1.
//			while문을 사용하여 구구단을 출력하는 프로그램을 작성하세요
			
//			System.out.println("----실습예제 1----");
//				int multiple = 1;
//				while (multiple < 10) {
//					int dan = 2;
//					while (dan < 10) {
//						System.out.print(dan + "x" + multiple + "=" + (dan*multiple) + "\t");
//						dan++;
//					}
//					System.out.println();
//					multiple++;
//				}			
//			
////			실습예제2.
////			1부터 100사이의 모든 정수 중 3의 배수만 한 줄에 5개씩 출력하세요
//			
//			System.out.println("----실습예제 2----");
//			int number = 1;
//			int count = 0; //출력한 횟수를 세는 변수
//			while (number <= 100) {
//				if (number % 3 == 0) {
//					System.out.print(number + "\t");
//					count++; //출력했으니 1증가시킴
//					if (count % 5 == 0) {
//						System.out.println();
//					}
//				}
//				number++;
//			}
//			System.out.println();
//			
////			for 반복문
//			
//			for (int i = 0; i < 10; i++) {
//				System.out.print(i );
//			}
//			System.out.println();
//			
////			예제
//			
//			int gugudan = 3;
//			for (int i = 1; i < 10; i++) {
//				System.out.printf("%d x %d = %d\n", gugudan, i, gugudan * i);
//			}
//			
////			break / continue 명령문
//			
//			for (int i = 0; i < 10; i++) {
//				for (int j = 0; j < 10; j++) {
//					System.out.println("실행");
//					break;
//				}
//				System.out.println("다음으로 이동..");
//			}
//			System.out.println("끝");
//			
//			for (int i = 0; i < 5; i++) {
//				if (i == 2) {
//					System.out.println(i);
//					continue;
//				}
//				System.out.println("test");
//			}
			
//			실습예제 1.
//			n과 m 변수에 두 숫자를 입력받아 가로의 길이가 n, 세로의 길이가 m인 직사각형 모양의 형태를 출력 해보세요.
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("----실습예제 1.----");
			System.out.println("가로 길이 입력 >> ");
			System.out.println("세로 길이 입력 >> ");
			int  garo = input.nextInt();
			int  sero = input.nextInt();
			
			for (int j = 0; j < sero; j++) {
				for (int i = 0; i < garo; i++) {
					System.out.print("*");
				}
				System.out.println();
			}			
			
//			실습예제 2.
//			정수 number를 입력 받아 해당 정수의 팩토리얼을 구하는 프로그램을 작성하세요.
//			※ factorial : 1부터 어떤 양의 정수 n 까지의 정수를 모두 곱한 것
			
			System.out.println("----실습예제 2.----");
			System.out.print("정수 입력 >>> " );
			int number = input.nextInt();
			int multiple = 1;
			
			for (int i = 1; i <= number; i++) {
				multiple*=i;
			}
			System.out.println(number + "! = " + multiple + "입니다." );			
			
			
//			실습예제 3.
//			정수 n을 입력 받아 n의 약수를 모두 더한 값을 출력하는 프로그램을 작성하세요.
			
			System.out.println("----실습예제 3.----");
			System.out.print("정수 입력 >>> ");
			int n = input.nextInt();
			int aliquot = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					aliquot += i;
				}
			}	
			System.out.println(n + "의 약수의 합은 " + aliquot + "입니다.");
			
	}
	
}
