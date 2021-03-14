package chapter10;


class Student {
	int studentNumber;
	String studentName;
	
	public Student (int studentNumber, String studentName) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			return (this.studentNumber == std.studentNumber);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNumber;
	}
	
}
public class EqualsTest {

	public static void main(String[] args) {
		/*Student Kim = new Student(1004,"±è¼ø¼ö");
		Student Kim2 = Kim;
		Student Soo = new Student(1004,"±è¼ø¼ö");
		
		System.out.println(Kim == Soo);
		System.out.println(Kim == Kim2);
		System.out.println(Kim.equals(Soo));
		
		System.out.println(Kim);
		System.out.println(Kim.hashCode());*/
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));

		
	}

}
