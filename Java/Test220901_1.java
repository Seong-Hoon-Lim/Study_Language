
class Person {
		static int count = 0;
			
	Person(String name) {
		System.out.println(name + " is born.");
		count++;
	}
	
	//클래스 메소드 -> 클래스 이름으로만 호출됨
	 static  int  get_population() {
		 
		 return count;
	}
}

class Shop {
	static int total;
	
	static void calc_menu (String menu, int count) {
				switch(menu) {
				case "떡볶이":
					total += 3000 * count;
					break;
				case "순대":
					total += 1000 * count;
					break;
				case "튀김":
					total += 500 * count;
					break;
				case "김밥":
					total += 2000 * count;
					break;
				}
	}
	static void sales(String menu) {
		calc_menu(menu, 1);
	}
	
	static void sales(String menu, int count) {
		calc_menu(menu, count);
		
	}
	static void sales(String menu1, int count1, String menu2, int count2) {
		calc_menu(menu1, count1);
		calc_menu(menu2, count2);
		
	}
	
}

public class Test220901_1 {

	public static void main(String[] args) {
		Person man = new Person("james"); //james is born
		Person woman = new Person("emily");	//emily is born
		
		System.out.println("전체 인구수: " + Person.get_population() + "명");
		
		Shop.sales("떡볶이");
		Shop.sales("김밥", 2);
		Shop.sales("튀김", 5);
		Shop.sales("순대", 3, "김밥" ,4);
		System.out.println("총 매출: " + Shop.total + "원");
		
	}
	
}
