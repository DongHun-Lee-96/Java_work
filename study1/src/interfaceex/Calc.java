package interfaceex;

//�������̽����� ����� �߻� �޼��尡 ����ȴ�
public interface Calc {
	
	double PI = 3.14; //public static final�� �ڵ����� ����
	int Error = -999999999;
	
	int add(int num1, int num2);  //public abstract�� �ڵ� ����
	int subtract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�");
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i:arr) {
			total += i;
		}
		return total;
	}

}