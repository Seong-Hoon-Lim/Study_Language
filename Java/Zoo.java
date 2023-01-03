//다형성 활용

//동물 크래스

class Animal {
		void bark() {
			System.out.println("컹");
		}
}

class Lion extends Animal {
//		@Override //생략됨.
		public String toString() {
			return "사자";
		}
}

class Rabbit extends Animal {
	public String toString() {
		return "토끼";
	}
}

class Hippo extends Animal {
	public String toString() {
		return "하마";
	}
}

//사육사 클래스
class Zookeeper {
		void feed(Animal  ani) { //업캐스팅
				System.out.println(ani.toString()+ "에게 먹이 주기");
		}
//		void feed(Rabbit rabbit) {
//			System.out.println(rabbit.toString()+ "에게 먹이 주기");
//	}
//		void feed(Hippo hippo) {
//			System.out.println(hippo.toString()+ "에게 먹이 주기");
//	}
	
}

//동물원 메인
public abstract class Zoo {

	public static void main(String[] args) {
		Lion l1 = new Lion();
		Rabbit r1 = new Rabbit();
		Hippo h1 = new Hippo();
		
		Zookeeper james = new Zookeeper();
		
		james.feed(h1);

	}

}
