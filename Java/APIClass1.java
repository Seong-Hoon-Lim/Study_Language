package org.java_mentorseries.day09;

import java.util.StringTokenizer;

//	 ■ JAVA API(Application Programming Interface):
//	   : JAVA에서 개발자들을 위해 기본적으로 제공하는 클래스
//
//	 ■ 문자열클래스: 문자열에 대한 다양한 처리를 위한 다양한 메서드가 정의된 클래스
//	   문자열클래스 종류
//		1) String 클래스
//		2) StringBuffer 클래스
//		3) StringTokenizer 클래스
//
//	 1) String 클래스: 객체 생성시, 보통 클래스와는 다르게, 기본 자료형 선언처럼 사용
//		-> ex) String a = "Java";
//
//	 2) StringBuffer 클래스
//	   : String 클래스는 immutable(변하지않는) 객체이기 때문에, 자주 사용할 수록
//		 인스턴스의 생성으로 인해 느려지는 단점을 보완하기 위한 클래스
//		-> 객체안의 데이터를 내부적으로 변경할 수 있으므로, 새로운 객체를 만들지 않는
//		   mutable(변할수있는) 객체를 만든다.
//
//	 3) StringTokenizer 클래스
//	   : 문자열을 구분문자열을 기준으로 분리할 때 사용
//		-> import java.util.StringTokenizer; 해야 사용가능
//		ex) "이름":"전화번호" 문자열에서 ':' 문자를 기준으로 이름과 전화번호로 나눌때 사용
//		-> 문자열을 생성하고, 구분할 문자열을 생성 한 후 StringTokenizer 객체 생성
//

//	String 클래스 메서드 활용 예문

public class APIClass1 {

//	public static void main(String[] args) {
//		String str = "hello";
//		//concat(): 문자열 연결
//		System.out.println(str.concat(" world!"));
//		System.out.println(str);
//		//substring(시작위치,끝위치): 시작위치~끝위치전까지 가져옴 == python 슬라이싱
//		System.out.println(str.substring(2, 4));
//		System.out.println(str.substring(3));
//		//length(): 문자열 길이 반환
//		System.out.println(str.length());
//		//toUpperCase, toLowerCase: 문자열을 대문자,소문자로 변환
//		System.out.println(str.toUpperCase());
//		System.out.println("TesT".toLowerCase());		
//		//charAt(인덱스): 인덱스에 해당하는 글자 반환
//		System.out.println(str.charAt(1));
//		//indexOf(문자열): 문자열 위치 반환
//		System.out.println(str.indexOf("WORLD")); //-1: 못찾음
//		//equals(문자열): 문자열이 같은지 boolean 값 반환
//		System.out.println(str.equals("hello"));
//		System.out.println(str.equals("HELLO"));
//		//trim(): 문자열 앞,뒤 공백 제거
//		System.out.println(" test ".trim());
//		//replace(기존문자열,대체문자열): 기존문자열을 대체문자열로 변경 == python
//		System.out.println("hello world".replace('l','L'));
//		//replaceAll(변환할문자열,변화된문자열): 문자열내의 특정부분을 다른 문자열로 변경
//		System.out.println("hello world".replaceAll("hello","bye"));
	
//	StringBuffer 클래스 메서드 활용 예문
	
//	public static void main(String[] args) {
////		StrigBuffer buffer = "test"; -> 불가능
//		StringBuffer buffer = new StringBuffer("test");
//		String str = "test";
//		
//		System.out.println("str: "+str);
//		System.out.println("buffer: "+buffer);
//		//append(): 매개변수로 입력된 값을 문자열로 바꿔서 더해줌
//		buffer.append(" Test");
//		System.out.println("buffer.append: "+buffer);
//		//reverse(): 문자열의 순서를 반대로 나열해줌
//		buffer.reverse();
//		System.out.println("buffer.reverse: "+buffer);
//		//str.reverse() -> 없음
//		
//		//insert(int pos, Object obj): 두번째 매개변수의 값을 문자열로 바꾸고 pos에 추가
//		buffer.insert(2, "BYE");
//		System.out.println("buffer.insert: "+buffer);
//		//delete(시작위치,끝위치): 시작~끝위치전까지의 문자열을 제거
//		buffer.delete(0, 3);
//		System.out.println("buffer.delete: "+buffer);
//		//delete(시작위치,끝위치): 시작~끝위치전까지의 문자열을 제거
//		buffer.deleteCharAt(3);
//		System.out.println("buffer.deleteCharAt: "+buffer);
	
//	StringTokenizer 클래스 메서드 활용 예문
	
	public static void main(String[] args) {
	
		//문자열 생성
		String str = "kim:010-1234-1234";
		String delim = ":";
		//객체 생성
		StringTokenizer st = new StringTokenizer(str,delim);
		//countTokens(): 남은 토큰의 개수
		System.out.println(st.countTokens());
		//nextToken(): 다음 토큰으로 이동
		System.out.println(st.nextToken());
		//hasMoreTokens(): 다음 토큰이 존재하면 true, 존재하지 않으면 false
		System.out.println(st.hasMoreTokens()); //1개 남았으니 true
		
		System.out.println(st.countTokens());
		System.out.println(st.nextToken());
		System.out.println(st.hasMoreTokens()); //없으니 false
//		System.out.println(st.nextToken()); --> 다음 ":" Token 없어 오류
		
	}
}
