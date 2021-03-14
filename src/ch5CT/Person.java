package ch5CT;

public class Person {
	int money;
	String name;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyStarCoffee(StarCoffee sCoffee, int money) {
		String message =sCoffee.brewing(4800);
		if(message != null) {
		this.money -= money;
		System.out.println(name+"¥‘¿Ã"+money+"¿∏∑Œ"+message);
		}
	}
	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.brewing(5000);
		if(message!=null) {
			this.money -=money;
			System.out.println(name+"¥‘¿Ã"+money+"¿∏∑Œ"+message);
		}
	}
	

}
