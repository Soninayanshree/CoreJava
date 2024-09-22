class t1 implements Runnable 
{
	public void run()
	{
		System.out.println("Hello Thread!");
	}
	public static void main(String args[])
	{
		t1 obj=new t1();
		Thread tobj=new Thread(obj);
		obj.run();//method call by class out
		tobj.start();//method call by thread obj 
	}
}