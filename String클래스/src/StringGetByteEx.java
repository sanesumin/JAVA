import java.io.UnsupportedEncodingException;

public class StringGetByteEx {

	public static void main(String[] args) {
		String str = "�ȳ��ϼ���";
		
		byte[ ] bytes1 = str.getBytes();
		System.out.println("byte1.length:"+bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("byte1->String:"+str1);
		
		try {
			byte[ ] bytes2 = str.getBytes("EUC-KR"	);
			System.out.println("byte2.length:"+bytes2.length);
			String str2 = new String(bytes2,"EUC-KR");
			System.out.println("byte2->String:"+str2);
			
			byte[ ] byte3 = str.getBytes("UTF-8");
			System.out.println("byte3.length:"+byte3.length);
			String str3 = new String(byte3,"UTF-8");
			System.out.println("byte3->String:"+str3);
			
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

}
