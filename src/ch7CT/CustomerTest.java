package ch7CT;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010,"�̸���");
		Customer customerKim = new Customer(10011,"��ǳ");
		Customer customerJu = new GoldCustomer(10012,"��ȣ��");
		Customer customerCho = new GoldCustomer(10013,"���¿�");
		Customer customerShin = new VIPCustomer(10014,"����ö",1111);
	
		customerList.add(customerLee);
		customerList.add(customerKim); 
		customerList.add(customerJu);
		customerList.add(customerCho);
		customerList.add(customerShin);
		
		System.out.println("========�� ���� ���========");
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println("========�������� ���ʽ� ����Ʈ ���=========");
	
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.CalcPrice(price);
			System.out.println(customer.getCustomerName()+"����"+cost+"�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName()+"���� ���� ���ʽ� ����Ʈ��"+customer.bonusPoint+"�� �Դϴ�.");
		}
	
	}

}
