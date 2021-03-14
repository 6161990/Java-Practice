package chapter4;

public class ForEx2 {

	public static void main(String[] args) {
		/*
		int dan;
		int count;
		
		for (dan=1; dan<=9; dan++) {
			for(count=1; count <=9; count ++) {
				System.out.println(dan +"X" + count + "=" + dan * count);
				
			}
			System.out.println();
		}*/
		
		int dan = 2;
		int count;
		
		while(dan <= 9) {
			count = 1;
			while(count <=9) {
				System.out.println(dan +"X" + count + "=" + dan * count);
				count++;
			}
			dan++;
			System.out.println();
			
		}
		
		
		
		
		
		
	}

}
