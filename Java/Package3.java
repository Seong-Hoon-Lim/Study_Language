package org.java_mentorseries.day10;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Timer;
import java.util.TimerTask;

//	 with() 메서드 종류
//	  firstDayOfYear(): 년도의 첫 번째 일
//	  lastDayOfYear(): 년도의 마지막 일
//	  firstDayOfMonth(): 달의 첫 번째 일
//	  lastDayOfMonth(): 달의 마지막 일
//	  firstInMonth(DayOfWeek dow): 달의 첫 번째 요일
//	  lastInMonth(DayOfWeek dow): 달의 마지막 요일
//	  next(DayOfWeek dow): 돌아오는 요일
//	  nextOrSame(DayOfWeek dow): 오늘을 포함한 돌아오는 요일
//	  previous(DayOfWeek dow): 지난 요일
//	  previousOrSame(DayOfWeek dow): 오늘을 포함한 지난 요일
//
//	 time 패키지에서 각 필드 값 비교하는 메서드 종류
//	  isAfter(): 이전의 날짜인지 비교하여 boolean값 반환
//	  isBefore(): 지나간 날짜인지 비교하여 boolean값 반환
//	  isEqual(): 동일 날짜인지 비교하여 boolean값 반환
//	  until(): 날짜나 시간의 차이를 반환
//	  between(): 전체 날짜나 시간의 차이를 반환
//
//	 ■ Timer/TimerTask 클래스
//	  : 개발자가 원하는 특정한 시간에 코드를 실행하거나 특정 시간 간격으로 반복되는 작업처리
//
//	  - TimerTask 를 상속받는 새로운 클래스 선언
//	  - TimerTask 클래스의 run 추상 메서드에서 하고 싶은 작업 오버라이딩
//	  - Timer 객체 생성 후 원하는 시간을 매개변수 값으로 전달
//
//	 ■ Scanner 클래스: 문제 데이터를 읽어오는데 도움을 주는 클래스
//		<구조>
//		 Scanner 변수 = new Scanner(System.in); //입출력 스트림과 연결
//		 변수.입력메서드();
//
//	 ■ BigDecimal 클래스: 정확한 소수점 연산을 해야할 때 사용
//	  - 목적: double,long 으로 소수점 연산 시 오차가 나는 부분을 보완
//	  - java.math 패키지 안에 있음
//	  - 생성자:BigDecimal(문자열)
//
//	 ■ formatting: 데이터 형식을 지정하는 것을 의미
//	 1) DecimalFormat: 숫자를 형식화 하는 클래스
//	  #:있으면 출력, 0:없으면 0으로채움, .:소수점, -:음수기호, ,:콤마, E:지수, %:퍼센트
//
//
//
//

public class Package3 {
	
//	Timer/TimerTask 예문
	
//	public static void main(String[] args) throws InterruptedException
//	
//	{
//		
//		Timer t = new Timer(true); //프로그램 종료 시, 객체 자동 소멸
//		TimerTask w1 = new Work1();
//		TimerTask w2 = new Work2();
//		
//		t.schedule(w1, 3000);
//		t.schedule(w2, 1000); //1000 == 1초
//		Thread.sleep(4000);
//		System.out.println("모든 작업 종료!");
//		
//	}
//}
//
//class Work1 extends TimerTask {
//	@Override
//	public void run() {
//		System.out.println("work1 실행");
//	}
//}
//
//class Work2 extends TimerTask {
//	@Override
//	public void run() {
//		System.out.println("work2 실행");
//	}
//}

//	BigDecimal 예문

//	public static void main(String[] args) {
//			double a = 24.3953;
//			double b = 50.343998;
//			System.out.println(a+b); //근사값이 나오면서 정확한 계산x
//			
//			BigDecimal number1 = new BigDecimal(String.valueOf(a));
//			BigDecimal number2 = new BigDecimal(String.valueOf(b));
//			System.out.println(number1.add(number2));
		
//	formatting 예문
			
	public static void main(String[] args) {
		
		String []pattern = {
				"###.###",
				"000.000",
				"-###.###",
				"000000.00%"};
		double []arr = {1.3,3.33,124.243,242};
		
		for (int p=0; p<pattern.length; p++) {
			DecimalFormat d = new DecimalFormat(pattern[p]);
			System.out.println("<<<"+pattern[p]+">>>");
			for (int i=0; i<arr.length; i++) {
				System.out.println(d.format(arr[i]));
			}
		}
	}
}
