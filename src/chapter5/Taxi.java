package chapter5;

public class Taxi {
	int CarNumber;
	int passengerCount;
	int income;

	public Taxi(int CarNumber) {
		this.CarNumber = CarNumber;
	}
	public void take(int income) {
		this.income += income;
		passengerCount++;
	}
	public void showSubwayInfo() {
		System.out.println(CarNumber+ "�� �ý��� �°���"+ passengerCount +" �� �̰�, ������ "+ income + "�Դϴ�.");
	}

}
