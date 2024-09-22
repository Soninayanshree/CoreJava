class x
{
	void disp()
	{
		System.out.println("Hello!");
	}
}
class y extends x
{
	void show()
	{
		System.out.println("Namaste!");
	}
}
class z extends y
{
	void output()
	{
		System.out.println("Hola!");
	}
	public static void main(String args[])
	{
		z obj=new z();
		obj.disp();
		obj.show();
		obj.output();
	}
}