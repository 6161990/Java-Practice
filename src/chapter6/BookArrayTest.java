package chapter6;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5]; 
		
		
		library[0] = new Book("��Ȱ�ڵ�","�̰���");
		library[1] = new Book("�ڹ��� ����","���ü�");
		library[2] = new Book("�� �� ","�����޼Ҽ�Ű");
		library[3] = new Book("�����","�� ��������");
		library[4] = new Book("���̷�","���̺�� ������ ������");
		
		
		for(int i=0; i<library.length; i++){
			System.out.println(library[i]);
			library[i].showBookInfo();
			}
	}

}
//
