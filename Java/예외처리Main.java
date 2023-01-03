import java.util.InputMismatchException;
import java.util.Scanner;

class 예외클래스 extends Exception {
	public 예외클래스(String string) {
		
	}
}

public class 예외처리Main {
	
	static void test1() throws Exception {
		test2();
	}
	
	static void test2() throws Exception {
		throw new 예외클래스("생성했당");
	}
		
	public static void main(String[] args) throws Exception {
		test1();

//			Scanner input = new Scanner(System.in);
//			System.out.println(5/0);	//try 명령문 밖에서는 예외 잡는것이 불가
//			try {
//					System.out.println("숫자1 >> ");
//					int a = input.nextInt();
//					System.out.println("숫자1 >> ");
//					int b = input.nextInt();
//					System.out.println(a / b);
//				
//			} catch (ArithmeticException e) {
////					System.out.println(e);	//toString 한 것과 같음
//					System.err.println(e.getMessage());
//					System.out.println("0 에러발생!");
//					
//			} catch (InputMismatchException e) {
//				System.out.println("값 에러발생!"); 
//			}
//			finally {
//			System.out.println("프로그램 끝");
//			}
			
		try {
			test1();
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

