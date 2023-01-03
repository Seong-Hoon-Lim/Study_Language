package Java2_04;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamTest2 {
	
	//arr 배열에서 divisor로 나눠떨어지는 요소들만 모아서 오름차순으로 정렬된 새로운 배열 반환
	public static int[] solution(int[] arr, int divisor) {
		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				array.add(arr[i]);
			}
		}
		if (array.size() == 0) {
			return new int[] {-1};
		}
		array.sort(null);
		
		int[] result = new int[array.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = array.get(i);
			System.out.println(result[i]);
		}
		return result;
	}

	
	public static void main(String[] args) {
		solution(new int[] {5, 9, 7, 10}, 5);
		solution(new int[] {2, 36, 1, 3}, 1);
		solution(new int[] {3, 2, 6}, 10);
//		
//		
//		
//		//str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값)(최대값)" 형태의
//		//문자열을 반환하는 함수, solution을 완성하세요.		
//		public static String solution2(String s) {
//			Stream stream = Arrays.stream( s.split(" "));
//			int min = stream.mapToInt(x -> ).min();
//			int max = stream.mapToInt(x -> ).max();
//			
//			return "(" + min + ") (" + max + ")";
//			
//		}
//		
//		public static void main(String[] args) {
//			System.out.println(Arrays.toString( solution(new int[] {5, 9, 7, 10}, 5) ));
//			System.out.println(Arrays.toString( solution(new int[] {2, 36, 1, 3}, 1) ));
//			System.out.println(Arrays.toString( solution(new int[] {3, 2, 6}, 10) ));
//			System.out.println( solution2("1 2 3 4"));
//			System.out.println( solution2("-1 -2 -3 -4"));
//			System.out.println( solution2("-1 -1"));
//			
//			return null;
//		
//		
	}
}
