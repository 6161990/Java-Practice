package ch6CT;

public class BookInfoTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001,"Lee");
		studentLee.addBook("�¹���1","������");
		studentLee.addBook("�¹���2","������");
		studentLee.addBook("�¹���3","������");
		studentLee.addBook("�¹���4","������");
		studentLee.addBook("�¹���5","������"); 

		Student studentKim = new Student(1002,"Kim");
		studentKim.addBook("����1","�ڰ渮");
		studentKim.addBook("����","�ڿϼ�");

		Student studentAnn =new Student(1003,"Ann");
		studentAnn.addBook("�ظ����ͺ���ǹ�","���طѸ�");
		studentAnn.addBook("�ظ����͸������ǵ�", "���طѸ�");
		studentAnn.addBook("�ظ����ͺ��� ��", "���طѸ�");

		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		studentAnn.showStudentInfo();
	}

}
