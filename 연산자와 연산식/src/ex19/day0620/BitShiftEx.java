package ex19.day0620;

public class BitShiftEx {

	public static void main(String[] args) {
		System.out.println("1<<3="+(1<<3));
		System.out.println("-8>>3="+(-8>>3));
		System.out.println("-8>>>3="+(-8>>>3));
		
		int a = -8 >>> 3;
		String temp = Integer.toBinaryString(a);
		System.out.println("000"+temp);
	}

}
