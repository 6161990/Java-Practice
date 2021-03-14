package chapter4;

public class CodingTest1 {

	public static void main(String[] args) {
		char operator = '%';
		int num1 = 10;
		int num2 = 20;
		int result = 0;
		
		if (operator == '+') {
			result = num1 + num2;
		}
		else if (operator == '-') {
			result = num1 - num2;
		}
		else if (operator == '*') {
			result = num1 * num2 ;
		}
		else if (operator == '/') {
			result = num1 / num2;
		}
		else {
			System.out.println("Error");
			return;
		}
		
		System.out.println("결과 값은  " + result +" 입니다.");

	}

}
