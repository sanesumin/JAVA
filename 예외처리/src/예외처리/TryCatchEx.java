package ����ó��;

public class TryCatchEx {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+"+ data2 + "= "+result);
		}catch(ArrayIndexOutOfBoundsException |NumberFormatException e) {
			System.out.println("���� �Ű����� ���� �����ϰų� ���ڷ� ��ȯ�Ҽ� �����ϴ�.");
			System.out.println(e.getMessage());
			//System.out.println("[���� ���]");
			//System.out.println("java"+"ArrayIndexOutOfBoundsExceptionEx");
			//System.out.println("��1 ��2");
		}catch(Exception e) {
			System.out.println("���ڷ� ��ȯ�Ҽ� �����ϴ�.");
		}finally{
			System.out.println("�ٽ� �����ϼ���.");
		}
	}

}
