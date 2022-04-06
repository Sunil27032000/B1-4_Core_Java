package Polymorphism;

public class Renault {
	String color;
	int Speed;
	Renault(){
		System.out.println("I bought Renault Triber in 2021");
	}
	Renault(String color,int Speed)
	{
		this.color=color;
		this.Speed=Speed;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Renault r=new Renault();
		Renault r1=new Renault("Mustard Yello",50);
		System.out.println(r1.color+" " +r1.Speed);

	}

}
