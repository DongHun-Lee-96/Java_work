package inheritance;

public class Circle {
	
	//Composition
	Point point;  //has -a
	
	private int radius;
	
	public Circle() {
		point = new Point();
	}
	
}
//가져다 쓴다 해서 다 상속이 아니다