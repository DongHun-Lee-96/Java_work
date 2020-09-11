package interfaceex;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		customer.order(); //셋 다 고객판매주문
		buyer.order(); 	// 인스턴스가 customer이고 
		seller.order(); // 오버라이딩 되었기때문
	}

}
