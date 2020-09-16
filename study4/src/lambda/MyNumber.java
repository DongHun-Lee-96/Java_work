package lambda;

@FunctionalInterface
public interface MyNumber {
	
	//메서드는 하나만 선언해야한다
	int getMaxNumber(int num1, int num2);

}
