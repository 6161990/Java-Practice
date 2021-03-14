package chapter6;

public class Copy {
	
	public static void main(String[] args) {
		Book[] library = new Book[5]; 
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("��Ȱ�ڵ�","�̰���");
		library[1] = new Book("�ڹ��� ����","���ü�");
		library[2] = new Book("�� �� ","�����޼Ҽ�Ű");
		library[3] = new Book("�����","�� ��������");
		library[4] = new Book("���̷�","���̺�� ������ ������");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i =0; i<library.length; i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		library[0].setAuthor("����");
		library[0].setTitle("������ ���ڰ���");
		
		for(Book book : library) {  
			book.showBookInfo();
		}
		
		System.out.println("=========================");
		
		for(Book book : copyLibrary) {  
			book.showBookInfo();
		}
	}

}
