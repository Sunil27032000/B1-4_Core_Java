package inheritance;

class R6{
	void print() {
		System.out.println("I like R6");
	}
	void print1() {
		System.out.println("I Drive R6");
	}
}
 class R3 extends R6
 {
	 void display() {
		 System.out.println("I like R3");
	 }
 }
 class R15 extends R3
 {
	 void display() {
		 System.out.println("I like R15");
	 }

	}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		R15 r=new R15();
		r.display();
		r.print();
		r.print1();
		

	}

}
