package chapter5;

public class CodingTest2 {
	
	long orderNum;
	String userID;
	String orderDate;
	String userName;
	String ItemID;
	String userAddress;
	
	public void orderInfo() {
		System.out.println("�ֹ���ȣ : " + orderNum);
		System.out.println("�ֹ��� ���̵� : " + userID);
		System.out.println("�ֹ� ��¥ : " + orderDate);
		System.out.println("�ֹ��� �̸� : " + userName);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + ItemID);
		System.out.println("��� �ּ� : " + userAddress);
	}

	public static void main(String[] args) {
		
		CodingTest2 order = new CodingTest2();
		order.orderNum =20210302000001L;
		order.userID = "abc123";
		order.orderDate = "2021�� 03�� 02��";
		order.userName = "����";
		order.ItemID = "GENTLE_MONSTER6522DKE12";
		order.userAddress = "����Ư���� ��걸 �ѳ��� �׷��̽� ��";
		
		order.orderInfo();
		

	}

}
