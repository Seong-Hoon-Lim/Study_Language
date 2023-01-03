package org.java_mentorseries.day03;

public class Operator2 {

	public static void main(String[] args) {
		
//		■ 논리연산자
//		boolean a = true;
//		boolean b = false;
//		boolean c = true;
//		
//		System.out.println(a&&b); //false
//		System.out.println(a&&c); //true
//		
//		System.out.println(a||b); //true
//		System.out.println(a||c); //true
//		
//		System.out.println(!a); //false
//		System.out.println(!b); //true
		
//		■ 비트논리연산자
//		 1: true
//		 0: false
//		1) 비트 AND: a&b -> a가 1고 b가 1이면 결과 1 
//		2) 비트 OR: a|b -> a가 1이거나 b가 1이면 결과 1
//		3) 비트 XOR: a^b -> a와 b가 서로 다르면 1, 같으면 0
//		4) 비트 NOT: ~a -> a가 1이면 0, 0이면 1
		
		int a = 15; //1111(2)
		int b = 5; //0101(2)
		
		System.out.println(a&b); //0101(2) = 5
		System.out.println(a|b); //1111(2) = 15
		System.out.println(a^b); //1010(2) = 10
		
		System.out.println(~b); //1010(2) = 10x -> -6
		
//		 ※ 부호비트
//		  양수: 부호비트 = 0
//		  음수: 부호비트 = 1
//		 
//		 ※ 5 를 비트 NOT 연산을 해서 -6 이 되는 이유
//		 
//		 5가 0101(2) 실제 PC내부 비트 단위 2진수 표현 시
//		  : 0 000 0000 0000 ... 0000 0101
//		 5를  비트 NOT 연산 하는 경우
//		  : 1 111 1111 1111 ... 1111 1010
//		 
//		 ※ 비트 NOT 연산 공식: ~a = -a-1
		
//		■ 비트연산자(쉬프트연산자)
		
		System.out.println(a >> 2); //0011(2) = 3
		System.out.println(b << 4); //0101 0000(2) = 64 + 16 = 80
		
//		 ※ 쉬프트연산자 공식
//		 1) 오른쪽 쉬프트연산자: 오른쪽 1칸 이동할 때마다 /2, 몫은 관계없음.
//		 2) 왼쪽 쉬프트연산자: 왼쪽 1칸 이동할때마다 *2
//		
		
	}

}
