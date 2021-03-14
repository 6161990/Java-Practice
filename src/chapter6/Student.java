package chapter6;

import java.util.ArrayList;

public class Student {
	
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();  //��ü�迭�� �̷��� �Ѵٰ��ؼ� �����Ͱ� �����Ȱ� �ƴ�
																	
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject(name, score); //���� ������ �������. (String�� ���Ǯ�� �ֱ� ������ �����ʿ������!)
		
		subjectList.add(subject); //������ �ڿ�, add.
	}
	
	public void showStudentInfo() {
		int total=0;
		for(Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println
			(studentName+" �л��� "+subject.getName()+" ������ ������ "+subject.getScore()+" �� �Դϴ�.");
		}
		System.out.println(studentName+" �л��� ������ "+total+" �� �Դϴ�." );
	}

}
