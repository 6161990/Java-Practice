package ch5CT;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Person kimjenny = new Person("kimjenny", 20000);
		Person GDragon = new Person("kwonkiyong",200000);
		
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		kimjenny.buyStarCoffee(starCoffee, Menu.STARLATTE);
		GDragon.buyBeanCoffee(beanCoffee, Menu.BEANSMOOTHIE);
	}

}
