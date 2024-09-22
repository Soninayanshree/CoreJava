class demo
{
	public static void main(String args [])
	{
		try
		{
			int x=5;
			int y=0;
			int z=x/y;
			System.out.println(z);
		}
		catch(Exception e)
		{
			//System.out.println(e);//by system
			System.out.println("You cannot didvide it by zero");//by programmer
			
		}
		System.out.println("Hello Java");
	}
}