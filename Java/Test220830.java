
//	java_1 day07 클래스와 객체1, 2
//클래스 변수를 사용하는 경우에는 객체화를 할 필요 없이 사용하는 것이 좋다.
//클래스 메소드에서는 클래스 변수와 클래스 메소드만 사용가능하다. (인스턴스 변수와 인스턴스 메소드 사용불가)

/**
 * 인스턴스 변수 / 인스턴스 메소드
 *  - 객체를 생성해야 호출 가능 (객체에서 호출함)
 *  - 객체마다 다른 값을 가질 수 있고, 다른 동작이 가능
 *  - 인스턴스 메소드에서는 인스턴스/클래스 변수,메소드 사용가능
 *  
 * 클래스 변수/클래스 메소드
 *   - static 키워드가 붙어있다
 *   - 객체를 생성하지 않아도 사용가능(클래스 이름으로 호출함)
 *   - 클래스와 해당 클래스로 만들어진 모든 객체가 동일한 값을 가지고, 동일한 동작을 함
 *   - 클래스 메소드에서는 클래스 변수/클래스 메소드만 사용가능
 *   
 *  ==============================================================
 *  [같은 클래스 내에서는 변수/메소드 이름만으로도 호출이 가능함]
 *  
 */

class Coffee {
		static String 종류; //클래스변수
		float 카페인함량;
		
		void test() {
			
		}
		
		void instnace() {
			System.out.println("instnace 메소드");
			test();
			Coffee.class_method();
			System.out.println(종류);
			System.out.println(카페인함량);
		}
		
		static void class_method() {
			System.out.println("class_method");			
		}
}

class Computer2 {
		//인스턴스 변수(객체가 가지는 데이터)
		//멤버변수(클래스 내부에 존재)
		//필드(field)
		String cpu, ram, ssd, vga; //멤버변수
		
		//cpu, ram, ssd, vga 값을 설정하는 set_spec 메소드
		void set_spec(String  _cpu, String _ram, String _ssd, String _vga) {
					cpu = _cpu;
					ram = _ram;
					ssd = _ssd;
					vga = _vga;			
		}
		
		//현재 컴퓨터 객체가 가지는 데이터의 출력을 담당하는 메소드
		void print_information() {
			System.out.println("cpu: " + cpu);
			System.out.println("ram: " + ram);
			System.out.println("ssd: " + ssd);
			System.out.println("vga: " + vga);
		}
}

public class Test220830 {

	public static void main(String[] args) {
			Coffee.종류 = "믹스";
			Coffee.class_method();
			
			Coffee 원두커피 = new Coffee();
//			원두커피.종류 = "아메리카노";
			원두커피.카페인함량 = 2f;
			
			System.out.println(Coffee.종류);
			System.out.println(원두커피.종류);			
		
		Computer2 com1 = new Computer2();
		com1.set_spec("i5", "8GB", "256GB", "1060");
		com1.print_information();
		
		Computer2 com2 = new Computer2();
		com2.set_spec("i7", "16GB", "512GB", "1080");
		com2.print_information();
		
	}
}
