package ch6CT;

public class BookInfoTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001,"Lee");
		studentLee.addBook("태백산맥1","조정래");
		studentLee.addBook("태백산맥2","조정래");
		studentLee.addBook("태백산맥3","조정래");
		studentLee.addBook("태백산맥4","조정래");
		studentLee.addBook("태백산맥5","조정래"); 

		Student studentKim = new Student(1002,"Kim");
		studentKim.addBook("토지1","박경리");
		studentKim.addBook("나목","박완서");

		Student studentAnn =new Student(1003,"Ann");
		studentAnn.addBook("해리포터비밀의방","조앤롤링");
		studentAnn.addBook("해리포터마법사의돌", "조앤롤링");
		studentAnn.addBook("해리포터불의 잔", "조앤롤링");

		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		studentAnn.showStudentInfo();
	}

}
