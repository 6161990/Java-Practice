package chapter6;

public class MultiArray {

	public static void main(String[] args) {
		String[][] arr = {{"101ȣ","102ȣ","103ȣ"},{"104ȣ","105ȣ","106ȣ"}};
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
