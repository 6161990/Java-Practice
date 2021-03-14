package ch6CT;

import java.util.ArrayList;

public class Student {
	
	String studentName;
	int studentID;
	ArrayList<BookInfo> bookInfo;
	
	public Student(int studentID, String studentName) {
		this.studentID=studentID;
		this.studentName=studentName;
		
		bookInfo = new ArrayList<BookInfo>();
		
	}
	
	public void addBook(String title, String author) {
		BookInfo book = new BookInfo(title, author);
		
		book.setTitle(title);
		book.setAuthor(author);
		bookInfo.add(book);
	}
	public void showStudentInfo() {
		System.out.println(studentName+"학생이 읽은 책은");
		
		for(BookInfo book : bookInfo) {
			System.out.println(book.getTitle()+","+book.getAuthor());
		}
		System.out.println("입니다.");
	}
	
}
