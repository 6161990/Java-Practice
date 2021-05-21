package chapter7;

import java.util.ArrayList;

public class AnimalTest {

	public static void main(String[] args) {
		Animal human = new Human();
		Animal rabbit = new Rabbit();
		Animal fish = new Fish();
		
		/*AnimalTest test = new AnimalTest();
		test.eatAnimal(human);
		test.eatAnimal(rabbit);
		test.eatAnimal(fish);
		}
		
		Human humanWalk = (Human)human;
		humanWalk.walking();
		
		if(human instanceof Rabbit) {
			Rabbit humanWalking = (Rabbit)human;
		} //instanceof�� true�� false�� ��ȯ�ϱ� ������ �ƹ��͵� ��µ��� ����. 
	
		if(human instanceof Human) {
			Human humanWalking = (Human)human;
			humanWalking.walking();
		}*/
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(human);
		animalList.add(rabbit);
		animalList.add(fish);
		
		/*for(Animal animal : animalList) {
			animal.eat();
		}*/
		
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
	}
	
		
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i=0; i<list.size(); i++) {
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {
				Human humanWalking = (Human)animal;
				humanWalking.walking();
			}else if(animal instanceof Rabbit) {
				Rabbit rabbitJumping = (Rabbit)animal;
				rabbitJumping.jumping();
			}else if(animal instanceof Fish) {
				Fish fishSwimming =(Fish)animal;
				fishSwimming.swimming();
			}else {
				System.out.println("error");
			}
		}
	}
	
	
	public void eatAnimal(Animal animal) {
		animal.eat();
	}
	
}
