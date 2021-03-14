package chapter5;

public class ReferenceStudentTest {

	public static void main(String[] args) {
		ReferenceStudent studentLee = new ReferenceStudent(101, "이말년");
		studentLee.setKoreaSubject("국어", 89);
		studentLee.setMathSubject("수학", 70);
		
		studentLee.showStudentScore();
		
		ReferenceStudent studentKim = new ReferenceStudent(102, "김풍");
		studentKim.setKoreaSubject("국어", 50);
		studentKim.setMathSubject("수학", 38);
		
		studentKim.showStudentScore();
	}

}
