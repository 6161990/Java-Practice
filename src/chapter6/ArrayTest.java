package chapter6;

public class ArrayTest {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'A';  //���ڷ� ������ ǥ�� ch�� 65, 
		
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch++; //++�� �ڿ� �پ��ֱ� ������ �����ϰ� ���� �������Ե�. 
		}
		
		for(int i=0; i<alphabets.length; i++) {
			System.out.println(alphabets[i]+ ","+(int)alphabets[i]);
		}
	}
}