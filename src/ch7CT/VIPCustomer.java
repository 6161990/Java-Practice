package ch7CT;

public class VIPCustomer extends Customer{
	
	double salesRatio;
	private int agentID;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.04;
		salesRatio = 0.1;
		this.agentID = agentID;
	} 
	
	@Override
	public int CalcPrice(int price) {
		bonusPoint += price *bonusRatio;
		return price - (int)(price * salesRatio);
	}

	public String showCustomerInfo() {
		return super.showCustomerInfo()+"담당 상담원 번호는 " + agentID +"입니다.";
	}
	public int getAgentID() {
		return agentID;
	}

	
	
	

}
