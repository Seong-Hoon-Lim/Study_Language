package org.java_mentorseries.day11;

//	 ■ 정렬 알고리즘: 데이터를 순서대로 나열하기 위한 절차적인 과정
//	 ■ 정렬 알고리즘의 종류
//	  1) 선택정렬(Selection Sort)
//	  2) 삽입정렬(Insertion Sort)
//	  3) 버블정렬(Bublle Sort)
//
//	 ■ 선택정렬(Selection Sort) 
//	  : 최소값 또는 최대값을 선택해서 가장 앞에다가 위치하여 선택할 위치를 이동하며 정렬
//	  - 구현이 쉽다.
//	  - 다른 정렬에 비해 시간이 오래걸린다.
//
//	 ■ 삽입정렬: 지정한 값의 삽입할 위치를 찾아 정렬하는 방법
//	  - 시작 index는 첫번째 index로 시작한다.
//		i: 위치를 찾을 idx -> 범위: 1 ~ 배열의끝 까지
//		j: 비교할 idx -> 범위: i-1 ~ 0 까지
//
//	 ■ 버블정렬: 인접한 두 수를 비교해서 큰수를 뒤로 보내는 알고리즘
//	  ※정렬과정이 거품이 일어나는 것과 비슷하다 하여 버블
//	  - 구현이 쉽고 코드가 직관적이다.
//	  - 시간이 오래걸린다
//	  - 최선,최악,평균 모두 O(n^2) 시간복잡도를 가진다
//		i: 제일 큰 값이 올 위치 -> 범위: 배열끝 ~ 0 까지
//		j: 비교할 idx -> 범위: 0 ~ i 까지
//

public class AlignmentAlgorithm {

//	선택정렬 예문
	
//	public static void main(String[] args) {
//		int min,tmp;
//		int ar[] = {8,1,2,5,4,3,6,7};
//		System.out.println("-----정렬 전-----");
//		for (int i=0; i<ar.length; i++) {
//			System.out.print(ar[i]+" ");
//		}
//		System.out.println();
//		for (int i=0; i<ar.length-1; i++) {
//			min = i;
//			for (int j=i+1; j<ar.length; j++) {
//				if (ar[min]>ar[j]) {
//					tmp=ar[min];
//					ar[min]=ar[j];
//					ar[j]=tmp;
//					System.out.println("-----swap 후-----");
//					for (int k=0; k<ar.length; k++) {
//						System.out.print(ar[k]+" ");
//					}
//					System.out.println();
//				}
//			}
//		}
//		System.out.println("-----정렬 후-----");
//		for (int i=0; i<ar.length; i++) {
//			System.out.print(ar[i]+" ");
//		}
//	}
//}

//	삽입정렬 예문

//	public static void main(String[] args) {
//		int ar[] = {8,1,2,5,4,3,6,7};
//		int idx,tmp;
//		System.out.println("-----정렬 전-----");
//		for (int i=0; i<ar.length; i++) {
//			System.out.print(ar[i]+ " ");
//		}
//		System.out.println();
//		//i: 위치를 찾을 idx -> 범위: 1 ~ 배열의끝 까지
//		for (int i=1; i<ar.length; i++) {
//			idx = i;
//			//j: 비교할 idx -> 범위: i-1 ~ 0 까지
//			for (int j=i-1; j>=0; j--) {
//				if (ar[j]>ar[idx]) {
//					tmp=ar[j];
//					ar[j]=ar[idx];
//					ar[idx]=tmp;
//					idx=j;
//					System.out.println("-----swap 후-----");
//				for (int k=0; k<ar.length; k++) {
//					System.out.print(ar[k]+" ");
//				}
//				System.out.println();
//				}
//				else {
//					break;
//				}
//			}
//		}
//		System.out.println("-----정렬 후-----");
//		for (int i=0; i<ar.length; i++) {
//			System.out.print(ar[i]+ " ");
//		}
//		System.out.println();
//	}
//}

//	버블정렬 예문

	public static void main(String[] args) {
			int ar[] = {6,4,7,9,1};
			System.out.println("-----정렬 전-----");
			for (int i=0; i<ar.length; i++) {
				System.out.print(ar[i]+" ");
			}
			System.out.println();
			System.out.println();
			int tmp;
			//i: 제일 큰 값이 올 위치 -> 범위: 배열끝 ~ 0 까지
			for (int i=ar.length-1; i>=0; i--) {
				//j: 비교할 idx -> 범위: 0 ~ i 까지
				for (int j=0; j<i; j++) {
					if(ar[j]>ar[j+1]) {
						tmp=ar[j];
						ar[j]=ar[j+1];
						ar[j+1]=tmp;
						for (int k=0; k<ar.length; k++) {
							System.out.print(ar[k]+" ");
						}
						System.out.println();
					}
				}
			}
			System.out.println();
			System.out.println("-----정렬 후-----");
			for (int i=0; i<ar.length; i++) {
				System.out.print(ar[i]+" ");
			}
			System.out.println();
	}
}