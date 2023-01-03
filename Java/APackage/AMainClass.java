package APackage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import BPackage.BClass;

public class AMainClass {

	public static void main(String[] args) {
////		AClass a = new AClass();
////		BClass b = new BClass();
////		a.amethod();
////		b.bmethod();
//		
//		//프로그램 시작 시간 저장
//		long start = System.currentTimeMillis();
//
//		for (int i = 0; i < 1000000; i++) {
//			System.out.println(i);
//			//exit 활용예시
////			if (i == 10000) {
////				System.exit(0);
////			}
//		}
//		//끝나는 시간 저장
//		long end = System.currentTimeMillis();
//		int time = (int)((end - start) / 1000);
//		
//		System.out.println("약 " + time + "초");
		
		LocalDate date = LocalDate.of(1985,4,10);
		LocalTime time = LocalTime.now();
		LocalDateTime dtime = LocalDateTime.now();
		System.out.println(date.getDayOfWeek());
		System.out.println(time.getMinute());
		System.out.println(dtime);
		
	}

}
