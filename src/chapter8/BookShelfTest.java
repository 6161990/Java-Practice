package chapter8;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("제인에어1");
		bookQueue.enQueue("바벨로의 탑");
		bookQueue.enQueue("내 휴식과 이완의 해");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}

}
