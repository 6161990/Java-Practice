package chapter4;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int age = scanner.nextInt();
		int charge = 0;
		
		if (age<8) {
			charge = 3000;
		}
		else if (age < 14 ) {
			charge = 5000;
		}
		else if (age < 18) {
			charge = 7000;
		}
		else {
			charge = 10000;
		}
		System.out.println("확인된 나이는 : " + age + "세 입니다.");
		System.out.println("지불하실 금액은 : "+ charge + "입니다.");
	}

}
