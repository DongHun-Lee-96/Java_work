package interfaceex;

public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0){
			return num1/num2;
		}
		else {
			return Error;
		}
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현함");
	}
	
	@Override
	public void description() {
		System.out.println("완전한 계산기 입니다");
	}
	

}
