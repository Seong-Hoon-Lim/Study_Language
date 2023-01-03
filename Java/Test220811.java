import java.util.Scanner;

//	java_1 day02 문자열, 연산자와 입출력문
//	메모리 효율성을 고려해서 항상 변수를 만들어서 사용, 그렇지 않으면 1회용 밖에는 되지 않음.
//	입력 받기전에는 어떤 내용을 입력을 받을지 System.out.println 으로 어떤 내용을 입력할지 명시 해줘야함.

public class Test220811 {

	public static void main(String[] args) {
		
//		String s = "This is java";
//		String s2 = "program";
//		String result = s + " " + s2;
//		String result2 = s + 2;
//		
//		System.out.println(s);
//		System.out.println(s2);
//		
//		System.out.println(s+1+1); //괄호 없이 문자열과 숫자를 더하는 경우 문자열로 인식.
//		System.out.println(s+(1+2));
//		
//		System.out.println(result);
//		System.out.println(result2);
		
//		예쩨. 반지름이 5.0인 원의 면적을 계산하는 프로그램을 구현하세요
//		
//		double redius = 5.0;
//		double area = redius * redius * 3.141592; 
//		
//		System.out.println("반지름이" + " " + redius + "인" + " " + "원의 면적은" + " " + area + "입니다.");		
//		
//		System.out.println();
		
		
////		산술연산,대입연산,증감연산,관계연산,논리연산,비트연산
//		
//		int number = 3;
//		//number = number + 5; 와 같음
//		number += 5;
//		
//		int x = 2;
//		int y = 2;
//		int resultX = x++; //후위 (나중에 증가) -> 한 줄을 처리하고 증가 시킴.
//		int resultY = ++y; //전위 (먼저 증가)
//		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(resultX);
//		System.out.println(resultY);
		
//		예쩨. 간단하게 윤년을 계산하는 프로그램 (true 나오면 윤년이 맞음)
				
//		int year = 20124204;
//		boolean result;
//		result = year % 4 == 0;
//		
//		System.out.println(result);
//		
////		비트연산
//		
//		int a = 10;
//		int b = 13;
//		
//		System.out.println(a & b); //and
//		System.out.println(a | b); //or
//		System.out.println(a << b); //비트이동 <<
//		System.out.println(a >> b); //비트이동 >>
		
//		삼항연산 == 삼항식		
//		<구조> 조건문 ? 참 : 거짓;
//		예시
		int number = 1 == 1 ? 10 : 100;
		System.out.println(number);
				
		
////		실습 예제 1. num1에 num2를 덧셈,뺄셈,곱셈,나눗셈을 한 결과를 출력
////		150 + 240 = 390
////		150 - 240 = -90
////		150 * 240 = 36000
////		150 / 240 = 0.625
//
//		int num1 = 150;
//		int num2 = 240;
//		
//		int plus = num1 + num2;
//		int minus = num1 - num2;
//		int multiple = num1 * num2;
//		double divide = (double)num1 / num2; //int 나누기 int 는 int
//		
//		System.out.println("----예제1----");
//		System.out.println(num1 + " + " + num2 + " = " + plus);
//		System.out.println(num1 + " - " + num2 + " = " + minus);
//		System.out.println(num1 + " * " + num2 + " = " + multiple);
//		System.out.println(num1 + " / " + num2 + " = " + divide);
//		
//		
////		실습 예제 2. num2의 3제곱의 결과에 num1을 나눈 몫이 10이상인지 True or False 로 출력
////		결과 : True(혹은 False)
//		
//		int resultmul = (num2*num2*num2);
//		boolean resultbo = (resultmul / num1) >= 10;
//		System.out.println("----예제2----");
//		System.out.println("결과 : " + resultbo);
//		
//		
////		실습 예제 3. 3차 함수 fx = 7(x*x*x)-9x-2 에서 f2를 구해서 출력
//		
//		int x = 2;
//		int fx = 7*(x*x*x)-(9*x)-2;
//		System.out.println("----예제3----");
//		System.out.println("f("+ x +") = " + fx);
		
//		입력문 Scanner 클래스와 System.in 을 사용
		
		Scanner input = new Scanner(System.in);
//		System.out.println("아무 단어나 입력해보세요 >> ");
//		String result = input.nextLine();
//		System.out.println("입력: " + result);
//		
//		int result1 = input.nextInt();
//		System.out.println(result1);
		
		
//		실습 예제 1. 직사각형의 가로와 세로 값을 입력으로 받아서 직사각형의 둘레와 넓이를 구하세요
//		가로 길이를 입력하세요 >>> 
//		세로 길이를 입력하세요 >>> 
//		직사각형의 둘레 = 
//		직사각형의 넓이 = 
		
		System.out.println("----예쩨1----");
		System.out.print("가로 길이를 입력하세요 >> ");
		int garo = input.nextInt();
		System.out.print("세로 길이를 입력하세요 >> ");
		int sero = input.nextInt();
		
		int circ = (garo+sero) * 2;
		int are  = garo*sero;
		
		System.out.println("직사각형의 둘레 = " + circ);
		System.out.println("직사각형의 넓이 = " + are);
		
		
//		실습 예쩨 2. 숫자 2개를 입력 받아 num1,num2 변수에 저장한 뒤, num1을 2bit 좌측으로 이동한 후 num2와 더한 연산 결과르 10진수로 출력하세요
//		num1 입력 : 
//		num2 입력 :
//		결과 :
		
		System.out.println("----예쩨2----");
		System.out.print("num1 입력: ");
		int num1 = input.nextInt();
		System.out.print("num2 입력: ");
		int num2 = input.nextInt();
		
		int result = (num1 << 2) + num2;		
		System.out.println("결과: " + result);		
		
		
//		실습 예제 3. 숫자를 입력 받아서 해당 숫자가 짝수면 true, 홀수면 false를 출력하세요
//		숫자를 입력하세요 >>>
//		num 은 true입니다. or num 은 false입니다.
		
		System.out.println("----예쩨3----");
		int num;
		System.out.println("숫자를 입력하세요 >>> ");
		num = input.nextInt();
		
		boolean result1 = num % 2 == 0;
		System.out.printf("%d은(는) %b입니다.", num,result1);
		
	}
}
