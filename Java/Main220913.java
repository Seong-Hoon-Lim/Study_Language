abstract class Pokemon {
		String name;	//포켓몬의 이름
		String nickName; 	//포켓몬에게 붙여주는 닉네임
		
		abstract void attack();
}

class Pikachu extends Pokemon {
	//추상클래스를 상속받는 클래스는 반드시 추상메서드를 오버라이딩을 해야한다.
	@Override
	void attack() {
			System.out.println( nickName + " 백만볼트!!");
		
	}
}

class Squirtle extends Pokemon {
	@Override
	void attack() {
			System.out.println(nickName + " 물대포!!");
		
	}
}


public class Main220913 {
	public static void main(String[] args) {
		Pikachu pika1 = new Pikachu();
			pika1.name = "피카츄";
			pika1.nickName = "피카부!";
			pika1.attack();
			Squirtle squirt1 = new Squirtle();
			squirt1.nickName = "꼬북!";
			squirt1.attack();
	}

}
