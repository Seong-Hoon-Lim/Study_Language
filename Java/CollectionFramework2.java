package org.java_mentorseries.day11;

import java.util.*;

import org.java_mentorseries.day05.Array1;

//	 ■ Set(집합): 요소들을 집합적으로 모아놓은 자료구조
//
//	  특징
//	  - 중복을 허용하지 않음
//	  - 저장 순서를 유지하지 않음
//	  Set을 구현한 클래스: HashSet,TreeSet
//
//	 ■ HashSet: Set과 동일하게 중복이 없고, 순서가 없음
//	   생성자 종류
//	   - HashSet(): HashSet 클래스의 기본 생성자
//	   - HashSet(Collection c): 컬렉션의 요소로 HashSet 객체 생성
//	   - HashSet(int capacity): capacity 용량을 갖는 객체 생성
//
//		※중복된 요소 add() 시, 집합에 추가가 안되고 false 값을 반환
//
//	 ■ TreeSet: Set과 동일하게 중복이 없으나, 정렬기능이 추가된 형태
//	  -> 데이터 추가 시, 기준데이터 보다 작다면 기준의 왼쪽에 크다면 기준의 오른쪽에 위치
//
//	 ■ List(리스트): 데이터를 일렬로 늘어놓은 구조
//
//	   특징
//	   - 순서가 있음
//	   - 중복 허용
//	   List를 구현한 클래스: ArrayList,LinkedList
//
//	 ■ List 인터페이스의 주요 메서드
//	   add(int index,E elem): index 위치에 elem 추가
//	   get(int index): index 위치에 있는 요소 반환
//	   indexOf(Object o): 요소 o가 있는 위치 반환
//	   listiterator(): listiterator() 반환
//	   remove(int index): index 위치 요소 삭제 후 삭제값 반환
//	   set(int index,E elem): index 위치 요소를 elem 으로 변경
//
//	 ■ ArrayList: 요소 추가시 0번 index 부터 차례대로 요소 저장(배열에서 발전된 형태)
//	  -> 배열처럼 크기가 정해져 있지 않음 개발자가 지정가능
//
//	 ■ LinkedList: 요소들이 서로 연결되어 있는 리스트(각 요소가 다음 요소의 주소 저장)
//

public class CollectionFramework2 {
	
//	HashSet,TreeSet 예문

//	public static void main(String[] args) {
//		HashSet hs = new HashSet();
//		hs.add("demon");
//		hs.add("banana");
//		hs.add("tomato");
//		hs.add("apple");
//		hs.add("cargo");
//		
//		TreeSet ts = new TreeSet();
//		ts.add("demon");
//		ts.add("banana");
//		ts.add("tomato");
//		ts.add("apple");
//		ts.add("cargo");
//		
//		Iterator it = hs.iterator();
//		System.out.println("<HashSet 출력>");
//		while (it.hasNext()) {
//			System.out.print(" "+it.next());
//		}
//		
//		System.out.println();
//		Iterator it2 = ts.iterator();
//		System.out.println("<TreeSet 출력>");
//		while (it2.hasNext()) {
//			System.out.print(" "+it2.next());
//		}
//		System.out.println();
//		System.out.println("현재 TreeSet의 크기: "+ts.size());
//	}
//}

//	ArrayList 예문

//	public static void main(String[] args) {
//		
//		ArrayList list1 = new ArrayList(10);
//		list1.add("A");
//		list1.add("C");
//		list1.add("E");
//		list1.add("D");
//		System.out.print("초기상태: ");
//		System.out.println(list1); //list1.toString 생략가능
//		
//		System.out.print("index 1위치에 B추가: ");
//		list1.add(1,"B");
//		System.out.println(list1);
//		
//		System.out.print("index 2위치의 값 삭제: ");
//		list1.remove(2);
//		System.out.println(list1);
//		
//		System.out.print("index 2위치의 값 반환: "+list1.get(2));
//	}
//}

//	LinkedList 예문 (ArrayList LinkedList 작업 속도시간 비교)

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		long start = System.currentTimeMillis();
		
		for (int i=0; i<10000; i++) {
			al.add(0,String.valueOf(i));
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList 작업시간: "+(end-start));
		
		start = System.currentTimeMillis();
		for (int i=0; i<10000; i++) {
			ll.add(0,String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList 작업시간: "+(end-start));
		
	}
}
