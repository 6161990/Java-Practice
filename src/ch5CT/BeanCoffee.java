package ch5CT;

public class BeanCoffee {
	
int money;
	
	public String brewing(int money) {
		this.money += money;
		if(money == Menu.BEANAMEICANO) {
			return "��ٹ� �Ƹ޸�ī�븦 �����ϼ̽��ϴ�.";
		}else if (money == Menu.BEANLATTE) {
			return "��ٹ� �󶼸� �����ϼ̽��ϴ�.";
		}else if (money == Menu.BEANSMOOTHIE) {
			return "��ٹ� ������ �����ϼ̽��ϴ�.";
		}else {
			return null; 
		}	
}
}