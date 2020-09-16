package lambda;

interface PrintString {
	
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {
		
		//������ �����ؼ� �ٷ� ���
		PrintString lambdaPrint = str -> System.out.println(str);
		lambdaPrint.showString("test");
		
		//�Ű�����ó�� Ȱ��
		showMyString(lambdaPrint);
		
		//return������ Ȱ��
		PrintString restr = returnPrint();
		restr.showString("hello");
	}
	
	//�Ű�����ó�� Ȱ��
	public static void showMyString(PrintString lambda) {
		lambda.showString("test2");
	}
	
	//return������ Ȱ��
	public static PrintString returnPrint() {
		return s -> System.out.println(s + " world");
	}
}
