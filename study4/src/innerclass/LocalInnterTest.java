package innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	//익명내부클래스 //변수에 대입하여 구현
	Runnable runnable = new Runnable() {

		@Override
		public void run() {
			System.out.println("runnable");
		}
	};
	
	//메서드 안에 구현
	public Runnable getRunnable() {
		
		//메서드 안에 선언된 로컬변수는 상수화 된다
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
