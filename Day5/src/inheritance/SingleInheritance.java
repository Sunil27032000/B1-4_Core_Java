package inheritance;

class Parent{
	void print() {
		System.out.println("Hello ,This is Sunil Kumar ");
	}
}
class Child extends Parent{
	void Displaly() {
		System.out.println("Single Inheritance");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.Displaly();
		c.print();
	}

}
