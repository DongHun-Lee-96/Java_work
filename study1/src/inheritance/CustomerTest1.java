package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		/*
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10100);
		customerLee.setCustomerName("Lee");
		*/
		
		//Upcasting
		//VIPCustomer�� Customer�� �����̱� ����
		//VIPCustomer() �������� ȣ��� �ν��Ͻ��� ��� ���� �Ǿ�����
		//Ÿ���� Customer�̹Ƿ� ���� ������ ������ �޼���� Customer�� ������ �޼����̴�
		Customer customerKim = new VIPCustomer(10101, "kim", 100);
		
		customerKim.bonusPoint = 1000;

		
		//System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
