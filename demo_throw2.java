class demo2
{
	void test(int m)throws ArithmeticException
	{
		if(m<0)
		{
			throw new ArithmeticException("Error");
		}
		else
		{
			System.out.println("Marks Accepted");
		}
	}
	public static void main(String args[])
	{
		demo2 obj=new demo2();
		try
		{
			obj.test(-5);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
			System.out.println("Enter code");
	}
}