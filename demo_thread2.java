class t1 implements Runnable 
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);	
		}
		//System.out.println("Hello Thread!");
	}
	public static void main(String args[])
	{
		try
		{
			t1 obj=new t1();
		    t1 obj2=new t1();
		    Thread tobj=new Thread(obj);
		    Thread tobj2=new Thread(obj2);
		    tobj.start();
			System.out.println(tobj.isAlive());//for checking active status of thread
		    tobj.sleep(1000);
		    tobj2.start();
			System.out.println(tobj2.isAlive());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}