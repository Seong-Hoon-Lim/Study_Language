//	java_1 day09 외부클래스/내부클래스/익명클래스

class Outer {
	//Outer 클래스에서만 호출가능한 num
	private int num = 5;
	//Outer 클래스 안에 정의된 내부 클래스 Inner
	class Inner {
			void test() {
				System.out.println(num);
			}
	}
	
	Outer() {
		Inner in = new Inner();
		in.test();
	}
	
}

class Anony {
	void a() {
		System.out.println("a");
	}
	void b() {
		System.out.println("b");
	}
	
}


public class Main220901_1 {

	public static void main(String[] args) {
		//외부클래스에서 내부클래스를 이용하여 객체 생성하는 방법 3가지
		
		//① 1회용으로 생성되는 객체(저장 되지 않기 때문에 한번 사용되고 쓰레기 값이됨)
		new Outer(); //5
		
		Outer outer = new Outer(); //② 5
				
		Outer.Inner in = outer.new Inner();
		in.test(); //③ 5
		
		Anony new_an = new Anony() {	
			void a() {
				System.out.println("a2");
			}
		};
		new_an.a(); //a2로 재정의 됨
		new_an.b();
		
		Anony an = new Anony();
		an.a();
		an.b();
		
	}

}
