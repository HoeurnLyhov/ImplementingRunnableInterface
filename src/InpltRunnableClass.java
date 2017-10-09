
public class InpltRunnableClass implements Runnable
{
	@Override
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello from implRunnableClass");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) 
	{
		InpltRunnableClass irc=new InpltRunnableClass();
		Thread t1=new Thread(irc);
		//irc.start();
		
		AnotherClass ac=new AnotherClass();
		Thread t2=new Thread(ac);
		
		//t1.start();
		//t2.start();
		//private definition
		//un normal class
		Thread t3=new Thread(new Runnable(){
			
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					try
					{
						Thread.sleep(1000);
						System.out.println("Hello from Thread 3");
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
		});
		
		t1.start();
		t2.start();
		t3.start();

	}

	

}
