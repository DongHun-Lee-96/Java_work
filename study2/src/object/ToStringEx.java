package object;

class Book{
	
	String title;
	String author;
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + "," + author;
	}
}

public class ToStringEx {
	
	public static void main(String[] args) {
		
		Book book = new Book("�����ڹ�", "������");
		System.out.println(book);
		//object.Book@15db9742 ������ ��
		// �����ڹ�,������ ������ �� 
		
		String str = new String("test");
		System.out.println(str);
		//test
	}
}
