package chapter7;



public class Animal {

	public void eat() {
		System.out.println("동물이 먹습니다.");
	}
}

class Human extends Animal{
	public void eat() {
		System.out.println("사람은 젓가락을 사용합니다");
	}
	public void walking() {
		System.out.println("사람은 걷습니다.");
	}
}
class Rabbit extends Animal{
	public void eat() {
		System.out.println("토끼는 발을 이용합니다.");
	}
	public void jumping() {
		System.out.println("토끼는 껑충껑충뜁니다.");
	}
}
class Fish extends Animal{
	public void eat() {
		System.out.println("물고기는 물어뜯습니다.");
	}
	public void swimming() {
		System.out.println("물고기는 유유히 헤엄칩니다.");
	}

}



