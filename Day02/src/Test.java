
public class Test {
	public static void main(String[] args) {
		// 5명의 국어점수
		int x1 = 78;
		int x2 = 25;
		int x3 = 92;
		int x4 = 92;
		int x5 = 88;
		System.out.println("x1="+x1);
		
		int[] kor = {78,25,92,92,88}; //반드시 같은타입
		System.out.println("kor="+kor);
		System.out.println("kor[0]="+kor[0]);
		System.out.println("kor[1]="+kor[1]);
		System.out.println("kor[2]="+kor[2]);
		System.out.println("kor[3]="+kor[3]);
		System.out.println("kor[4]="+kor[4]);
		
		char[] carr = {'A','B','C'};  //참조형
		System.out.println("carr[0]="+carr[0]);
		System.out.println("carr[1]="+carr[1]);
		System.out.println("carr[2]="+carr[2]);
		
		int k = 100;
		long l = k; //암묵적 형변환
		int c = 'A';
		
		double d = 5;
		
		System.out.println("l="+l);
		System.out.println("c="+c);
		
		int i = (int)5.12; // cast operator		
		
		System.out.println(3+4+"num=");
		
		
	}//main
	
};
