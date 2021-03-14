package chapter6;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5]; 
		
		
		library[0] = new Book("생활코딩","이고잉");
		library[1] = new Book("자바의 정석","남궁성");
		library[2] = new Book("그 후 ","나쓰메소세키");
		library[3] = new Book("스토너","존 윌리엄스");
		library[4] = new Book("끈이론","데이비드 포스터 윌리스");
		
		
		for(int i=0; i<library.length; i++){
			System.out.println(library[i]);
			library[i].showBookInfo();
			}
	}

}
//
