
//	java_1 day08 생성자,접근자/오버로딩,오버라이딩
/**
 *	getter/setter 자동완성 >> get변수이름/set변수이름 Ctrl+Enter
 *
 */


class Circle {
		//x: 원 의 중심 좌표x , y: 원의 중심 좌표y
		private int x, y;
		private int radius; //반지름
		
		//Circle클래스의 기본 생성자
		Circle() {
			//this(2, 5, 10); >> 기본 생성자에서 인수를 전달 할 수 있다. 메소드 실행 되기전에 맨처음에 전달을 해야 가능하다.
			System.out.println("기본 생성자 호출");
			
		}
		//x좌표, y좌표를 설정해주는 생성자
		Circle(int x, int y) {
			this();
			System.out.println("매개변수1");
			this.x = x;
			this.y = y;
		}
		
		Circle(int x, int y, int radius) {
			System.out.println("매개변수2");
			this.x = x;
			this.y = y;
			this.radius = radius;
		}
		
		//나(현재의 원) 과 인수로 받은 다른 원이 겹치는지 아닌지 검사
//		int check(Circle c ) {
//				int 가로길이 = x-c.x;
//				int 세로길이 = y-c.y;
				//대각선의 제곱 = 가로길이의 제곱 + 세로길이의 제곱
				//대각선의 길이 = (가로길이의 제곱 + 세로길이의 제곱)의 제곱근
				//double 대각선가로길이 * 가로길이 + 세로길이 * 세로길이
			
			//return 1; 겹친다
			//return 0; 인접한다
			//return -1; 안겹친다
				
				//안겹친다(두 원의 거리가 멀다)
//				if (대각선 > 반지름의합 ) {
//					return -1;
//				}
//				else if (대각선 < 반지름의 합) {
//					return 1;
//				}
//				
//		}
		
		int getX() { return this.x;		}
		public int getY() { return y;		}
		public int getRadius() {	return radius;	}
}

public class Main220901 {

	public static void main(String[] args) {
			Circle c1 = new Circle(2, 2, 4);
			Circle c2 = new Circle(5, 7, 3);
			
			//제곱근
			double 제곱근 = Math.sqrt(81);
			
			//c1과 c2가 겹치는지 검사
//			int result = c1.check(c2);
//			System.out.println("결과: " + result);
			
			
//			System.out.println("c1의 내용입니다 >>");
//			System.out.println(c1.getX());
//			System.out.println(c1.getY());
//			System.out.println(c1.getRadius());
//			
//			System.out.println("c2의 내용입니다 >>");
//			System.out.println(c2.getX());
//			System.out.println(c2.getY());
//			System.out.println(c2.getRadius());

	}

}
