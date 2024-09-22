class x
{
	void disp()
  {
	  System.out.print("Hello!");
  }
}
class y extends x
{
	void disp()
	{
	  System.out.print("Namaste!");
	}
	public static void main(String args[])
	{
		y obj=new y();
		obj.disp();
	}
}