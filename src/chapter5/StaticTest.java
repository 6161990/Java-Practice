package chapter5;

public class StaticTest {

	public static void main(String[] args) {
		Static studentLee = new Static("Lee");
		System.out.println(studentLee.getSerialNum());
		
		Static studentYun = new Static(25,"Yun");
		
		Static studentKim = new Static(20,"Kim");
		System.out.println(studentKim.getSerialNum());
		
		System.out.println(studentLee.getStudentID());
		System.out.println(studentYun.getStudentID());
		System.out.println(studentKim.getStudentID());
		
	}

}
