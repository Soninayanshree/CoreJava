interface i1
{
	void demo();
	int i=10;
}
interface i2
{
	void demo2();
	int i=20;
}
class test implements i1,i2//just like a multiple inheritance
{
	public void demo()
	{
		System.out.println("Hello!");
	}
	public void demo2()
	{
		System.out.println("Namaste!");
	}
	public static void main(String args [])
	{
		test obj=new test();
		obj.demo();
		obj.demo2();
		System.out.println(i2.i);
	}
}