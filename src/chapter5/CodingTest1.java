package chapter5;

public class CodingTest1 {
	
	int age;
	String name;
	Boolean merried;
	int children;

	public void showInfo() {
		System.out.println(name + "�� ���̴� " + age + " �̰�, ��ȥ ���δ� " + merried + " �̸� �ڽ� ���� " + children + " �Դϴ�.");
	}
	public static void main(String[] args) {
		
		CodingTest1 person = new CodingTest1();
		person.age = 45;
		person.name = "�輳��";
		person.merried = true;
		person.children = 4;
		
		person.showInfo();
		
		
		
	}

}
