package student.today;

public class StudentEx {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 ������ Student ��ü�� �����մϴ�.");
		
		
		Student s2 = new Student();
		System.out.println("s2 ������ Student �Ǵٸ� ��ü�� �����մϴ�.");
		
		if(s1==s2) {
			System.out.println("�ּҰ� ����.");
		}else {
			System.out.println("�ּҰ� �ٸ���.");
		}

	}

}
