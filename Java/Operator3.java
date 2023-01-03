package org.java_mentorseries.day03;
// 자동 import: Ctrl+Shift+O
public class Operator3 {

	public static void main(String[] args) {
		
//		■ 삼항연산자
		
		int age = 17;
		System.out.println(age>19? "성인입니다":"청소년입니다");
		
//		■ 대입연산자
		
		int x = 10;
		x = x+10; //x=20
		System.out.println("x: "+x);
		int y = 10;
		y += 10; //y=y+10
		System.out.println("y: "+y);
		
//		■ 변수대입연산자
		
		int a = 3;
		int b = 5;
		b = a; //b=3
		System.out.println(b);
		a+=1; //a=a+1
		System.out.println(a); //a=4
		a/=2; //a=a/2
		System.out.println(a); //a=2
		a*=a; //a=a*2
		System.out.println(a); //a=4
		
//		■ instanceof 연산자
//		  : 객체의 타입을 확인하는 연산자
//		   -> 참조변수 instanceof class명
//		 ※ 앞글자가 대문자로 표기
//		
		String s = "Hello";
		int i = 3;
		float f = 3.14f;
		double d = 3.14;
		char c = 'a';
		System.out.println(s instanceof String);
		System.out.println(Integer.valueOf(i) instanceof Integer);
		System.out.println(Float.valueOf(f) instanceof Float);
		System.out.println(Double.valueOf(d) instanceof Double);
		System.out.println(Character.valueOf(c) instanceof Character);
		
		
	}

}
