package lesson;

public class Ex2 extends Thread
{
	@Override
	public void run()
	{
		try
		{
		for(int i=0;i<10;i++){
			Thread.sleep(100);
			System.out.println("Hello another person");
		}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
}
