package ch7CT;

public class GoldCustomer extends Customer{
	double salesRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade ="GOLD";
		bonusRatio = 0.03;
		salesRatio = 0.01; 
	}
	@Override
	public int CalcPrice (int price) {
		bonusPoint += price * bonusRatio;
		return price -(int)(price*salesRatio);
	}


}
