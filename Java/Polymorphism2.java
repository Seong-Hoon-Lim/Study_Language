package org.java_mentorseries.day07;

//	 ■ 다운 캐스팅(Down Casting)
//	  : 업캐스팅 된 부모클래스의 객체가 자식클래스의 참조변수로 형변환 되는 것
//		 <구조> 자식클래스 변수 = (자식클래스) 업캐스팅 된 부모 참조변수;
//		-> 업캐스팅으로 인해 사용하지 못했던 필드를 다운캐스팅을 통해 다시 사용가능
//
//	   다운캐스팅 시 주의할 점
//		- 업캐스팅 된 변수만 가능
//		- 명시적 형변환


public class Polymorphism2 {

//	다운캐스팅 예문
	
//	public static void main(String[] args) {
//		//업캐스팅
//		Human h1 = new Student1("가길동",20,"게임하기",3);
////		h1.study(); //오류발생
//		//다운캐스팅
//		Student1 s1 = (Student1)h1;
//		s1.study();
//	}
//}

	public static void main(String[] args) {
		Animal lion1 = new Lion();
		Animal rabbit1 = new Rabbit();
		Animal monkey1 = new Monkey();
		
		
		ZooKeeper james = new ZooKeeper();
		james.feed(lion1);
		james.feed(rabbit1);
		james.feed(monkey1);
	}
}

class Animal {
	void breath() {System.out.println("숨쉬기");}
}

class Lion extends Animal {
	public String toString() {
		return "사자";
	}
}

class Rabbit extends Animal {
	public String toString() {
		return "토끼";
	}
}

class Monkey extends Animal {
	public String toString() {
		return "원숭이";
	}
}

// 업캐스팅을 통해 자식클래스를 형변환을 시켜줌으로써 Animal으로 변경되어 적용 되는 것
class ZooKeeper { //Animal 타입만 들어갈 수 있음
	void feed(Animal animal) { //toString을 통해 객체의 값이 전달되고
		System.out.println(animal+"에게 먹이주기"); // 오버라이딩을 통해 같이 출력
	}
}
