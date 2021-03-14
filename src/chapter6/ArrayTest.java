package chapter6;

public class ArrayTest {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'A';  //문자로 정수로 표현 ch는 65, 
		
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch++; //++이 뒤에 붙어있기 때문에 수행하고 나서 더해지게됨. 
		}
		
		for(int i=0; i<alphabets.length; i++) {
			System.out.println(alphabets[i]+ ","+(int)alphabets[i]);
		}
	}
}