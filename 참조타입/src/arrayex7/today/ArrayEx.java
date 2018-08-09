package arrayex7.today;

public class ArrayEx {

	public static void main(String[] args) {
		String [] strArray = new String[3];
		strArray[0] = "JAVA";
		strArray[1] = "JAVA";
		strArray[2] = new String("JAVA");
		
		System.out.println(strArray[0]==strArray[1]);//true	
		System.out.println(strArray[1]==strArray[2]);//false
		
		System.out.println(strArray[0].equals(strArray[1]));//true
		System.out.println(strArray[1].equals(strArray[2]));//true

	}

}
