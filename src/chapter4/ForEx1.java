package chapter4;

public class ForEx1 {

	public static void main(String[] args) {
		//for
		int i=1;
		int sum = 0;
		
		for(i=0; i<=10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		//while
		int count = 0;
		int total = 0;
		
		while(count <= 10) {
			total += count;
			count ++;
		}
		System.out.println(total);
	}
	
	
	
}
