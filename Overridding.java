package Tasks;
	class Animal { 
		void sound() { 
		System.out.println("Animal>>sound"); 
		} 
		} 
	class Dog extends Animal { 
		void sound() { 
		System.out.println("Dog>> barks"); 
		} 
		} 
	class Cat extends Animal { 
		void sound() { 
		System.out.println("Cat >>meows"); 
		} 
		} 
	public class Overridding { 
		public static void main(String[] args) { 
		Animal obj = new Dog();
		Animal obj2=new Cat();
		//Dog() obj=new Dog();
		obj.sound();
		obj2.sound();
		}
		}
