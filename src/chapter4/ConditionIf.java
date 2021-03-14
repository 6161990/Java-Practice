package chapter4;

public class ConditionIf {

	public static void main(String[] args) {
		char Top_grade;
		
		int math = 100;
		int eng = 99;
		char Agrade ='A';
		char Bgrade = 'B';
		
		Top_grade= (math > eng)? Agrade :Bgrade;
		System.out.println(Top_grade);
	}

}
