package ch5CT;

public class StarCoffee {
	
	int money;
	
	public String brewing(int money) {
		this.money += money;
		if(money == Menu.STARAMEICANO) {
			return "별다방 아메리카노를 구입하셨습니다.";
		}else if (money == Menu.STARLATTE) {
			return "별다방 라떼를 구입하셨습니다.";
		}else if (money == Menu.STARFRAPPUCINO) {
			return "별다방 프라푸치노를 구입하셨습니다.";
		}else {
			return null; 
		}
		
	}
	
}
