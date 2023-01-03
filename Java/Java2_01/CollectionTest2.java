package Java2_01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
		
	}	
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person)obj;
			return p.name.equals(name) && (p.age == age); //true 반환
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
}


public class CollectionTest2 {
	
	static void set_test() {
		HashSet<String> set = new LinkedHashSet<>();
		set.add("apple");
		set.add("banana");
		set.add("apple");
		set.add("grape");
		set.add("lemon");
		set.add("melon");
		set.add("grape");
		
//		for (String string : set) {
//			System.out.println(string);
//		}
		
		//Iterator 사용예시
		Iterator<String> iter = set.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}		
		
	}

	public static void main(String[] args) {
		set_test();
		
		Person p1 = new Person("LSH", 31);
		Person p2 = new Person("LSH", 31);	
		if (p1.equals(p2)) {
			System.out.println("같음");
		}				
		

	}

}
