package Multithreading;

public class Example1 extends Thread {
	public void run() {
		System.out.println("Threads going to Run");
		
	}
	public static void main(String[] args) {
		Example1 s=new Example1();
		s.start();
	}

}
