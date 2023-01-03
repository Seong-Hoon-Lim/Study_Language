
//	java_1 day06 클래스와 객체
//	메소드를 종료하고 싶을 때는 if-else 명령문 보다는 return을 사용하도록 하는게 좋다. 가독성도 좋음.

class Computer {
	String nickName;
	int price;
	
	void turn_on() {
		System.out.println("전원 ON");
	}
	
	void print_message(String message, String name) {
		System.out.println(name + ": " + message);
			}
	
	int return_price() {
		System.out.println("return_price실행");
		return price;
	}
	
	double calculator(double num1, double num2, char oper) {
		switch(oper) {
		case '+':
			return num1 + num2;
		case '-':
			return num1 - num2;
		case '*':
			return num1 * num2;
		case '/':
			return num1 / num2;
		}
		double sum = num1 / num2;
		return sum;
	}
	
	void turn_off(int signal) {
		if (signal != 0) {
			System.out.println("중요한 데이터가 백업되지 않음!");
			return; //메소드 종료를 위한 return 은 if 조건문에서 밖에 사용되지 않음.
		}
		 	System.out.println("곧 전원이 꺼집니다. .");
			System.out.println("메모리 정리중. .");
			System.out.println("프로세스 정리중. .");
			System.out.println("화면종료 중. .");
			System.out.println("종료");
	}
	
}

public class Test220825 {

	public static void main(String[] args) {

		Computer com = new Computer();
		com.turn_on();
		com.print_message("안녕하세요", "홍길동");
		com.print_message("반갑습니다", "김모모");
		
		com.price = 10000;
		int price = com.return_price();
		System.out.println(price);
		
		double result = com.calculator(10, 5.5, '*');
		System.out.println(result);
		
		com.turn_off(0);
		com.turn_off(1);		
		
	}

}
