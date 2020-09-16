package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		//�Ϲ����� ��ü���� ��� - ������ �������̽�, �޼���
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("hello", "Java");
		
		//���ٽ� ����ؼ� ���� - �ϳ��� �޼���
		StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
		concat.makeString("hello", "Java");
		
		//���ٽ� ����ϸ� �ڵ����� �����Ǵ� �͸� Ŭ���� - �ϳ��� �������̽��� �߻�Ŭ����
		StringConcat concat2 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " " + s2);	
			}
		};
		concat2.makeString("hello", "Java");
	}
}
