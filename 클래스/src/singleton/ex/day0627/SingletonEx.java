package singleton.ex.day0627;

public class SingletonEx {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1==obj2) {
			System.out.println("같은 Singleton객체 입니다.");
		}else {
			System.out.println("다른 Singleton객체 입니다.");
		}

	}

}
