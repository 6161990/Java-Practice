package chapter6;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001,"�̸���");
		studentLee.addSubject("����", 84);
		studentLee.addSubject("����", 45);
		
		Student studentJu = new Student(1002,"��ȣ��");
		studentJu.addSubject("����", 74);
		studentJu.addSubject("����", 65);
		studentJu.addSubject("����", 98);
		
		studentLee.showStudentInfo();
		System.out.println("======================");
		studentJu.showStudentInfo();
	}

}
