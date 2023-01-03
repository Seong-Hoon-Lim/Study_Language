package APackage;

import java.time.*;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LocalTimeClass {
	
//	코딩테스트 예시문제
//	//a월 b일의 요일을 반환하세요.
//	static String solution(int a, int b) {
//		return  LocalDate.of(2016, a, b)
//									.getDayOfWeek().toString()
//									.substring(0, 3);
//		
//	}
//
	public static void main(String[] args) {
//				
//		System.out.println(solution(5, 24)); //TUE
//		System.out.println(solution(2, 10));
//		System.out.println(solution(7, 5));		
	
		
		//Arrays 클래스 예시
//		int[] test = new int[] {1, 10, 100};
//		String arr = Arrays.toString(test);
//		List list = Arrays.asList(3, 2, 1);
//		System.out.println(arr);
		
		//정규 표현식 예시
		String target = "This year is 2008";
		String reg = ".*[0-9]";
		if (target.matches(reg)) {
			System.out.println("일치");
		}
		
		String messge = "This is link- #www.google.com#";
		Pattern p = Pattern.compile("#.*#");
		Matcher matcher = p.matcher(messge);
		while (matcher.find()) {
			String result = matcher.group();
			System.out.println(result);
		}
		
	}

}
