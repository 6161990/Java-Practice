package chapter5;

public class Rider {
	
	String name;
	int money;
	
	public Rider(String name, int money) {
		this.name = name;
		this.money = money;
	}
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money-=1000;
	}

	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money-=1200;
	}
	public void takeTaxi(Taxi taxi) {
		taxi.take(5400);
		this.money-=5400;
	}
	
	public void showInfo() {
		System.out.println(name+"님의 남은 돈은"+money + "원 입니다.");
	}
}
