package chapter6;

import java.util.ArrayList;

public class Student {
	
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();  //객체배열은 이렇게 한다고해서 데이터가 생성된게 아님
																	
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject(name, score); //직접 생성을 해줘야함. (String은 상수풀에 있기 때문에 생성필요없지만!)
		
		subjectList.add(subject); //생성한 뒤에, add.
	}
	
	public void showStudentInfo() {
		int total=0;
		for(Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println
			(studentName+" 학생의 "+subject.getName()+" 과목의 성적은 "+subject.getScore()+" 점 입니다.");
		}
		System.out.println(studentName+" 학생의 총점은 "+total+" 점 입니다." );
	}

}
