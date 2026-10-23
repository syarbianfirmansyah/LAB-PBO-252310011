package praktikum;

public class Dog {
	String breed;
	int age;
	String color;
	
	void barking() {
		System.out.println("Woof..Woof..");
	}
	
	void hungry() {
		System.out.println("Woof..it's time for lunch");
	}
	
	void sleeping() {
		System.out.println("Snoring..zzz.zzz");
	}
	
	void puppyName(String name) {
		System.out.println("My puppy name is;"+name);
		
		public class Appmain {
			static Dog mydog = new Dog();
			
			
			public static void main(String[]args) {
				mydog.hungry();
				String name ="Tomi";
				mydog.puppyName(name);
			}
	}
}