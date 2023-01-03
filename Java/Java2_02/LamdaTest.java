package Java2_02;

import java.util.ArrayList;
//import java.util.Comparator; //람다식 활용하게 되면 import 불필요

//@FunctionalInterface //이 어노테이션이 붙은 경우에는 람다식이 가능함. 메소드는 오직 1개만 가질 수 있다.
//interface Fish {
//	boolean swim(int meter);
//}

//class Fish {
//	void swim() {
//		System.out.println("유유히 헤엄을친다.");
//	}
//}



public class LamdaTest {
	public static void main(String[] args) {
		//익명객체 생성
//		Fish f1 = new Fish() {
//			@Override
//			void swim() {
//				System.out.println("헤엄을 친다.");
//			}
//			
//		};		
		//람다식 활용: ()에는 매개변수가 전달 된다.(매개변수에 자료형을 생략해도 된다.) {}에는 메서드를 구현한다.
//		Fish f1 = (meter) -> {
//			System.out.println(meter + "m 만큼 헤엄");
//			System.out.println("유유히 헤엄");
//			return true;
//		};
//		boolean success = f1.swim(100);
//		System.out.println(success);
		
//		//오름차순 정렬 시(람다식 활용전)
//		Comparator<Integer> comp = new Comparator<Integer>() {
//			
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2 - o1;
//			}
//		};
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(3);
		arr.add(4);
		arr.add(100);
		arr.add(45);
		
//		arr.sort(comp);
		
		//람다식 활용
//		arr.sort((x, y) -> x - y); //내림차순
		arr.sort((x, y) -> y - x); //오름차순
		
		for (Integer integer : arr) {
			System.out.println(integer);
		}
	}
}
