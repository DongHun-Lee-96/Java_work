package kr.mycom.duck;

import java.awt.Graphics;
import java.util.Random;

public class DuckManager {
	private Duck[] arr = new Duck[10];
	
	public DuckManager() {
			makeDucks();
			}

	private void makeDucks() {
		Random rnd = new Random();
		int type = 0;
		
		for(int i=0; i<arr.length; i++) {
			type = rnd.nextInt(2);
			
			switch (type) {
			case 0:
				arr[i] = new MallardDuck();
				break;
			case 1:
				arr[i] = new RedDuck();
				break;
			}
		}
	}
			
	public void displayAllDucks (Graphics g) {
		if(arr!=null) {
			for(int i=0; i<arr.length; i++) {
				if(arr[i] != null) {
					arr[i].display(g);
					}
				}
			}
	}
	public void swimAllDucks (Graphics g) {
		if(arr!=null) {
			for(int i=0; i<arr.length; i++) {
				if(arr[i] != null) {
					arr[i].swim(g);
					}
				}
		}
	}
	public void quackDucks(Graphics g) {
		if(arr!=null) {
			for(int i=0; i<arr.length; i++) {
				if(arr[i] != null) {
					arr[i].quack(g);
					}
				}
		}
	}
};
