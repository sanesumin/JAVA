package finalex.day0628;

public class Person {
	final String nation = "Korea";//���̳� �ʵ�1: ����� �ʱ�ȭ
	final String ssn;//���̳� �ʵ�2: �����ڿ� ���� �ܺΰ����� �ʱ�ȭ
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
