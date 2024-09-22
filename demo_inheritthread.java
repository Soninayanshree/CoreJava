class t2 extends Thread
{
	public void run()
	{
		System.out.println("Hello Thread!");
	}
	public static void main(String args[])
	{
		t2 obj=new t2();
		obj.start();
		Thread tobj=new Thread(obj);
		tobj.start();
		
	}
}