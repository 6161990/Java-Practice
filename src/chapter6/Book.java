package chapter6;

public class Book {
	
	private String title;
	private String author;
	
	public Book() {}
	
	public Book(String title, String author) {
		this.setTitle(title);
		this.setAuthor(author);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public void showBookInfo() {
		System.out.println(title+","+author);
	}

}