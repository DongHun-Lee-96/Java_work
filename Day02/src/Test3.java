
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
				System.out.println("���");
				break; // if������ break�� ������ ���� �ʾƼ� if�� �ȿ� ���� break�� switch�� �ش��� �Ǽ� �۵�
			}          // �׷��Ƿ� if�� �ۿ��ִ� break�� �Ȱ��� ȿ���� ����
			//break; // for, while, switch
		case 2:
			System.out.println("2.......");
			break;
		default:
			System.out.println("default.......");
		}
	} //main
};
