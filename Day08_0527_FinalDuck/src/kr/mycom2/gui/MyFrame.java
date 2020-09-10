package kr.mycom2.gui;

import java.awt.Frame;
import java.awt.Graphics;

import kr.mycom2.duck.DuckManager;

public class MyFrame extends Frame{
	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;
	
	DuckManager mgr = new DuckManager();
	
	public MyFrame() {
		super();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		if(mgr != null) {
			mgr.displayAllDucks(g);
			mgr.swimAllDucks(g);
			mgr.quackAllDucks(g);
			mgr.flyAllDucks(g);
		}
	}
};
