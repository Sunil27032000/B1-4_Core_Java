
public class car {
	String str;
	car(String s){
		str=s;
	}

	void display() {
		System.out.println(str+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1=new car("Audi");
		car c2=new car("Bmw");
		car c3=new car("Mercedes");
		c1.display();
		c2.display();
		c3.display();
	}

}
