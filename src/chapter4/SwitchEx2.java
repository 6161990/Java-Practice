package chapter4;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int rank = scanner.nextInt();
		char medal;
		
		switch(rank) {
		case 1 : medal= 'G';
			System.out.println("금메달");
			break;
		case 2 : medal= 'S';
			System.out.println("은메달");
			break;
		case 3 : medal= 'B';
			System.out.println("동메달");
			break;
		default : medal = 'A';
		}
		System.out.println(rank+ "등은 " + medal +"메달 입니다.");
	}

}
