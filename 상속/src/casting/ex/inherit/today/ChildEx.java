package casting.ex.inherit.today;

public class ChildEx {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		
		Child child = (Child)parent;
		child.field2 = "yyy";
		child.method3();
	}
}
