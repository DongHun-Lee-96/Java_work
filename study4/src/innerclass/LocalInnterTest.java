package innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	//�͸���Ŭ���� //������ �����Ͽ� ����
	Runnable runnable = new Runnable() {

		@Override
		public void run() {
			System.out.println("runnable");
		}
	};
	
	//�޼��� �ȿ� ����
	public Runnable getRunnable() {
		
		//�޼��� �ȿ� ����� ���ú����� ���ȭ �ȴ�
		int localNum = 100;
		return new Runnable() {
			
			@Override
			public void run() {
				outNum += 20;
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			}
		};
	}
}

public class LocalInnterTest {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.getRunnable().run();
		
		outer.runnable.run();

	}

}
