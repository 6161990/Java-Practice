package chapter8;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율주행합니다.");
	}

	@Override
	public void stop() {
		System.out.println("차가 스스로 멈춥니다.");
	}

	@Override
	public void washCar() {
		System.out.println("자동 세차를 시작합니다");
	}
	

}
