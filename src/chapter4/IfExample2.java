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
		System.out.println("Ȯ�ε� ���̴� : " + age + "�� �Դϴ�.");
		System.out.println("�����Ͻ� �ݾ��� : "+ charge + "�Դϴ�.");
	}

}
