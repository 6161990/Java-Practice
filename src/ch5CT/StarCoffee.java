package ch5CT;

public class StarCoffee {
	
	int money;
	
	public String brewing(int money) {
		this.money += money;
		if(money == Menu.STARAMEICANO) {
			return "���ٹ� �Ƹ޸�ī�븦 �����ϼ̽��ϴ�.";
		}else if (money == Menu.STARLATTE) {
			return "���ٹ� �󶼸� �����ϼ̽��ϴ�.";
		}else if (money == Menu.STARFRAPPUCINO) {
			return "���ٹ� ����Ǫġ�븦 �����ϼ̽��ϴ�.";
		}else {
			return null; 
		}
		
	}
	
}
