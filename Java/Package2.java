package org.java_mentorseries.day10;

import java.time.LocalDate;

//	 ■ java.time 패키지: java에서 날짜와 시간을 다루기 위한 패키지
//		- JDK 1.8부터 추가된 패키지
//
//	   java.time 의 종류
//		- java.time: 날짜와 시간을 나타내는 LocalDate,LocalTime 등을 포함
//		- java.time.format: 날짜와 시간을 파싱하고 포맷팅하는 API포함
//		- java.time.chrono: 여러가지 달력 시스템을 사용할 수 있는 API vhgka
//		- java.time.temporal: 날짜와 시간을 연산하기 위한 API포함
//		- java.time.zone: 타임존을 지원하는 API포함
//
//	 1) LocalDate 클래스: 날짜 정보를 저장 ※ 1월이 1로 시작
//		- 날짜정보를 저장하는 방법
//		 > 현재 날짜 지정: now() 메서드
//		 > 특정 날짜 지정: of() 메서드
//		<구조>
//		 LocalDate ld = LocalDate.now()
//		 LocalDate mld = LocalDate.of(int year,int month,int dayOFMonth);
//		 ※ 메서드 중 isLeapYear() 메서드는 윤년여부 를 확인하는 메서드로 boolean 반환
//
//	 2) LocalTime 클래스: 시간 정보를 저장
//		- 시간정보를 저장하는 방법
//		 > 현재 시간 지정: now() 메서드
//		 > 특정 시간 지정: of() 메서드
//		 <구조>
//		 LocalTime lt = LocalTime.now()
//		 LocalTime mlt = LocalTime.of(int hour,int minute,int second,int nanoOfSecond);
//		 <of 메서드 오버로딩>
//		  of(int hour,int minute);
//		  of(int hour,int minute,int second);
//		  of(int hour,int minute,int second,int nanoOfSecond);
//
//	 3) LocalDateTime 클래스: LocalDate 클래스와 LocalTime 클래스를 결합
//		- 날짜와 시간정보 모두 저장
//		 > 현재 시간 지정: now() 메서드
//		 > 특정 시간 지정: of() 메서드
//		 <구조>
//		 LocalDateTime ldt = LocalDateTime.now()
//		 LocalDateTime mldt = LocalTime.of(int year,int month,int dayOFMonth,int hour,int minute,int second,int nanoOfSecond);
//
//	 4) ZoneDateTime 클래스: ISO-8601 달력 시스템에서 정의하는 TimeZone에 따라
//							날짜와 시간을 저장
//		- 형식: ex) 2016-01-08T12:56:09.017+09:00(Asia/Seoul)
//		 > 협정 세계시(UTC)와 차이 나는 시간(존 오프셋)이 따로 저장
//		 > ZoneDateTime 클래스는 now() 메서드 뒤에 ZoneId를 매개값으로 넘겨야함
//		<구조>
//		ZoneDateTime zdt = ZoneDateTime.now(ZoneId.of("UTC"));
//
//	 5) Instant 클래스: 특정 시점의 타임 스탬프 객체
//		- 1970-01-01 부터 현재까지의 시간을 세는 객체
//		- Machine time 에 유리
//		<구조>
//		Instant i = Instant.now();
//
//	 ■ 클래스들의 정보 값 변경 메서드
//		-> with (날짜정보or시간정보)(int)
//
//	 ■ with() 메서드: TemporalAdjuster 타입을 이자로 받으면 특정한 날짜를 리턴
//

public class Package2 {

//	날짜 더하기 빼기 예문
	
//	public static void main(String[] args) {
//		
//		LocalDate ld = LocalDate.now();
//		System.out.println(ld);
//		//날짜 더하기 빼기
//		LocalDate ld2 = ld.minusYears(2).plusMonths(3).minusDays(4);
//		System.out.println(ld2);
//		
//		//자동변환
//		LocalDate ld3 = ld2.minusDays(22);
//		System.out.println(ld3);
//		
//		//주 더하기
//		LocalDate ld4 = ld3.plusWeeks(3);
//		System.out.println(ld4);

//	날짜정보 변경 예문

	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDate new_ld = ld.withYear(1999).withMonth(8).withDayOfMonth(23);
		System.out.println(new_ld);
		
	}
}
