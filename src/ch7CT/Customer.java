package ch7CT;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	double bonusPoint;
	double bonusRatio;
	
	
	public Customer() {
		initCustomer();
	}
	private void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
	}
	 
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		initCustomer();
	}
	public int CalcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	public String showCustomerInfo() {
		return customerName+"���� ����� "+ customerGrade+"�̸�, ������ ����Ʈ�� "+bonusPoint+"�� �Դϴ�.";
	}
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

}