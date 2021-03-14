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
		System.out.println(CarNumber+ "번 택시의 승객은"+ passengerCount +" 명 이고, 수입은 "+ income + "입니다.");
	}

}
