interface i1
{
	void demo();
}
class test implements i1
{
	public void demo()
	{
		System.out.println("Hello!");
	}
	public static void main(String args [])
	{
		test obj=new test();
		obj.demo();
	}
}