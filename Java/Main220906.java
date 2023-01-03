//	java_1 day09 외부클래스/내부클래스/상속
/**
 * 클래스 메소드 작성 순서(보틍 아래 순서를 따름)
 * 멈버변수
 * 생성자
 *	메소드
 *	오버라이드 된 메소드
 */




//부모 클래스가 될 PERSON
class 사람 {
	String name = "사람"; //멤버변수
	void breath() {
		System.out.println("들숨 날숨");
	}
	void run() {
		System.out.println("달리기!");
	}
}

//Person 클래스를 상속 받는 운동선수 클래스
class 운동선수 extends 사람 {
	//멈버변수
	//생성자
	//메소드
	//오버라이드 된 메소드
	public 운동선수(String name) {
		super(); //부모크래스이 기본 생성자를 호출하는 super()
		System.out.println("자식 생성자 호출");
		this.name = "볼트";
		super.name = "볼트";
	}
	void jump() {
		System.out.println("점프!");
	}
	@Override
	void run() {
		System.out.println("엄청 빨리 달리기!");
	}
}

class 학원강사 extends 사람 {
	
}



public class Main220906 {

	public static void main(String[] args) {
		운동선수 bolt = new 운동선수("볼트");
		bolt.name = "볼트";
		bolt.breath();
		System.out.println(bolt.name);

	}

}
