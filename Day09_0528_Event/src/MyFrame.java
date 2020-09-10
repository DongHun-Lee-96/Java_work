
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class MyFrame extends Frame{
	
	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;
	
	private ArrayList<MyShape> list = new ArrayList(); //dynamic array
	
	//Button btn = new Button("종료하기");
	
	public MyFrame() {
		super(); // new Frame();
		
		this.addMouseListener(new MyInnerHandler());
		
		//this.add(btn, BorderLayout.NORTH);
	    //btn.addActionListener(new MyHandler());
		
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		for(int i=0; i<list.size(); i++) {
			list.get(i).display(g);
		}
	}
	
	class MyInnerHandler extends MyHandler {
		@Override
		public void mousePressed(MouseEvent e) {
			if(list != null) {
				list.add(new MyShape());
				repaint(); //repaint => update => paint
			}
		}
	}
	
	/*
	 ------Event Handler : inner class
	class MyHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			MyFrame.this.dispose();
		}
		
	};
	*/
};
