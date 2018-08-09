package thisex.dot;

public class Outter {
	Strubg field = "Outter-field";
	
	void method() {
		System.out.println("Outter-field");
	}
	
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
