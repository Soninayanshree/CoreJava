class demo
{
	void test(int m)
	{
		if(m<0)
		{
			throw new ArithmeticException("Marks cannot be negative");
		}
		else
		{
			System.out.println("Marks Accepted");
		}
	}
	public static void main(String args[])
	{
		demo obj=new demo();
		try
		{
			obj.test(6);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			System.out.println("Enter code");
	}
}