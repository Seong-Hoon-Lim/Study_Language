import java.util.ArrayList;

//	java_1 day06 클래스와 객체
// 네이밍 규칙: 클래스 - 앞글자 대문자로 생성 ,메소드 - 단어 사이_(언더바) 로 생성, 변수 - 소문자로 생성
//	자바는 거의 다 메소드 로 동작, 함수처럼 단독으로 사용이 불가
//	String 은 상수로 취급이 되기 때문에 .append() 등 메소드 를 사용하게 되면 StringBuilder 를 사용하도록 한다.

//class Board {
//		String writer = "나";
//		String title;
//		String content;
//}

//public class Test220823 {
//
//	public static void main(String[] args) {
//		Board board1 = new Board();
//		Board board2 = new Board();
//		
//		board1.writer = "너";
//		board1.title = "안녕하세요~~";
//		board1.content = "오늘 처음 가입했어요~~";
//		
//		System.out.println(board1.writer);
//		System.out.println(board1.content);
//		System.out.println(board1.title);
//		
//		System.out.println(board2.writer);
//		System.out.println(board2.content);
//		System.out.println(board2.title);
//		
////		String 클래스/메소드 활용
//		
//		String s = "This is java test";
//		StringBuilder builder = new StringBuilder("Test");
//		builder.append(" end");
//		System.out.println(builder);
////		String result = s.substring(8,12);
//		String result =s.replace("java", "python");
//		String [] sp = s.split("java");
//		for (int i = 0; i < sp.length; i++) {
//			System.out.println(sp[i]);
//		}
//		
////		int index = s.indexOf("test");
//		System.out.println(s);
//		System.out.println(result);
//
//		
		
public class Test220823 {

			public static void main(String[] args) {
				//1. 숫자가리기
				//전화번호가 있는 문자열이 있습니다. 해당 문자열에서 마지막 4자리를 *로 변경한
				//전화번호를 출력하세요.
				
					String[] phoneNumbers = {
									"01012345678", "027778888", "0533219876"};									
					//결과: 0101234****, 02777****, 053321****
					
					System.out.println("----문제 1.----");
					for (int i = 0; i < phoneNumbers.length; i++) {
						int endIndex = phoneNumbers[i].length() -4;
						System.out.println(phoneNumbers[i] .substring(0,endIndex) +  "****");
					}
					
//					System.out.print(phoneNumbers[0].toString().replace("5678","****"));
//					System.out.print(", " + phoneNumbers[1].toString().replace("8888","****"));
//					System.out.print(", " + phoneNumbers[2].toString().replace("9876","****"));
					
			
				//2. 문자열 회전시키기
				//문자열을 회전시킬 자연수 count가 있습니다.
				//해당 문자열들을 count만큼 회전시킨 문자열을 출력하세요
					
					System.out.println("----문제 2.----");
					int count = 4;
					String[] strings = {
							"C language", "python test", "java Programming"};
					//결과: "uageC lang", "testpython ", "mingjava Program"
					
					for (int i = 0; i < strings.length; i++) {						
						//처음부터 어디까지 자를 것인가? 의 어디까지의 인덱스
						int startSIndex  = strings[i].length() - count;
						//어디부터 마지막까지 자를 것인가? 의 마지막의 인덱스
						int endSIndex = strings[i].length();
						//
						String start = strings[i].substring(0, startSIndex);
						//
						String end = strings[i].substring(startSIndex, endSIndex);
												
						System.out.println(start);
					}													
					
					//3.문자와 숫자가 섞여 있는 문자열에서 zero~nine까지
					//영단어에 해당하는 숫자를 0~9의 숫자로 변경한 후
					//해당 숫자에 100을 더한 숫자를 출력하세요.
						
						String[] s = {"one4seveneight", "123987", 
								"ninezeroone", "2two321"};
						//결과: 1578, 124087, 1001, 22421
						
						System.out.println("----문제 3.----");
						for (int i = 0; i < s.length; i++) {
							String test = s[i];
							test = test.replace("one", "1");
							test = test.replace("two", "2");
							test = test.replace("three", "3");
							test = test.replace("four", "4");
							test = test.replace("five", "5");
							test = test.replace("six", "6");
							test = test.replace("seven", "7");
							test = test.replace("eight", "8");
							test = test.replace("nine", "9");
							test = test.replace("zero", "0");
							int result = Integer.parseInt(test) + 100;
							System.out.println(result);
						}
						
//						String s0 = (s[0].toString()).replaceAll("one4seveneight", "1478");
//						String s1 = (s[1].toString());
//						String s2 = (s[2].toString()).replaceAll("ninezeroone","901");
//						String s3 = (s[3].toString()).replaceAll("2two321","22321");
//																
//						System.out.println(s0);
//						System.out.println(s1);
//						System.out.println(s2);
//						System.out.println(s3);
						
		
	}

}
