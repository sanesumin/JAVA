package 예외처리;

public class ClassCast {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
}
	class Animal {
		
	}
	
	class Dog extends Animal{
		
	}
