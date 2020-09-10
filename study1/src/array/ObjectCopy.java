package array;

public class ObjectCopy {
	
	public static void main(String[] args) {
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("�¹���1", "������");
		bookArray1[1] = new Book("�¹���2", "������");
		bookArray1[2] = new Book("�¹���3", "������");
		
		//���� ���縦 ���� �ٸ� �ּҸ� ������ �ν��Ͻ� ����
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		//��������
		//System.arraycopy(bookArray1, 0, bookArray2, 0, 3); 
		
		//��������
		for(int i=0; i<bookArray1.length; i++) {
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
		}
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("����");
		bookArray1[0].setAuthor("�ڿϼ�");
		
		System.out.println("----------arr1");
		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("----------arr2");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo(); //���� ����Ȱ��� �ƴϰ� �ּҰ� ����Ȱ� ��������
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