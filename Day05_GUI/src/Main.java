import java.awt.Frame; // �� �ҹ��ڴ� ���, �� �빮�ڴ� Ŭ���� ��
import java.awt.Button;
import java.awt.Color;

public class Main {
	public static void main(String[] args) {
		
		int frameWidth = 800;
		int frameHeight = 600;
		
		Button btn = new Button("Change Color");
		
		Frame f = new Frame();
		f.add("North", btn);
		
		Color bgColor = new Color(130,0,255);
		
		f.setBackground(bgColor);
		f.setSize(frameWidth, frameHeight);
		f.setVisible(true);
	}
};
