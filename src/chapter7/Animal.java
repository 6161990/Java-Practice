package chapter7;



public class Animal {

	public void eat() {
		System.out.println("������ �Խ��ϴ�.");
	}
}

class Human extends Animal{
	public void eat() {
		System.out.println("����� �������� ����մϴ�");
	}
	public void walking() {
		System.out.println("����� �Ƚ��ϴ�.");
	}
}
class Rabbit extends Animal{
	public void eat() {
		System.out.println("�䳢�� ���� �̿��մϴ�.");
	}
	public void jumping() {
		System.out.println("�䳢�� ���沱��ݴϴ�.");
	}
}
class Fish extends Animal{
	public void eat() {
		System.out.println("������ �������ϴ�.");
	}
	public void swimming() {
		System.out.println("������ ������ ���Ĩ�ϴ�.");
	}

}



