package inheritance;

public class VIPCustomer extends Customer {
	
	private int agentID;
	private double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); //super()는 직접 입력하지 않아도 상위 클래스가 스스로 호풀된다 (기본 생성자)
		customerGrade = "VIP";				//하지만 상위 생성자가 인수를 받게 되면 이렇게 직접 적어줘야한다
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
		System.out.println("VIPCustomer(int, string) 호출");
	}
	
	//Customer의 calcPrice 재정의
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
}
