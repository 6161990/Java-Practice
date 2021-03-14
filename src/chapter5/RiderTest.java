package chapter5;

public class RiderTest {

	public static void main(String[] args) {
		Rider riderK = new Rider("Kimyeol", 5000);
		Rider riderL = new Rider("Leesin", 10000);
		Rider riderE = new Rider("Edward", 20000);
		
		Bus bus602 = new Bus(602);
		Bus bus6714 = new Bus(6714);
		Subway subwayGreen = new Subway(2);
		Subway subwayBlue = new Subway(4);
		Taxi taxi8484 = new Taxi(8484);
		
		riderK.takeBus(bus602);
		riderL.takeSubway(subwayGreen);
		riderE.takeTaxi(taxi8484);
		
		
		riderK.showInfo();
		riderL.showInfo();
		riderE.showInfo();
		System.out.println(' ');
		
		bus602.showBusInfo();
		bus6714.showBusInfo();
		System.out.println(' ');
		
		subwayGreen.showSubwayInfo();
		subwayBlue.showSubwayInfo();
		System.out.println(' ');
		
		taxi8484.showSubwayInfo();
		
		
	}

}
