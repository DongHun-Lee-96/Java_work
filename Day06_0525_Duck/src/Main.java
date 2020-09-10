
public class Main {
    public static void main(String[] args){
    	Duck[] darr = new Duck[5]; //정적배열
    	
    	for(int i=0; i<(darr.length); i++) {
    		darr[i] = new Duck();
    	}
    	
    	for(int i=0; i<(darr.length); i++) {
    		if(darr[i]!=null) {
    			darr[i].display();
    		}
    	}
    }

}
