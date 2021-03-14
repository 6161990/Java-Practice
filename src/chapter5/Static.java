package chapter5;

public class Static {
	private static int serialNum = 1000;
	private int studentID;
	public String studentName;
	public String address;
	
	public Static(String name) {
		studentName = name;
		setSerialNum(getSerialNum() + 1);
		studentID = getSerialNum();
	}
	
	public Static(int id, String name) {
		studentID =id;
		studentName = name;
		address = "주소없음";
		setSerialNum(getSerialNum() + 1);
		studentID = getSerialNum();
		
	}

	public int getStudentID() {
		return studentID;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Static.serialNum = serialNum;
	}

}
