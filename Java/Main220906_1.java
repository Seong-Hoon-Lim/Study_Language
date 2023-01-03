
class A {
	void methodA() {
		System.out.println("A");
	}
}

class B extends A {
	void methodB() {
	System.out.println("B");
	}
	
	@Override
	void methodA() {
		System.out.println("A2");
	}
}

public class Main220906_1 {

	public static void main(String[] args) {
		B newB = new B();
		A newA = newB;	//업캐스팅(자식에서 부모로)
		newA.methodA();	//Exception 발생
		
		A a2 = new A();
		B b2 = (B)a2;
		
		
		A a = new A();
		a.methodA();
		//a.methodB(); 오류 발생!
		
		B b = (B)a; //다운캐스팅(부모에서 자식으로)
		b.methodA();
		b.methodB();
		
		/**
		 * 인스턴스: 해당 클래스의 자식일 수 있는가?
		 * 객체: 해당 클래스로 만든 실체인가?
		 */

	}

}
