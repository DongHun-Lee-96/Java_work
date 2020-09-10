
public class Player {
	public int x;
	private int y;
	private String shape;
	
	public Player(int x,int y,String shape) {
		this.x = x;
		this.y = y;
		this.shape = shape;
	}
	
	public void display() {
		System.out.println(x+","+y+":"+shape);
	}
};
