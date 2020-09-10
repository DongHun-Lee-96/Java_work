
public class Main {
	public static void main(String[] args) {
		Player pobj = null;
		pobj = new Player(6,6,"pobj");	
		pobj.x =300;
		pobj.display();
		
		Player pobj2 = null;
		pobj2 = new Player(6,7,"pobj2");
		pobj2.display();
	}
}
