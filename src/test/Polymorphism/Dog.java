package test.Polymorphism;

public class Dog extends Animal{
 
	@Override
	public void makeSound() {
		System.out.println("I sound like a Bow bow...");
	}
	
	@Override
	public void walk() {
		System.out.println("I walk like with four legs");
	}
}
