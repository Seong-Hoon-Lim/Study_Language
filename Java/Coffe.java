
import java.util.*;

class CoffeeMachine {
	//잔돈 계산해주는 기능
	int chanege_calulator(String coffee, int pay) {
			int menu = 0;	//커피 종류에 따른 가격
			switch (coffee) {
			case "아메리카노":			
					menu = 1000;
				break;
			case "카푸치노":				
					menu = 1500;
				break;
			case "카페라뗴":				
					menu = 2000;
				break;				
			default:
					System.out.println("Error: 그런 메뉴는 없습니다!.");
					return pay; //낸 돈 그대로 반환
			}
			if (pay < menu) {
				System.out.println("Error: 돈이 부족합니다!.");
				return pay; //낸 돈 그대로 반환
			}
			//여기까지 왔따는 것은 정상주문
			return pay - menu; //잔돈을 계산해서 반환함
	}
}

public class Coffe {

	public static void main(String[] args) {
		//키보드: 표준입력장치, 모니터: 표준출력장치
		//Standard input, Standard output
		Scanner input = new Scanner(System.in);
		CoffeeMachine machine = new CoffeeMachine();
		
		System.out.println("주문할 커피 입력 >> ");
		String coffe = input.next();
		System.out.println("지불할 금액 입력 >> ");
		int pay = input.nextInt();
		//선택한 메뉴와 돈을 전달하여 잔돈을 받는다.
		int change = machine.chanege_calulator(coffe, pay);
		System.out.println("받은 잔돈: " + change);

	}

}
