package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		/*
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10100);
		customerLee.setCustomerName("Lee");
		*/
		
		//Upcasting
		//VIPCustomer는 Customer의 일종이기 때문
		//VIPCustomer() 생성자의 호출로 인스턴스는 모두 생성 되었지만
		//타입이 Customer이므로 접근 가능한 변수나 메서드는 Customer의 변수와 메서드이다
		Customer customerKim = new VIPCustomer(10101, "kim", 100);
		
		customerKim.bonusPoint = 1000;

		
		//System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
