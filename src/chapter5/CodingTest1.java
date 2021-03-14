package chapter5;

public class CodingTest1 {
	
	int age;
	String name;
	Boolean merried;
	int children;

	public void showInfo() {
		System.out.println(name + "의 나이는 " + age + " 이고, 결혼 여부는 " + merried + " 이며 자식 수는 " + children + " 입니다.");
	}
	public static void main(String[] args) {
		
		CodingTest1 person = new CodingTest1();
		person.age = 45;
		person.name = "김설현";
		person.merried = true;
		person.children = 4;
		
		person.showInfo();
		
		
		
	}

}
