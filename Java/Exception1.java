package org.java_mentorseries.day09;

//	 ■ 예외(Exception): 프로그램 실행중 발생하는 오류 중에서 처리가 가능한 것
//	 ■ 유사단어
//		- 에러: 개발자가 조치를 취할 수 없는 수준 ex)메모리부족,JVM 동작이상
//		- 컴파일에러: 컴파일 시 발생하는 에러 ex)오타,잘못된 자료형 등
//		- 런타임에러: 프로그램 실행 도중에 발생하는 에러
//		- 로직에러: 실행은 되지만 의도와는 다르게 동작하는 에러
//		- 예외: 다른방식으로 처리 가능한 오류 ex)입력값 오류,네트워크 문제 등
//
//	 ■ 예외처리(Exception Handling):
//		  예외가 발생했을 때 이를 적절히 처리하여 프로그램 비정상 종료를 방지
//
//	 ■ try~catch 문
//		: 예외발생 시, 적절하게 처리하기 위해 JAVA에서 제공하는 예외처리 문법
//	   finally 문
//		: try~catch 문에 선택적으로 추가하는 문법, 오류여부 관계없이 무조건 실행
//		 -> N/W 연결 시, 외부와의 연결을 종료하는 작업에 주로 사용
//		<구조>
//		 try {
//			예외가 발생할 수 있는 명령;
//			}
//
//		 catch(발생할 수 있는 예외 클래스명) {
//				예외발생 시 실행할 명령;
//			}
//
//		 finally {
//			예외 발생하든 안하든 무조건 실행하는 명령;
//			}
//
//	 ■ 예외클래스
//		- ArithmeticException: 산술연산 관련 오류
//		- ArrayIndexOutofBoundsException: 배열 인덱스 접근 오류
//		- IndexOutOfBoundsException: 배열 길이 오류



public class Exception1 {

//	예문1
	
//	public static void main(String[] args) {
//			int a = 0;
//			int b = 2;
//			int c = b/a;
////			 -> Exception in thread "main" 
////				java.lang.ArithmeticException 오류 발생
////				0으로 나눌 수 없어 나오는 오류	
//			
//	}
//}
//	예문2

//	public static void main(String[] args) {
//		try {
//			int []a = {2,0};
//			int b = 4;
//			int c = b/a[2]; //배열의 index [0],[1]
//			System.out.println(c);
//		}
//		catch (ArithmeticException e) {
//			System.out.println("산술 오류 발생");
//		}
//		catch (IndexOutOfBoundsException e) {
//			System.out.println("배열 길이 오류 발생");
//		}
//		System.out.println("예외처리 공부 중");
//		
//		
//	}
//}

//	예문3

	public static void main(String[] args) {
//		외부로 접근
		int a = 0;
		int b = 2;
		try {
			System.out.println("외부로 접속");
			int c = b/a;
		}
		catch (ArithmeticException e) {
			System.out.println("오류가 발생하였습니다");
		}
		finally {
			System.out.println("무조건 연결해제");
		}
	}
}
