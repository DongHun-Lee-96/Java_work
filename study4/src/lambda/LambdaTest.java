package lambda;

interface PrintString {
	
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {
		
		//변수에 대입해서 바로 사용
		PrintString lambdaPrint = str -> System.out.println(str);
		lambdaPrint.showString("test");
		
		//매개변수처럼 활용
		showMyString(lambdaPrint);
		
		//return값으로 활용
		PrintString restr = returnPrint();
		restr.showString("hello");
	}
	
	//매개변수처럼 활용
	public static void showMyString(PrintString lambda) {
		lambda.showString("test2");
	}
	
	//return값으로 활용
	public static PrintString returnPrint() {
		return s -> System.out.println(s + " world");
	}
}
