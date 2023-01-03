package Java2_01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;


class Diction {
	String word;
	
	public Diction(String word) {
				this.word = word;	
	}

}

//class Score implements Comparable<Score>{
//	int score;
//	public Score(int score) {
//		this.score = score;
//	}
//	
//	@Override
//	public int compareTo(Score o) {
////		return this.score - o.score; 모든 경우를 고려 해야 하기 때문에 사용하지 않는다.
//		
//		if (o.score < this.score) {
//			return 1; //양수값 아무거나 가능(크니깐 위로 이동)
//		} else if (o.score > this.score) {
//			return -1; //음수값 아무거나 가능(작으니까 아래로 이동)
//		}
//		return 0; //같으니까 그 자리에 그대로
//	}
//	
//}

public class CollectionTest3 {
	
	public static void main(String[] args) {
//		TreeSet<Score> scores = new TreeSet<>();
//		scores.add(new Score(50));
//		scores.add(new Score(10));
//		scores.add(new Score(70));
//		scores.add(new Score(20));
//		scores.add(new Score(80));
//		scores.add(new Score(5));
//		
//		for (Score score : scores) {
//			System.out.println(score.score);
//		}
		
//		ArrayList<Diction> arr = new ArrayList<>();
//		arr.add(new Diction("apple"));
//		arr.add(new Diction("apple"));
//		arr.add(new Diction("banana"));
//		arr.add(new Diction("melon"));
//		arr.add(new Diction("cherry"));
//		arr.add(new Diction("mango"));
//		
//		arr.sort(new Comparator<Diction>() {
//			@Override
//			public int compare(Diction o1, Diction o2) {
//				String word;
//				return word.toCharArray()[1]- o2.word.toCharArray()[1];
//			}
//		}
//		
//		
//		
//		//정렬된 ArrayList의 요소들을 오름차순 출력
//		for (Diction diction : arr) {
//			System.out.println(diction.word);
//		}
	}
}
