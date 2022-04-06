package Abst;
abstract class Animal{
	abstract void eat();
	
}
class Herbivores extends Animal{
	void eat() {
		System.out.println(" I am vegetarin");
	}
}
class Carnivores extends Animal{

	void eat() {
		System.out.println(" I am Non-Vegetarin");
	}
	
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal h=new Herbivores();
		Animal c=new Carnivores();
		h.eat();
		c.eat();
	}

}
