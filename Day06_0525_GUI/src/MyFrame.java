import java.awt.Frame;
import java.awt.Graphics;

public class MyFrame extends Frame{
	
	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;
	int i;
	MallardDuck[] blue = new MallardDuck[3];
	RedDuck[] red = new RedDuck[3];
	
	public MyFrame() {
		super();  // this = new Frame();
		for(i=0;i<3;i++) {
			blue[i] = new MallardDuck();
			red[i] = new RedDuck();
		}
		
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {	
		for(i=0;i<3;i++) {
		blue[i].display(g);
		blue[i].swim(g);
		blue[i].quack(g);
		red[i].display(g);
		red[i].swim(g);
		red[i].quack(g);
		}	
	}
};
