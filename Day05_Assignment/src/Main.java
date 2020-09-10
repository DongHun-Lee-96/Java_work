import java.awt.Frame;
import java.awt.Label;
import java.awt.Color;
import java.awt.TextField;
import java.awt.Panel;
import java.awt.Button;

public class Main {
	public static void main(String[] args) {

     int frameWidth = 500;
     int frameHeight =300;
        
     Frame f = new Frame();
     f.setSize(frameWidth,frameHeight);     
     f.setTitle("Login");
       
     Label lab1,lab2,lab3;
     TextField tf1,tf2;
     Button btn1,btn2;
     Panel p;
       
     lab1 = new Label("로그인 화면");
     lab1.setBounds(10,10,450,42);
     lab1.setAlignment(Label.CENTER);
     lab1.setForeground(new Color(255,255,255));
     lab1.setBackground(new Color(0,100,255));
       
     lab2 = new Label("ID : ");
     lab2.setBounds(40,60,100,35);
     lab2.setAlignment(Label.CENTER);
       
     lab3 = new Label("Password : ");
     lab3.setBounds(40,100,100,35);
     lab3.setAlignment(Label.CENTER);
       
     tf1 = new TextField();
     tf1.setBounds(150, 60, 250, 30);
     tf2 = new TextField();
     tf2.setBounds(150, 100, 250, 30);
       
     p = new Panel();
     p.setLayout(null);
       
     btn1 = new Button("LOG IN");
     btn1.setBounds(235, 180, 100, 35);
     btn1.setForeground(new Color(255,255,255));
     btn1.setBackground(new Color(0,100,255));
     
     btn2 = new Button("취소");
     btn2.setBounds(350, 180, 100, 35);
     btn2.setForeground(new Color(255,255,255));
     btn2.setBackground(new Color(0,100,255));
                   
     p.add(lab1);
     p.add(lab2);
     p.add(lab3);
     p.add(tf1);
     p.add(tf2);
     p.add(btn1);
     p.add(btn2);
       
     f.add(p);
     f.setVisible(true);
     }
 };