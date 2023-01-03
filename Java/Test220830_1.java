
//실습문제 1
class Book {
	String bookName, author;
	void set_info(String _bookName, String _author) {
		bookName = _bookName;
		author = _author;		
	}	
	void print_info() {
		System.out.println("책 제목 : " + bookName);
		System.out.println("책 저자 : " + author);
	}	
}

//실습문제 2
class Song {
	String 노래제목, 노래장르;
		
	void set_song(String _노래제목, String _노래장르) {
		노래제목 = _노래제목;
		노래장르 = _노래장르;
	}
	
	void print_song() {
		System.out.println("노래제목: " + 노래제목 + "(" + 노래장르 + ")" );
	}	
	
}

class Singer {
	Song song;
	
	String 가수이름;
	
	void set_singer(String _가수이름) {
		가수이름 = _가수이름;
	}
	
	void hit_song(Song _song) {
		song = _song;
	}
	
	void print_singer() {
		System.out.println("가수이름: " + 가수이름);
		song.print_song();
	}

}

public class Test220830_1 {
	
	public static void main(String[] args) {
		
		//book1, book2 인스턴스 생성
		Book book1 = new Book();
		Book book2 = new Book();
		
		//book1, book2 제목과 저자 정보 저장
		book1.set_info("파이썬", "민경택");
		book2.set_info("어린왕자", "생택쥐페리");
		
		book1.print_info();
		book2.print_info();
		
		
		//song 인스턴스 생성
		Song song = new Song();
		song.set_song("취중진담","발라드");
		
		//singer 인스턴스 생성
		Singer singer = new Singer();
		singer.set_singer("김동률");
		
		//singer의 대표곡 지정
		singer.hit_song(song);
		
		//singer 정보 출력
		singer.print_singer();
		
		
	}

}
