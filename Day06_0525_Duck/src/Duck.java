import java.util.*;

public class Duck {
	//인턴스변수
    private int x;
    private int y;
    private String myshape = "Duck";
    
    public Duck() {
    	Random rnd = new Random();
    	x = rnd.nextInt(800); //0~799
    	y = rnd.nextInt(600); //0~599
    }
    
    public Duck(int x, int y) {//매개변수 == 지역변수
    	this.x = x;
    	this.y = y;
    }

    public void display(){
    	System.out.println(this.myshape + ":"+x+y);
    }

    public void walk(){
    	System.out.println(":꽥꽥"+ ":"+x+y);
    }

    public void makeNoise(){
    	System.out.println(":걸어요"+ ":"+x+y);
    }

}
