package finalex.day0628;

public class PersonEx {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234566","계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.name = "usa"; final필드는 값수정이 불가 초기화만 가능
		//p1.ssn = "6543321-5848371";
		p1.name = "강감찬";
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

	}

}
