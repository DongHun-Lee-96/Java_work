package interfaceex;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		customer.order(); //�� �� ���Ǹ��ֹ�
		buyer.order(); 	// �ν��Ͻ��� customer�̰� 
		seller.order(); // �������̵� �Ǿ��⶧��
	}

}
