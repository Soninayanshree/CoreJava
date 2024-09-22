class t1 implements Runnable 
{
    static int amount=0;
	public void run()
	{
	    amount++;
		System.out.println(amount);
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
			amount++;
			System.out.println(amount);
		    tobj.sleep(2000);
		    tobj2.start();
			System.out.println(amount);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}