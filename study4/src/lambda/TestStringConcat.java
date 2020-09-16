package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		//일반적인 객체지향 방식 - 여러개 인터페이스, 메서드
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("hello", "Java");
		
		//람다식 사용해서 구현 - 하나의 메서드
		StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
		concat.makeString("hello", "Java");
		
		//람다식 사용하면 자동으로 생성되는 익명 클래스 - 하나의 인터페이스나 추상클래스
		StringConcat concat2 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " " + s2);	
			}
		};
		concat2.makeString("hello", "Java");
	}
}
