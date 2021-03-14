package chapter6;

public class Copy {
	
	public static void main(String[] args) {
		Book[] library = new Book[5]; 
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("생활코딩","이고잉");
		library[1] = new Book("자바의 정석","남궁성");
		library[2] = new Book("그 후 ","나쓰메소세키");
		library[3] = new Book("스토너","존 윌리엄스");
		library[4] = new Book("끈이론","데이비드 포스터 윌리스");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i =0; i<library.length; i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		library[0].setAuthor("김상욱");
		library[0].setTitle("김상욱의 양자공부");
		
		for(Book book : library) {  
			book.showBookInfo();
		}
		
		System.out.println("=========================");
		
		for(Book book : copyLibrary) {  
			book.showBookInfo();
		}
	}

}
