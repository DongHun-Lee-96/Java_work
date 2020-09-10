package array;

public class TwoDimensionArray {
	
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{4,5,6}};
		
		System.out.println(arr.length);//행의 길이
		System.out.println(arr[0].length); //열의 길이		
		System.out.println(arr[1].length);
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		
		
    	char[][] alphabets = new char[13][2];
    	
		int j = 64;
		for(int i = 0; i<alphabets.length; i++) {
			for(int k=0; k<alphabets[i].length; k++) {
				++j;
				alphabets[i][k] = (char)(j);
				System.out.println(alphabets[i][k]);
			}
		}
	}

}
