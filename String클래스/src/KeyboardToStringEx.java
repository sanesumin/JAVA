import javax.imageio.IIOException;

public class KeyboardToStringEx{
	public static void main(String[] arg) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.println("�Է�:");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes,0,readByteNo-2);
		System.out.println(str);
	}
}