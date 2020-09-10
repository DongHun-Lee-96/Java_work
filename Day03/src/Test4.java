
public class Test4 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++ ) {
			for(int k=5-i; k>0; k-=1) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println("-----------------------");
		
		for(int i=0; i<5; i++) {
			for(int k=5-i; k<6; k++) {
				System.out.print("*");
				}
			System.out.print("\n");
			}
		System.out.println("----------------------");
		
		for(int i=0; i<5; i++) {
			for(int j=1; j<i+1; j++) {
				System.out.print(" ");
			}
			for(int k=5-i; k>0; k-=1) {
				System.out.print("*");
				}
			System.out.print("\n");
    		}
		
		System.out.println("----------------------");
		
		for(int i=0; i<5; i++) {
			for(int j=4-i; j>0; j-=1) {
				System.out.print(" ");
			}
			for(int k=0; k<(i*2)+1; k++) {
				System.out.print("*");
			}
		System.out.print("\n");
		}
	}//main
};
		
