package Multithreading;
class Thread2 extends Thread
{
    public void run()
    {
        try
        {
           Thread.sleep(1000);
            System.out.println("work");
        }
        catch (InterruptedException e) 
        {
            System.out.println("Exception handled "+e);
        }
        System.out.println("thread is running");
    }
}
public class Example14{
    public static void main (String args[]) 
    {
        Thread2 t1=new Thread2();
        t1.start();
        t1.interrupt();
	}

}
