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
		
		Book book = new Book("두잇자바", "은종님");
		System.out.println(book);
		//object.Book@15db9742 재정의 전
		// 두잇자바,은종님 재정의 후 
		
		String str = new String("test");
		System.out.println(str);
		//test
	}
}
