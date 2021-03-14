package ch7CT;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010,"이말년");
		Customer customerKim = new Customer(10011,"김풍");
		Customer customerJu = new GoldCustomer(10012,"주호민");
		Customer customerCho = new GoldCustomer(10013,"조승우");
		Customer customerShin = new VIPCustomer(10014,"신해철",1111);
	
		customerList.add(customerLee);
		customerList.add(customerKim); 
		customerList.add(customerJu);
		customerList.add(customerCho);
		customerList.add(customerShin);
		
		System.out.println("========고객 정보 출력========");
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println("========할인율과 보너스 포인트 계산=========");
	
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.CalcPrice(price);
			System.out.println(customer.getCustomerName()+"님이"+cost+"원 지불하셨습니다.");
			System.out.println(customer.getCustomerName()+"님의 현재 보너스 포인트는"+customer.bonusPoint+"점 입니다.");
		}
	
	}

}
