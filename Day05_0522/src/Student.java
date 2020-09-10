public class Student {
	//인스턴스
    private int id;
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int total;
    
    //constructor
    public Student() {
    	
    }
    //constructor, method overloading
    public Student(int i, String n, int k, int e, int m){
    	id = i;
    	name = n;
    	kor = k;
    	eng = e;
    	math = m;
    }
    
    public void add(){
    	total = kor + eng + math;
    }

    public void add(int a) {
    	
    } // 이것도 에러가 안남
    
    public void display(){
    	System.out.println(name + " >> 총점=" + total);
    }
}
