package chapter4;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int rank = scanner.nextInt();
		char medal;
		
		switch(rank) {
		case 1 : medal= 'G';
			System.out.println("�ݸ޴�");
			break;
		case 2 : medal= 'S';
			System.out.println("���޴�");
			break;
		case 3 : medal= 'B';
			System.out.println("���޴�");
			break;
		default : medal = 'A';
		}
		System.out.println(rank+ "���� " + medal +"�޴� �Դϴ�.");
	}

}
