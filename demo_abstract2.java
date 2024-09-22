abstract class c1
{
	 abstract void m1();
	 abstract void m2();
}
class c2 extends c1
{
	public void m1()
	{
		System.out.println("Hello!");	
	}
	public void m2()
	{
		System.out.println("Namaste!");	
	}
	public static void main(String args [])
	{
		c2 obj=new c2();
		obj.m1();
		obj.m2();
	}
}