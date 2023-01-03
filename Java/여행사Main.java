import java.util.Scanner;

interface 여행상품 {
		void	레저스포츠();
		void 관광투어();
		void 먹방투어();		
}

class 한국여행 implements 여행상품 {
		@Override
		public void 관광투어() {
				System.out.println("서울타워 구경");						
		}
		
		@Override
		public void 레저스포츠() {	
				System.out.println("한강에서 수상스키 타기");		
		}
		
		@Override
		public void 먹방투어() {		
				System.out.println("삼겹살 무한리필");
		}
}

class 일본여행 implements 여행상품 {
	@Override
	public void 관광투어() {
			System.out.println("스카이트리 구경");						
	}
	
	@Override
	public void 레저스포츠() {	
			System.out.println("후지큐 가기");		
	}
	
	@Override
	public void 먹방투어() {		
			System.out.println("오마카세 무한리필");
	}
}

class 여행가이드 {

		private 여행상품 나라;
		
		 public 여행가이드(여행상품 나라) {
			 this.나라 = 나라;
		 }
		 
		 //여행상품이 private 이므로 setter 생성하여 사용 필요
		public void set나라(여행상품 나라) {
			this.나라 = 나라;
		}
		
		
		public void 레저스포츠진행() {
				나라.레저스포츠();	//내가 가능한 나라에서 레저스포츠 진행
		}
		
		public void 먹방투어진행() {
				나라.먹방투어();	//내가 가능한 나라에서 먹방투어 진행
		}
		public void 관광투어진행() {
				나라.관광투어();	//내가 가능한 나라에서 관광투어 진행
		}
}


public class 여행사Main {

	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("여행 상품을 초기화 합니다..");
			일본여행 일본 = new 일본여행();
			한국여행 한국 = new 한국여행();
			System.out.println("가이드를 한 명 생성합니다..");
			여행가이드 홍길동 = new 여행가이드(new 일본여행());
			
			while(true) {
				System.out.println("어디에 갈래요? > 1. 한국, 2. 일본");
				switch(input.nextInt()) {
				case 1:
					홍길동.set나라(한국);
					홍길동.먹방투어진행();
					break;
				case 2:
					홍길동.set나라(일본);
					홍길동.먹방투어진행();
					break;
				}
			}

	}

}
