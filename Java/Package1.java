package org.java_mentorseries.day10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


//	 ■ java.util 패키지: java 프로그래밍에 유용한 클래스들을 모아둔 것
//		-> 대표적인 클래스: 날짜와 관련된 Date,Calendar 클래스
//						자료구조와 관련된 Collection 프레임워크 클래스
//
//	 ■ 시간처리
//
//	 1) System.currentTimeMills()
//	  : 현재 운영체제의 시각을 long 타입으로 반환
//		-> 1970-01-01 기준으로 현재까지 1/1000 초 단위까지 환산
//
//	 2) java.util.Calendar: java에서 제공하는 날짜 관리 클래스
//		- 추상클래스로 직접 인스턴스 생성불가: getInstance() 메서드 활용하여 객체생성
//		- 싱글턴 패턴(Singleton Pattern)
//		 : 객체사용 할때 마다 인스턴스 생성하는 것이 아니라, 하나의 인스턴스로 사용하는 방법
//
//	 3) java.util.Date: java에서 제공하는 날짜 관리 클래스
//		-> 대부분의 메서드와 생성자 사용x
//
//	  ※ long,Calendar,Date 간 변환 가능
//	   Calendar -> Date: calendar.getTime()
//	   Date -> Calendar: calendar.setTime()
//	   Calendar -> long: calendar.getTimeInMillis()
//	   long -> Calendar: calendar.setTimeInMillis()
//
//	 4) SimpleDateFormat: 날짜를 형식화 하는 클래스
//		- 날짜 형식을 원하는 형태로 출력하기 위한 클래스
//		- y:년 M:월 d:일 E:요일 a:오전/오후 H:시간 m:분 s:초

public class Package1 {
	
//	시간처리 예문

//	public static void main(String[] args) {
//		
//		long start = System.currentTimeMillis();
//		System.out.println("시작시간: "+start);
//		int a = 0;
//		for (int i=1; i<10000000; i++) {
//			a++;
//		}
//		long end = System.currentTimeMillis();
//		System.out.println("종료시간: "+end);
//		System.out.println("걸린 작업시간: "+(end-start));

//	날짜처리 예문
	
//	public static void main(String[] args) {
//		
//		Calendar a = Calendar.getInstance(); //싱글턴 패턴
//		Calendar b = new GregorianCalendar();
//		System.out.println(a.toString());
//		System.out.println(b.toString());
//		//java에서는 1월이 0이므로 MONTH=6 은 7월을 의미
	
//	날짜처리 예문2
	
//	public static void main(String[] args) {
//		
//		Calendar a = Calendar.getInstance();
//		
//		int year = a.get(Calendar.YEAR);
//		int month = a.get(Calendar.MONTH)+1; //1월: 0 , 12월 11
//		int date = a.get(Calendar.DATE);
//		
//		System.out.println(year+"년"+month+"월"+date+"일");
//		System.out.print("오늘은 이번주에서 몇번째 일인가: ");
//		System.out.println(a.get(Calendar.DAY_OF_WEEK));
//	
//		System.out.print("이번 년도에서 오늘이 몇일째 인가: ");
//		System.out.println(a.get(Calendar.DAY_OF_YEAR));	
//	
//		System.out.print("이번 달은 몇일까지 있는가: ");
//		System.out.println(a.getActualMaximum(Calendar.DATE));
		
//	날짜지정 예문
	
//	public static void main(String[] args) {
//		
//		Calendar today = Calendar.getInstance();
//		Calendar endOfYear = Calendar.getInstance();
//		Calendar christmas = Calendar.getInstance();
//		
//		endOfYear.set(Calendar.MONTH, 11); //month:12월
//		endOfYear.set(Calendar.DATE, 31); //date:31일
//		long diff = endOfYear.getTimeInMillis()-today.getTimeInMillis();
//		System.out.println("연말까지 남은 날: "+diff/(24*60*60*1000)+"일");
//		// -> 남은 날 계산시 24시간*60분*60초*1000밀리초
//		
//		christmas.set(2022,11,25); //2022-12-25
//		diff = christmas.getTimeInMillis()-today.getTimeInMillis();
//		System.out.println("크리스마스까지 남은 날: "+diff/(24*60*60*1000)+"일");
		
//	util.Date 예문
		
//		public static void main(String[] args) {
//		
//		Date today = new Date();
//		System.out.println(today);
//		
//		long a = System.currentTimeMillis();
//		Date today2 = new Date(a);
//		System.out.println(today2);	
		
//	SimpleDateFormat 예문
	
	public static void main(String[] args) {
		
		Date day = new Date();
		String patternKorea = "yyyy-MM-dd";
		String patternUSA = "MM-dd-yyyy";
		String patternUK = "dd-MM-yyyy";
		String patternUser = "E요일 HH시 mm분 ss초";
		
		SimpleDateFormat p1 = new SimpleDateFormat(patternKorea);
		SimpleDateFormat p2 = new SimpleDateFormat(patternUSA);
		SimpleDateFormat p3 = new SimpleDateFormat(patternUK);
		SimpleDateFormat p4 = new SimpleDateFormat(patternUser);
		
		System.out.println("현재날짜 "+day);
		System.out.println("한국형식(년,월,일): "+p1.format(day));
		System.out.println("미국형식(월,일,년): "+p2.format(day));
		System.out.println("영국형식(일,월,년): "+p3.format(day));
		System.out.println("사용자 지정형식: "+p4.format(day));
		
	}
}
