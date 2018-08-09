package middle.ex1.today;

public class SystemEnvEx {

	public static void main(String[] args) {
		String javaPath = System.getenv("JAVA_PATH");
		System.out.println("JAVA_PATH"+javaPath);

	}

}
