package Polymorphism;

public class OverLoading1 {

	void assign(int a,int b) {
		System.out.println("Area of Square:"+(a*b));
	}
	void assign(float a,float b) {
		System.out.println("Area of Square:"+(float)(a*b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoading o=new OverLoading();
		o.assign(5,10);
		o.assign(10f, 20f);


	}

}
