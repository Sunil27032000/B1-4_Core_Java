package Multithreading;

public class Example9 {
	class Main extends Example9{
		public void run ()
		{
		    for (int i=1;i<=3;i++)
		    {
		        System.out.println ("doing task "+i);
		    }
		}
		}

		public class Main1{
		public final Example9 t1 = null;

		public void main(String args[])throws InterruptedException
		{
		    Example9 t1=new Example9 ();
		    t1.start();
		    System.out.println("is thread interrupted"+t1.isInterrupted());
		    t1.interrupt();
		    System.out.println("is thread interrupted"+t1.isInterrupted());
	}
	}

		public void start() {
			
		}

		public String isInterrupted() {
			return null;
		}

		public void interrupt() {
	}

}
