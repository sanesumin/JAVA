package korean.ex.today;

public class KoreanEX {

	public static void main(String[] args) {
		Korean k1 = new Korean("박자바","011111");
		System.out.println("k1.name:"+k1.name);
		System.out.println("k1.ssn:"+k1.ssn);
		
		Korean k2 = new Korean("김자바","0099393");
		System.out.println("k2.name:"+k2.name);
		System.out.println("k2.ssn:"+k2.ssn);

		Korean k3 = new Korean();
	}

}
