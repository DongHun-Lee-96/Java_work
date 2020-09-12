package object;

class Student {
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(studentID == std.studentID) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	public int hashCode() {
		return studentID;
	}
}

public class EqualsHashCodeTest {
	
	public static void main(String[] args) {
		
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2); //물리적인 상태, 같은주소?
		System.out.println(str1.equals(str2)); //문자열이 같은지, 논리적인 상태
		
		System.out.println("=========");
		
		Student std1 = new Student(10001, "park");
		Student std2 = new Student(10001, "park");
		
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));
		
		System.out.println("====hash=======");

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode()); 
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());//10진수값 반환
		
		
		
	}

}
