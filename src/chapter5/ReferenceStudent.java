package chapter5;

public class ReferenceStudent {
	
	int studentID;
	String studentName;
	
	ReferenceSubject korea;
	ReferenceSubject math;
	
	public ReferenceStudent(int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new ReferenceSubject();
		math = new ReferenceSubject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName  = name;
		math.score =score;
	}

	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
	}
}
