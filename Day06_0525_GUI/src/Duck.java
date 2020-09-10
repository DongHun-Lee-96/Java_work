import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

public class Duck {
	
	protected int x;
	protected int y;
	
	public Duck() {
		Random rnd = new Random();
		x = rnd.nextInt(MyFrame.FRAME_WIDTH-100)+50;
		y = rnd.nextInt(MyFrame.FRAME_HEIGHT-100)+50;
	}
	public Duck(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void display(Graphics g) {
		g.setColor(new Color(255,0,0));
		g.fillOval(x, y, 50, 50);
	}
	
	public void swim(Graphics g) {
		g.setFont(new Font("±¼¸²", Font.BOLD, 15));
		g.drawString("¼ö¿µ", x, y);
	}
	
	public void quack(Graphics g) {
		g.setFont(new Font("±¼¸²", Font.BOLD, 15));
		g.drawString("²Ð²Ð", x+40, y);
	}
};
