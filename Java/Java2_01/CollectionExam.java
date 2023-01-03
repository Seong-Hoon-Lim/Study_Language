package Java2_01;

import java.security.DrbgParameters.NextBytes;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class CollectionExam {		
	//"()())(()()()"
	static boolean check_bracket(String bracket) {
		Queue<Character> queue = new LinkedList<>();
		char c[] = bracket.toCharArray();
		
		//중복되는 구문으로 삭제(return queue.isEmpty(); 과 중복)
//		if (c[c.length -1] == '(') {
//			return false;
//		}
		
		for (int i = 0; i < c.length; i++) {
			//현재 문자가 여는 괄호다
			if (c[i] == '(') {
				queue.offer(c[i]); //큐에 넣는다
			} else {
				//현재 문자가 닫는 괄호다
			} if (queue.isEmpty()) { //그런데 큐가 비었다?
				return false; //쌍이 안맞다
			}
			queue.poll(); //큐에서 뺀다.
		}
		return queue.isEmpty();
	}
	

	public static void main(String[] args) {
		System.out.println(check_bracket(""));
		
		
		
	}
}
