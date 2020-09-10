import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			FileInputStream fio = new FileInputStream("test.txt");
			
			if(fio!=null) {
				int ch;
				while((ch = fio.read()) != -1) {
					System.out.print((char)ch);
				}
			}//if 
			
		} catch (FileNotFoundException e) {
			System.out.println("�ش��ο� ������ ����");
		} catch (IOException e) {
			System.out.println("���̻� ���� ������ ����");
		}
	}
};
