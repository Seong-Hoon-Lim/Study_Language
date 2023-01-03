import java.security.GuardedObject;

//	java_1 day01 변수와 자료형
//	기본 자료형 : 정수-int , 실수-double
//	long 형은 사용 시 l(L) 을 float 형은 사용 시 f(F) 를 반드시 기재
//	final 을 붙이면 상수이므로 값이 변경되지 않음

public class Test220809 {

	public static void main(String[] args) {
		
		//정수형 변수
		int binary = 0b1101;
		int octal = 075;
		int hexa = 0xFF;
		System.out.println("정수형 변수");
		System.out.println(binary);
		System.out.println(octal);
		System.out.println(hexa);
		//실수형 변수
		float f = 3.14f;
		double d = 1.21334;
		System.out.println("실수형 변수");
		System.out.println(f);
		System.out.println(d);
		//논리형 변수
		System.out.println("논리형 변수");
		boolean check = false;
		System.out.println(check);
		//문자형 변수
		System.out.println("문자형 변수");
		char a = 'a';
		char b = 'b';
		System.out.println(a+b);

		System.out.println();
		
		//명시적 형변환
		System.out.println("명시적 형변환");
		int number = 10;
		double dnum = 3.14;
		
		double r = (double)number;
		double r2 = (int)dnum;
		
		System.out.println(r);
		System.out.println(r2);
		
		System.out.println();
		
		double donum;
		
		donum = 5/2;
		System.out.println(donum);
		
		donum = (int)5 / 2;
		System.out.println(donum);
		
		//상수
		final int i = 2;
		//i = 3; 오류발생
		

	}

}
