import java.util.*;

public class Duck {
	//���Ͻ�����
    private int x;
    private int y;
    private String myshape = "Duck";
    
    public Duck() {
    	Random rnd = new Random();
    	x = rnd.nextInt(800); //0~799
    	y = rnd.nextInt(600); //0~599
    }
    
    public Duck(int x, int y) {//�Ű����� == ��������
    	this.x = x;
    	this.y = y;
    }

    public void display(){
    	System.out.println(this.myshape + ":"+x+y);
    }

    public void walk(){
    	System.out.println(":�в�"+ ":"+x+y);
    }

    public void makeNoise(){
    	System.out.println(":�ɾ��"+ ":"+x+y);
    }

}
