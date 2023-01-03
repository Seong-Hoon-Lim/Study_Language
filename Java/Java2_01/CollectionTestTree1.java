package Java2_01;

import java.util.Iterator;
import java.util.TreeSet;

public class CollectionTestTree1 {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet();
		ts.add("홍길동");
		ts.add("차범근");
		ts.add("유재석");
		ts.add("박명수");
		ts.add("김유신");
		ts.add("홍길동");
		
		Iterator<String> ite = ts.iterator();
		
		System.out.println("오름차순 정렬");
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("\n내림차순 정렬");
		Iterator<String> ite2 = ts.descendingIterator();
		while (ite2.hasNext()) {
			System.out.println(ite2.next());
		}
		System.out.println(ts);

	}

}
