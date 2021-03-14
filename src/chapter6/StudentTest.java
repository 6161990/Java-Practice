package chapter6;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001,"이말년");
		studentLee.addSubject("국어", 84);
		studentLee.addSubject("수학", 45);
		
		Student studentJu = new Student(1002,"주호민");
		studentJu.addSubject("국어", 74);
		studentJu.addSubject("수학", 65);
		studentJu.addSubject("영어", 98);
		
		studentLee.showStudentInfo();
		System.out.println("======================");
		studentJu.showStudentInfo();
	}

}
