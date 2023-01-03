import java.util.ArrayList;
import java.util.Iterator;

//	java_1 day05 배열
//	foreach 명령문은 속도가 느리기 때문에 코딩테스트 등에는 잘 활용하지 않는것이 좋다.

public class Test220819 {

	public static void main(String[] args) {
		
			//10개 int형 요소를 저장하는 numbers 라는 이름의 배열
//			int [] numbers = new int[10];
//			//배열의 마지막 index == 배열의 길이 -1
//			numbers[1] = 3;
//			
//			System.out.println(numbers[1]);
//			
////			배열의 초기화 (일반형: 가장 자주 사용됨)
//			int [] num = new int[] {1, 2, 3, 4};
//			
////			배열 요소 넣을 때는 for 반복문을 사용하여 요소 등록
//			
//			for (int i = 0; i < num.length; i++) { //for 에서 Ctrl+Space 후 2번째 선택 시 자동완성
//				System.out.println(num[i]);
//			}
			
//			다차원 배열
			
//			int [][] arr1 = new int [][]
//			{
//				{1, 2},
//				{100, 200, 300},
//				{10}
//			};
//			
//			for (int i = 0; i < arr1.length; i++) {
//				for (int j = 0; j < arr1[i].length ; j++) {
//					System.out.println(arr1[i][j]);
//				}
//			}
		
//			foreach 명령문: 반복가능 객체에서 요소들을 순환하며 변수에 저장해서 사용
			
//			int []  numbers = new int [] {10, 20, 30};
//			
//			for (int num : numbers) {
//				System.out.println(num);
//			}
//			
//			int [][] arr1 = new int [][]
//					{
//						{1, 2},
//						{100, 200, 300},
//						{10}
//					};
//					//index 를 기재해야 하는 for 명령문 보다는 훨씬 간략하게 활용가능. (속도가 느림)
//					for (int[] num : arr1) {
//						for (int n : num) {
//							System.out.println(n);
//						}
//					}
					
//				ArrayList
				
				ArrayList<Integer> arr = new ArrayList<>();
				arr.add(100);
				arr.add(500);
				arr.add(10);
				arr.sort(null);
				
				for (int i = 0; i < arr.size(); i++) {
					System.out.println(arr.get(i));
				}
					
			
//			실습문제	1.
//			int형 배열 list1에 {{1,2},{2,3}}, list2에 {{3,4},{5,6}} 을 저장한 후 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과를
//			result 라는 배열에 저장해서 출력하세요.
			
			System.out.println("----실습문제 1.---");
			int list1 [][] = new int [][] {{1,2},{2,3}};
			int list2 [][] = new int [][] {{3,4},{5,6}};
			
			int n1 = list1[0][0] + list2[0][0];
			int n2 = list1[0][1] + list2[0][1];
			int n3= list1[1][0] + list2[1][0];
			int n4= list1[1][1] + list2[1][1];
						
			int result [][] = {{n1,n2},{n3,n4}};
			
			System.out.printf("result = {{%d,%d},{%d,%d}},"
					, n1,n2,n3,n4);
				
				
				
//			실습문제 2.
//			int형 배열 list_arr 에 {4,3,2,1} 을, list_ar2에 {2,20,10,3,5}을 저장한 후, 두 배열에서 가장 작은 수를 제외한 모든 요소를
//			오름차순으로 출력해주세요.	
			
			System.out.println("----실습문제 2.---");
			ArrayList<Integer> arr1 = new ArrayList<>();
			ArrayList<Integer> arr2 = new ArrayList<>();
			
			arr1.add(4);
			arr1.add(3);
			arr1.add(2);
			arr1.add(1);
			
			arr2.add(2);
			arr2.add(20);
			arr2.add(10);
			arr2.add(3);
			arr2.add(5);
			
			arr1.remove(0);
			arr2.remove(0);
			
			arr1.sort(null);
			arr1.sort(null);
			
			System.out.println(arr1);
			System.out.println(arr2);
				
				
//			실습문제 3.
//			배열 s에 {"Life","is","too","short"} 를 저장한 후, 배열의 요소를 사용하여 "Life is too short" 문자열을 만들어 출력하세요.
			
			System.out.println("----실습문제 3.---");
			String[] s = {"Life","is","too","short"};
			String r = "";
			for (int i = 0; i < s.length; i++) {
				r += s[i] + " ";
			}
			System.out.println(r);
				
////			실습문제 4.
//			
//			int[] list = {1, 10, 20, 3, 5, 6, 7, 8};
//			int[] temp = new int[list.length];
//			
//			//양쪽에서 중간으로 이동하며 양 끝의 숫자를 교환
//			for (int i = 0; i < temp.length / 2; i++) {
//				int tmp = list[i];
//				list[i] = list[list.length -i -1];
//				list[list.length -i -1] = tmp;
//			}
//			//출력
//			for (int i = 0; i < list.length; i++) {
//				System.out.print(list[i] + " ");
//			}
			
			
//			for (int i = 0; i < temp.length; i++) {
//				temp[i] = list[list.length -i -1 ];
//			}
//			for (int i = 0; i < temp.length; i++) {
//				list[i] = temp[i];
//				System.out.println(list[i] + " ");
//			}
				
				
	}
}
