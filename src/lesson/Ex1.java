package lesson;

public class Ex1 extends Thread
{
	@Override
	public void run()
	{
		
		
			try {
				for(int i=0;i<10;i++)
				{
				Thread.sleep(100);
				System.out.println("Hello jett");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	public static void main(String[] args) 
	{
		Ex1 a=new Ex1();
		Thread t1=new Thread(a);
		Ex2 b=new Ex2();
		Thread t2=new Thread(b);
		try
		{
			t1.start();
			t1.start();
		}
		catch(IllegalThreadStateException e)
		{
			e.printStackTrace();
		}
		t2.start();
		
	}
}
