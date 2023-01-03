package Java2_01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CollectionTest1 {
	
	//예제
			//s 문자열을 받아서, s문자열이 팰린드롬인지 판단하는 메소드
			static boolean isPanlindrome(String s) {
				LinkedList<Character> queue = new LinkedList<>();
				char[] cArr = s.toCharArray();
				
				for (int i = 0; i < cArr.length; i++) {
					if (cArr[i] != ' ') {
					queue.offer(cArr[i]);
					}
				}
				
				while (queue.size() > 1) {
					if (queue.pollFirst() != queue.pollLast()) {
						return false;
					}
				}
				
				return true;
				
			}	
			
			

	public static void main(String[] args) {
		
//		//Stack, Queue 예시		
//		Stack<String> stack = new Stack<>();		
//		Queue<String> queue = new LinkedList<>();		
//		
//		//스택: push, pop
//		stack.push("데이터1");
//		stack.push("데이터2");
//		stack.push("데이터3");
//		
//		while (!stack.isEmpty()) {
//			System.out.println(stack.pop());
//		}
//		
//		//큐: offer, poll
//		queue.offer("데이터1");
//		queue.offer("데이터2");
//		queue.offer("데이터3");
//		
//		while (!queue.isEmpty()) {
//			System.out.println(queue.poll());
//		}
//		
//		
	
		System.out.println(isPanlindrome("race car"));
		
	}

}
