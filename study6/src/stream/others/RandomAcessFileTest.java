package stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAcessFileTest {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100); //4 byte
		System.out.println(rf.getFilePointer());
		
		rf.writeDouble(3.14); //8 byte
		System.out.println(rf.getFilePointer());
		
		rf.writeUTF("안녕하세요"); //3 * 5 + 2(null character) = 17
		System.out.println(rf.getFilePointer());
		
		//파일 포인터 처음으로 이동
		rf.seek(0);
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}
}