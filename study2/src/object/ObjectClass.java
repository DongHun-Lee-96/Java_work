package object;

public class ObjectClass {
	
	/*
	Object�� ��� Ŭ������ �ֻ��� Ŭ����
	java.lang.Object Ŭ����
	��� Ŭ������ ObjectŬ������ �޼��带 ����ϰ� ������ �� �� ������ final�� ����� �޼���� ������ �Ұ�
	
	toString() �޼���: ��ü�� ������ String���� �ٲ㼭 ����Ҷ� ���� ��
	String�� ���ڿ� ��ȯ, Integer�� ���� �� ��ȯ
    */
	
	/*
	 equals() �޼���: �� �ν��Ͻ��� �ּ҈��� ���Ͽ� t/f�� ��ȯ
	 ������ �Ͽ� �� �ν��Ͻ��� ���������� �������� ���θ� ��ȯ
	 ex.���� �й��� �л��� ��� �ν��Ͻ����� �ּҰ��� �ٸ����� �����л��̴� ������ ������ �ʵ��� equals�� �������� 
	 */
	
	/*
	 hash: ������ ����, �˻��ϱ� ���� ����ϴ� �ڷᱸ��
	 �ڷ��� Ư�� ��(Ű ��)�� ���� ���������� ��ȯ���ִ� �ؽ� �Լ��� ����Ѵ�
	 index = hash(key)
	 �ؽ��Լ��� � �����ΰ��� ���� �ٸ��� ������ �ȴ�.
	 �� �޸𸮿� �ν��Ͻ��� ����Ǵ� ����� hash�̸� hashcode() �޼���� �ν��Ͻ��� ���� �ּҸ� ��ȯ�Ѵ�
	 */
	
	/*
	��ü�� ������ �����ϴµ� ���, ������ ������ ���� ���纻�� ����� ��
	�⺻Ʋ�� �ΰ� ������ ���������� �ݺ����� �ʰ� ����
	������ ��ü�� ������ ���� �ν��Ͻ��� �� ���������� ��������, ��ü��ȣ�� �������� ����� �� ����
	��ü�� clone�޼��� ����� ����Ѵٴ� �ǹ̷� cloneable �������̽��� ������ ��
	 */
	
	/*
	 String Ŭ����
	 String�� �����ϴ� �ΰ��� ���
	 String str1 = new String ("abc") //�������� �Ű������� ���ڿ� ���� , ���޸𸮿� ����
	 String str2 = "test" //���ڿ������ ����Ű�¹��, ���Ǯ�� ����
	 �ѹ� ������ String���� �Һ�
	 */
	
	/*
	 StringBuidler, StringBuffer: ���������� �������� char[]�迭�� ������ �ִ� Ŭ����
	 ���ڿ��� ������ �����ϰų� ������ �� ����ϸ� ����, ���� �迭�� ���� ������ garbage�� ������ ����
	 StringBuffer�� ��Ƽ������ ���α׷��ֿ��� ����ȭ�� ����
	 ���� �����忡���� StringBuilder�� ����, toString()�޼���� String��ȯ
	 */
	
	/*
	 WrapperŬ����: �⺻ �ڷ����� ���� Ŭ����
	 autoboxing�� unboxing: integer�� ��ü�̰� int�� 4����Ʈ �⺻ �ڷ����ε� 
	 �ΰ��� �ڷḦ ���� �����Ҷ� �ڵ����� ��ȯ�� �Ͼ
	 */
	
	/*
	 Class Ŭ����: �ڹ��� ��� Ŭ������ �������̽��� ������ �� class���Ϸ� ������
	 class���Ͽ��� ��ü�� ����(�������, �޼ҵ�, ������ ��)�� ���ԵǾ�����
	 classŬ������ �����ϵ� class���Ͽ��� ��ü�� ������ ������ �� ����
	 reflection ���α׷���: ClassŬ���� �̿��Ͽ� Ŭ������ ������ �������� Ȱ���ϸ� �ν��Ͻ��� �����ϰ�
	 �޼��带 ȣ���ϴ� ���� ���α׷��� ���
	 ���ø޸𸮿� ��ü�� ��� ��ü�� ������Ÿ���� ���� �� �� ���� ��� ��ü �������� �̿��Ͽ� ���α׷��� ����
	
	 ���� �ε��̶�? : ������ �ÿ� ������ Ÿ���� ��� binding�Ǿ� �ڷ����� �ε��Ǵ°�(static loading)��
	 �ƴ϶� �����߿� ������ Ÿ���� �˰� binding�Ǵ� ���
	 */
	
	
}