package chapter6;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);  	//제네릭없이 사용시, String str = (String)list.get(i);
			System.out.println(str);
		}
		
		System.out.println("===================");
		
		for(String str: list) {     	//제네릭없이 사용시, for(Object str: list)
			System.out.println(str);
		}
		
	}

}
