package Stringex.today;

public class StringEx {

	public static void main(String[] args) {
		String str1 = "�ڼ���";
		String str2 = "�ڼ���";
		
		//System.out.println(str1==str2);//true,�ּҺ�
		//System.out.println(str2==str3);//false
		//System.out.println(str1.equals(str2));//true,�����
		//System.out.println(str2.equals(str3));//true
		
		if(str1==str2) {//������ ����
			System.out.println("str1�� str2�� ������ ����");
		}else {
			System.out.println("str1�� str2�� ������ �ٸ�");
		}
		
		if(str1.equals(str2)) {//���ڿ��� ����
			System.out.println("str1�� str2�� ���ڿ��� ����");
		}
		
		String str3 = new String("�ڼ���");
		String str4 = new String("�ڼ���");
		

		if(str3==str4) {//������ �ٸ�
			System.out.println("str1�� str2�� ������ ����");
		}else {
			System.out.println("str1�� str2�� ������ �ٸ�");
		}
		
		if(str3.equals(str4)) {//���ڿ��� ����
			System.out.println("str1�� str2�� ���ڿ��� ����");
		}
		
	}

}
