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
			System.out.println("해당경로에 파일이 없음");
		} catch (IOException e) {
			System.out.println("더이상 읽을 내용이 없음");
		}
	}
};
