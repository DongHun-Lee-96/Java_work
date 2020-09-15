package collection;

public class CollectionTheory {
	
	/*
	 Array: 같은 형의 데이터 타입을 메모리에 저장하는 선형적 자료구조
	 논리적 구조와 물리적 구조가 동일
	 1. fixed length
	 2. index 연산 O(1)
	 3. input/output이 n개에 종속(dependent)허다 O(n)
	 */
	
	/*
	 Linked List: 데이터와 링크로 구성
	 insert/delete에 일반 배열보다 효율적
	 i번째의 요소를 찾는데 n개에 종속적이다
	 */
	
	/*
	 Stack: LIFO, 선형 자료구조
	 넣을때는 push() 꺼낼때는 pop()
	 peek() 스택의 맨 위의 요소를 반환, 제거하지는 않음
	 
	 Queue: FIFO, 선형자료구조
	 넣을때는 enqueue() 꺼낼때는 dequeue
	 
	 둘다 중간에서 자료가 들어가진 않는다
	 */
	
	/*
	 Tree: binary search tree: 자료의 검색
	 자식 노드의 수가 최대 2개
	 자신을 기준이로 left child는 작은수, right child는 큰수, 중복허용X
	 tree가 균형된 트리면 찾는 시간이 log2n이 된다
	 sorting: in-order traverse: 내가 가운데 Left-나-Right, 오름차순 정렬
	 sorting: pre-order traverse
	 sorting: post-order
	 */
	
	/*
	 Hashing: 산술 연산을 이용한 검색방식
	 collision이 발생할 수 있음
	 평균시간복잡도: index = h(key)    O(1) 자료n개에 종속적이지 않음
	 */
	
	/*
	 List 인터페이스: Collection 하위 인터페이스
	 객체를 순서에 따라 저장하고 관리하는데 필요한 메서드가 선언된 인터페이스
	 ArrayList, Vector, LinkedList
	 */

}
