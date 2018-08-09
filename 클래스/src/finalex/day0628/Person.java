package finalex.day0628;

public class Person {
	final String nation = "Korea";//파이널 필드1: 선언시 초기화
	final String ssn;//파이널 필드2: 생성자에 가서 외부값으로 초기화
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
