package finalex.day0628;

public class PersonEx {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234566","���");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.name = "usa"; final�ʵ�� �������� �Ұ� �ʱ�ȭ�� ����
		//p1.ssn = "6543321-5848371";
		p1.name = "������";
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

	}

}
