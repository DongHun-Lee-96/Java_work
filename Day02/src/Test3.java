
public class Test3 {
	public static void main(String[] args) {
		int i = 1;
		
		switch (i) {
		case 0:
			System.out.println("0.......");
			break;
		case 1:
			System.out.println("1.......");
			if(i>0) {
				System.out.println("양수");
				break; // if문에는 break가 적용이 되지 않아서 if문 안에 넣은 break도 switch로 해당이 되서 작동
			}          // 그러므로 if문 밖에있는 break랑 똑같은 효과를 낸다
			//break; // for, while, switch
		case 2:
			System.out.println("2.......");
			break;
		default:
			System.out.println("default.......");
		}
	} //main
};
