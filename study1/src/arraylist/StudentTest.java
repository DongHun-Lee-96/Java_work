package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("korean", 100);
		studentLee.addSubject("math", 90);
		
		studentLee.showStudentInfo();
		
		System.out.println("--------");
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("korean", 80);
		studentKim.addSubject("math", 100);
		studentKim.addSubject("english", 95);
		
		studentKim.showStudentInfo();

	}

}
