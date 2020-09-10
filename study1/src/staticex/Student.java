package staticex;

public class Student {
	
	static int serialNum = 10000;
	
	int studentID;
	String StudentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

}
