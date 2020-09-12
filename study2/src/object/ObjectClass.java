package object;

public class ObjectClass {
	
	/*
	Object는 모든 클래스의 최상위 클래스
	java.lang.Object 클래스
	모든 클래서는 Object클래스의 메서드를 사용하고 재정의 할 수 있지만 final로 선언된 메서드는 재정의 불가
	
	toString() 메서드: 객체의 정보를 String으로 바꿔서 사용할때 많이 씀
	String은 문자열 반환, Integer는 정수 값 반환
    */
	
	/*
	 equals() 메서드: 두 인스턴스의 주소닶을 비교하여 t/f를 반환
	 재정의 하여 두 인스턴스가 논리적으로 동일함의 여부를 반환
	 ex.같은 학번의 학생인 경우 인스턴스들의 주소값은 다르지만 같은학생이니 문제가 생기지 않도록 equals를 재정의함 
	 */
	
	/*
	 hash: 정보를 저장, 검색하기 위해 사용하는 자료구조
	 자료의 특정 값(키 값)에 대해 저장위차를 반환해주는 해시 함수를 사용한다
	 index = hash(key)
	 해시함수는 어떤 정보인가에 따라 다르게 구현이 된다.
	 힙 메모리에 인스턴스가 저장되는 방식이 hash이며 hashcode() 메서드는 인스턴스의 저장 주소를 반환한다
	 */
	
	/*
	객체의 원본을 복제하는데 사용, 원본을 유지해 놓고 복사본을 사용할 때
	기본틀을 두고 복잡한 생성과정을 반복하지 않고 복제
	하지만 객체의 정보가 같은 인스턴스가 또 생성됨으로 정보은닉, 객체보호의 관점에서 위배될 수 있음
	객체의 clone메서드 사용을 허용한다는 의미로 cloneable 인터페이스를 명시해 줌
	 */
	
	
}
