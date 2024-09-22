abstract class c1
{
	 void m1()
	 {
		System.out.println("I am in abstract class"); 
	 }
}
class c2 extends c1
{
	public static void main(String args [])
	{
		c2 obj=new c2();
		obj.m1();//no need to call the function it will work 
	}
}