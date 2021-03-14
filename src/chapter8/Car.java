package chapter8;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	public void washCar() {	}
	
	final public void run() {
		startCar();
		drive();	
		stop();
		turnOff();
		washCar();
	}
	public static void main(String[] args) {
		Car aiCar = new AICar();
		aiCar.run();
		System.out.println("=============");
		Car manualCar = new ManualCar();
		manualCar.run();
	}
}
