package chapter5;

public class CodingTest2 {
	
	long orderNum;
	String userID;
	String orderDate;
	String userName;
	String ItemID;
	String userAddress;
	
	public void orderInfo() {
		System.out.println("주문번호 : " + orderNum);
		System.out.println("주문자 아이디 : " + userID);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문자 이름 : " + userName);
		System.out.println("주문 상품 번호 : " + ItemID);
		System.out.println("배송 주소 : " + userAddress);
	}

	public static void main(String[] args) {
		
		CodingTest2 order = new CodingTest2();
		order.orderNum =20210302000001L;
		order.userID = "abc123";
		order.orderDate = "2021년 03월 02일";
		order.userName = "제니";
		order.ItemID = "GENTLE_MONSTER6522DKE12";
		order.userAddress = "서울특별시 용산구 한남동 그레이스 빌";
		
		order.orderInfo();
		

	}

}
