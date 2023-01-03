package org.java_mentorseries.day09;

//	 ■ 객체로서의 예외: JAVA에서 예외는 Exception 클래스의 객체
//		- 모든 예외 클래스들은 Exception 클래스를 상속 받음 Exception으로 처리가능
//		- 예외 클래스들에서 Exception 클래스 메서드 사용가능
//			ex)getMessage(),toString(),printStackTrace(),...
//
//	   한번에 모든 예외 처리하는 방법
//		<구조>
//		 try {
//			예외가 발생할 수 있는 명령;
//			}
//
//		 catch(Exception e) {
//			예외 발생시 처리할 명령;
//			}
//
//	 ■ throw: 프로그래머가 고의로 예외를 발생시킬 때 사용
//		<구조>
//		 Exception e = new Exception("Exception");
//		 throw e;
//
//	 ■ throws: 예외가 발생했을 경우 현재 메서드가 예외를 처리하지 않고 자신을 호출 한쪽으로
//			   예외 처리에 대한 책임을 넘기는 것
//		<구조>
//		 void method() throws Exception{...}
//
//	   ※ JAVA에서는 사용자가 예외 클래스를 직접 정의 가능
//


public class Exception2 {
	
//	예문1

//	public static void main(String[] args) {
//		try {
//			Exception e = new Exception("고의 예외");
////		-> 	Exception 생성자 호출 시 전달했던 문자열이 저장되어, 객체를 호출하면 출력됨
//			throw e; //고의적으로 예외를 발생
//		}
//		catch (Exception e) {
//			System.out.println("예외발생");
//			System.out.println(e.getMessage());
//		}
//
//	}
//
//}
	
//	예문2
	
//	public static void main(String[] args) {
//		try {
//			methodA();
//		}
//		catch (Exception e) {
//			System.out.println("메인에서 처리");
//		}
//	}
//	
//	public static void methodA() throws Exception {
//		methodB();
//	}
//	public static void methodB() throws Exception {
//		methodC();
//	}
//	public static void methodC() throws Exception {
//		Exception e = new Exception();
//		throw e; //고의적 예외발생
//	}
//}

//	예문3

//	public static void main(String[] args) {
//		try {
//			System.out.println("외부 try...");
//			
//			try {
//				System.out.println("내부 try...");
//				Exception e = new Exception();
//				throw e;
//			}
//			catch (Exception e) {
//				System.out.println("(내부 try-catch) exception: "+e);
//				System.out.println("예외던지기 한번더: ");
//				throw e;
//			}
//			finally {
//				System.out.println("finally 구문 출력");
//			}
//		}
//		catch (Exception e) {
//			System.out.println("(외부 try-catch) exception: "+e);
//		}
//		System.out.println("종료");
//			
//	}
//}

//	예문: 사용자 정의 예외 -> 기존 예외 클래스로 예외 표현 불가능 할 경우 만들어서 사용

	public static void main(String[] args) {
		int age = -19;
		try {
			ticketing(age);
		}
		catch (AgeException e) {
			e.printStackTrace();
		}
	}
	public static void ticketing(int age) throws AgeException {
		if (age<0) {
			throw new AgeException("나이 입력이 잘못되었습니다.");
		}
	}
}

class AgeException extends Exception {
	public void AgeException() {}
	public AgeException(String message) {
		super(message);
	}
}
