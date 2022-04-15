package Multithreading;

public class Example10 {
	public synchronized void display ()
    {
                 System.out.println("Current thread "+ Thread.currentThread().getName());
                 for (int i = 0; i < 5 ; i++)
                 {
               	  System.out.println(Thread.currentThread ().getName () +"i - " + i);
                              try
                               {
                                           Thread.sleep (50) ;
                               }
                              catch (InterruptedException e)
                               {
                                            e.printStackTrace ();
                               }
                 }
				class Valueof implements Runnable{
               	    Thread t;
               	    Example10 val;
               	    Valueof (Example10 val)
               	    {
               	        this.val = val; 
               	        t = new Thread (this);
               	        t.start();
               	    }
               	    public void run()
               	    {
               	        val.display();
               	    }
					class Main{
						
						public void main(String[] args) {
               	    	Example10 objl= new Example10();
               	    	Example10 obj2= new Example10();
               	        new Valueof(objl);
               	        new Valueof (obj2);
               	    }
               	}
               	    }
	}

}
