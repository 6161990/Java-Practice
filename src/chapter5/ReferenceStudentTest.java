package chapter5;

public class ReferenceStudentTest {

	public static void main(String[] args) {
		ReferenceStudent studentLee = new ReferenceStudent(101, "�̸���");
		studentLee.setKoreaSubject("����", 89);
		studentLee.setMathSubject("����", 70);
		
		studentLee.showStudentScore();
		
		ReferenceStudent studentKim = new ReferenceStudent(102, "��ǳ");
		studentKim.setKoreaSubject("����", 50);
		studentKim.setMathSubject("����", 38);
		
		studentKim.showStudentScore();
	}

}
