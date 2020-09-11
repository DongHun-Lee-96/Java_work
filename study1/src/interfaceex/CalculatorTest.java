package interfaceex;

public class CalculatorTest {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
		//Calc calc1 = new Calc(); 인터페이스는 생성이 불가
		//Calc calc2 = new Calculator(); 추상클래스도 불가
		Calculator calc3 = new CompleteCalc(); //이것도 가능
		
		System.out.println(calc.add(num1, num2));
		//calc.showInfo()는 불가능 왜냐면 타입이 Calc or Calculator이기 때문에 
		//새롭게 만들어진 메서드는 실행 불가.다운캐스팅 필요
		
		CompleteCalc calc4 = new CompleteCalc();
		calc4.showInfo();
		
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum);
	}
}
