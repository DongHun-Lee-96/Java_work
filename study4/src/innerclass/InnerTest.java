package innerclass;

class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	private class InClass{
		//instance inner class
		int inNum = 200;
		//static int sInNum = 100; 인스턴스 생성과 상관없이 static 사용 불가해서 이렇게는 안됨
	
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
 	}
	
	public void usingInTest() {
		inClass.inTest();	
	}
	
	static class InStaticClass{
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//num += 10; //외부클래스가 생성되지않고 변수사용 불가
			sNum += 10; //static 변수라 사용가능
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}
		
		static void sTest() {
			System.out.println(sNum);
			System.out.println(sInNum);
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		
		//private하면 이렇게 생성 불가능
		//outClass.inClass.inTest();
		//OutClass.InClass inClass = outClass.new InClass();
		//inClass.inTest();
		
		outClass.usingInTest();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		OutClass.InStaticClass.sTest();
		
	}

}
