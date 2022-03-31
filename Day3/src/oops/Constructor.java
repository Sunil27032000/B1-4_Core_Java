package oops;

public class Constructor {
	String str;
	int a;
	Constructor(String s, int x){
		str=s;
		a=x;
	}
	void display() {
		System.out.println(str+" "+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c=new Constructor("Sunil",2000);
		c.display();

	}

}
