package chapter8;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("���ο���1");
		bookQueue.enQueue("�ٺ����� ž");
		bookQueue.enQueue("�� �޽İ� �̿��� ��");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}

}
