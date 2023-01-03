package Java2_04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Member {
	
	int id;
	String name;
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
		
	}	
	
}

public class StreamTest {
	static int sum = 0;
	
	public static void main(String[] args) {
		
//		IntStream.rangeClosed(5, 15).forEach( (x) -> sum+= x );
//		System.out.println(sum);
		
		//위의 코드를 간략하게 할 수 있다.
		System.out.println(IntStream.rangeClosed(5, 15).sum());
			
		
		List<Member> members = Arrays.asList(
				new Member(1, "홍길동"),
				new Member(2, "강감찬"),
				new Member(3, "이순신"),
				new Member(4, "김유신"),
				new Member(5, "김유신"),
				new Member(6, "김유신"),
				new Member(7, "김유신"),
				new Member(8, "김유신")
				
				);
		
		//수집 활용
		List<Member> newMem =
		members.stream()
		.filter( x -> {return x.id % 2 == 0;} )
		.toList();
		
		for (Member member : newMem) {
			System.out.println(member.name);
		}
		
		
		
//		
//		Arrays.asList(1, 2, 3, 5, 2, 3, 5, 6, 1, 4, 31, 42, 4, 10 ,42, 31, 645)
		
		//필터링 활용
//		.stream()
//		.distinct()
//		.sorted()
//		.filter( x -> x % 2 == 0)
//		.forEach( System.out :: println );
		
		//매칭 활용
//		System.out.println(
//		Arrays.asList(1, 2, 3, 5, 2, 3, 5, 6, 1, 4, 31, 42, 4, 10 ,42, 31, 645)
//		.stream()
//		.anyMatch( x -> x % 2 == 0 ) //최종 처리
//				);
		
		//집계 활용
//		System.out.println(
//				
//				Arrays.stream(new int[] {1, 2, 3, 4, 5})
//				.filter( x -> x % 2 == 0 ).count()
//				
//						);
		
		//루핑 활용
//		Arrays.asList("java test", "python program")
//		.stream().mapToInt(x -> x.length())
//		.peek(System.out :: println)
//		.sorted()
//		.forEach(System.out :: println);
		
		//매핑 활용
//		.stream().flatMap( x -> 
//			{ return Arrays.stream (x.split(" "));	} 
//		).forEach(System.out :: println);;
		
		
//		for (Member member : members) {
//			System.out.println(member.name);
//		}
		
		//스트림으로 변형 했을 때 객체를 굳이 다시 만들 필요가없다.
//		members.parallelStream().forEach((member) -> {
//			System.out.println(member.name);
//		} );
		
		
		
	}
}
