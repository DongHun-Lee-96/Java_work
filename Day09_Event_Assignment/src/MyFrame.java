import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class MyFrame extends Frame{
	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;

	private ArrayList<MyShape> list = new ArrayList();
	
	public MyFrame() {
		super(); // new Frame();
		
		this.addMouseListener(new MyInnerHandler());
		
		for(int i=0; i<20; i++) {
			   list.add(new MyShape());
			  }
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		for(int i=0;i<list.size();i++) {
			list.get(i).display(g);
		}//for
	}	
	
	class MyInnerHandler extends MyHandler{
		@Override
		public void mousePressed(MouseEvent e) {
			int cx = e.getX();
			int cy = e.getY();
			
			 if(list!=null) {
				    list.clear();
				    repaint();
				   }
			}
		}//mousepress
};
