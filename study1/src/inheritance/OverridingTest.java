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
		
		//���� �޼���
		//��� �ް� ������ �� �޼��带 ȣ���Ѵ�. �� Ÿ���� calcPrice�� �ƴ� �ν��Ͻ��� calcPrice�� �Ҹ�
		//�������� ����� �⺻�� �ȴ�
		Customer customerWho = new VIPCustomer(10010, "who", 100);
		int price = customerWho.calcPrice(10000);
		System.out.println("you need to pay " + price + " and " +
				customerWho.showCustomerInfo());
		
		Customer customerGold = new GoldCustomer();
	}

}
