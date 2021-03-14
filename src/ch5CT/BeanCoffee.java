package ch5CT;

public class BeanCoffee {
	
int money;
	
	public String brewing(int money) {
		this.money += money;
		if(money == Menu.BEANAMEICANO) {
			return "콩다방 아메리카노를 구입하셨습니다.";
		}else if (money == Menu.BEANLATTE) {
			return "콩다방 라떼를 구입하셨습니다.";
		}else if (money == Menu.BEANSMOOTHIE) {
			return "콩다방 스무디를 구입하셨습니다.";
		}else {
			return null; 
		}	
}
}