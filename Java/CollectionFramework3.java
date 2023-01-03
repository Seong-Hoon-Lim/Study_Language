package org.java_mentorseries.day11;

import java.util.HashMap;
//import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//	 ■ Queue(큐): 한 쪽 끝에서는 삽입이 다른 쪽 끝에서는 삭제가 일어나는 구조
//	  - 선입선출(FIFO)의 구조
//		※ FIFO: First In First Out
//	  - front:삭제, rear:삽입
//	  - 인터페이스임
//
//	 ■ Queue 메서드
//	  boolean add(E e): Queue에 요소 e 추가
//	  E element(): Queue의 제일 상단 요소 반환
//	  E remove(): Queue의 최상단 요소를 반환 후 제거
//	  boolean offer(E e): Queue에 요소 e를 추가
//	  E peek(): Queue의 제일 상단 요소 반환
//	  E poll(): Queue의 최상단 요소를 반환후 제거
//
//	  ※ Queue는 인터페이스 이므로, 사용하려면 업캐스팅 필요
//
//	 ■ Queue 사용법 (업캐스팅 해서 객체 생성 후 사용)
//	  1) Queue<Element> q = new LinkedList <Element>(); -> 주로 사용
//	  2) Queue<Element> q = new Array <Element>();
//
//	 ■ Stack(스택): 한 쪽 끝에서 삽입과 삭제가 모두 일어나는 구조
//	  - 후입선출(LIFO)의 구조
//		※ LIFO: Last In First Out
//	  - top: 삽입,삭제
//	  - Vector의 자식 클래스임
//
//	 ■ Stack 메서드
//	  E peek(): top 요소를 반환
//	  E pop(): top 요소 제거 후 반환
//	  E push(E item): top에 요소 추가
//	  int search(Object O): 요소 O가 있는지 검색해서 위치 반환
//
//	 ■ Map: 키를 통해서 값을 참조 할 수 있는 구조
//	  - 인터페이스이기 때문에 사용하려면 업캐스팅이 필요
//	  - Map을 구현한 대표 클래스: HashMap,TreeMap
//
//	 ■ Map 메서드
//	  boolean containKey(Object key): 해당 key가 있는지 여부 반환
//	  boolean containValue(Object value): 해당 값이 있는지 여부 반환
//	  V get(Object key): 해당 key와 쌍인 값을 반환
//	  boolean isEmpty(): 맵 객체에 요소가 없으면 true 반환
//	  Set<Key> keySet(): Key들을 Set 형태로 반환
//	  V put(K key,V value): Key와 값을 요소로 추가
//	  V remove(Object key): 이 key를 가진 요소를 제거
//	  int size(): 전체 요소의 개수를 반환
//
//	 ■ HashMap: Key와 Value 값으로 데이터를 저장하는 형태
//	  - Map 인터페이스의 한 종류
//	  - Map의 모든 속성을 갖고 있으며, 저장 방식 동일
//	  - 해싱(Hashing)이라는 검색 알고리즘 사용
//		-> 메모리낭비를 최소화 하기위해 저장할 값을 입력 받을 시 연산을 통해 새로운 주소값을 저장
//	  - key의 중복은 허용하지 않으나 value의 중복은 허용
//
//	Queue 메서드 예문

public class CollectionFramework3 {

//	public static void main(String[] args) {
//		
//		Queue<String> q = new LinkedList<>(); //<String> 생략가능
//		//1. add(e): rear 위치에 e 삽입
//		q.add("apple");
//		q.add("banana");
//		q.add("cherry");
//		q.add("tomato");
//		System.out.println(q);
//		//2. E element: front에 위치한 데이터 반환
//		System.out.println("element: "+q.element());
//		//3. remove: front에 위치한 데이터를 반환 후 삭제
//		System.out.println("remove: "+q.remove());
//		System.out.println(q);
//		//4. offer(e): rear 위치에 e 삽입
//		q.offer("peach");
//		System.out.println(q);
//		//5. peek(): front에 위치한 데이터의 값을 반환
//		System.out.println("peek: "+q.peek());
//		System.out.println(q);
//		//6. poll(): front에 위치한 데이터를 반환 후 삭제
//		System.out.println("poll: "+q.poll());
//		System.out.println(q);
//	}
//}

//	Stack 메서드 예문

//	public static void main(String[] args) {
//		Stack<String> s = new Stack<String>();
//		//1. push(): 데이터 삽입
//		s.push("apple");
//		s.push("banana");
//		s.push("cherry");
//		System.out.println(s);
//		//2. pop(): top의 데이터 삭제
//		System.out.println("pop: "+s.pop());
//		System.out.println(s);
//		//3. peek(): top의 데이터 보기
//		System.out.println("peek: "+s.peek());
//		//4. search(): 요소가 어느 인덱스 위치에 있는지 반환
//		System.out.println(s.search("apple"));
//		System.out.println(s.search("banana"));
//
//	}
//}

//	HashMap 예문
	
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		//1. put(key,value)
		hm.put("apple","사과");
		hm.put("paper","종이");
		hm.put("flower","꽃");
		
		String voca;
		System.out.print("알고싶은 단어를 입력하세요: ");
		voca = sc.nextLine();
		//2.containKey(key): key가 hashmap에 존재하면 true
		
		if(hm.containsKey(voca)) {
			//3. get(key): value 값 반환
			System.out.println("해당하는 뜻은: "+hm.get(voca));
		}
		else {
			System.out.println("해당 단어에 대한 뜻은 데이터베이스에 없습니다.");	
		}
	}
}