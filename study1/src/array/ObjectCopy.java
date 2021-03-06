package array;

public class ObjectCopy {
	
	public static void main(String[] args) {
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥1", "조정래");
		bookArray1[1] = new Book("태백산맥2", "조정래");
		bookArray1[2] = new Book("태백산맥3", "조정래");
		
		//깊은 복사를 위해 다른 주소를 가지는 인스턴스 생성
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		//얕은복사
		//System.arraycopy(bookArray1, 0, bookArray2, 0, 3); 
		
		//깊은복사
		for(int i=0; i<bookArray1.length; i++) {
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
		}
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("----------arr1");
		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("----------arr2");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo(); //값이 복사된것이 아니고 주소가 복사된것 얕은복사
		}
		
		//enhanced for loop
		String[] strArr = {"java", "android", "c"};
		
		for(String s : strArr) {
			System.out.println(s);
		}
		
		int[] arr = {1,2,3,4,5};
		for(int num : arr) {
			System.out.println(num);
		}
		
	}
}
