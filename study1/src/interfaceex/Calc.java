package interfaceex;

//인터페이스에는 상수와 추상 메서드가 선언된다
public interface Calc {
	
	double PI = 3.14; //public static final이 자동으로 생성
	int Error = -999999999;
	
	int add(int num1, int num2);  //public abstract가 자동 생성
	int subtract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다");
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i:arr) {
			total += i;
		}
		return total;
	}

}
