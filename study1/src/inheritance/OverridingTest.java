package inheritance;

public class OverridingTest {
	
	public static void main(String[] args) {
		/*
		Customer customerLee = new Customer(10010, "LEE");
		int price = customerLee.calcPrice(10000);
		System.out.println("you need to pay " + price + " and " +
				customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10010, "LEE", 100);
		price = customerKim.calcPrice(10000);
		System.out.println("you need to pay " + price + " and " +customerKim.showCustomerInfo());
	*/
		
		//가상 메서드
		//상속 받고 재정의 된 메서드를 호출한다. 즉 타입의 calcPrice가 아닌 인스턴스의 calcPrice가 불림
		//다형성을 만드는 기본이 된다
		Customer customerWho = new VIPCustomer(10010, "who", 100);
		int price = customerWho.calcPrice(10000);
		System.out.println("you need to pay " + price + " and " +
				customerWho.showCustomerInfo());
		
		Customer customerGold = new GoldCustomer();
	}

}
