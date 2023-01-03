
/**
 * getter/setter 는 만들 때 통상적으로 get변수이름, set변수이름을 쓰도록 한다.
 * 생성자는 public 으로 만든다
 *  ★ 배열 Tip 함수명(자료형 ... 배열명 ) >> 객체.함수명(ar1, ar2, ar3) 식으로 등록이 가능
 */


class Login {
		private String id;
		private String pw;
		
		//매개 변수가 있는 생성자
		Login(String id, String pw) {
			System.out.println("매개변수 생성자 호출");
			System.out.println(id);
			System.out.println(pw);
		}
		
		//getter
		String getId() {return id;	}
		void setId(String id) {this.id = id;}		
		//setter
		String getPw() {return pw;	}
		void setPw(String pw) {this.id = pw; }			
}

class OverLoadTest {
	int sum(int a, int b) {
		return a + b;
	}
	int sum(int a, int b, int c) {
		return a + b + c;
	}
}


public class Main220830_2 {

	public static void main(String[] args) {
		new Login("korea", "1234ab");
//		login.setId("korea");
//		System.out.println(login.getId());
		
		OverLoadTest over = new OverLoadTest();
//		int sum = over.sum(2, 10);
		int sum = over.sum(2, 10, 3);
		System.out.println(sum);
		
		}
}
