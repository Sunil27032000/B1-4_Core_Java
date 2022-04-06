package Polymorphism;

class Base {
	void method1() {
		System.out.println("Parent1");
	}}
class Derived extends Base{
	void method1() {
		System.out.println("Child1");
	}}
class Parent{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b=new Base();
		b.method1();
		Derived d=new Derived();
		d.method1();
	}

}
