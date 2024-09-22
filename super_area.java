class demo_overload
{
     void area(int a)
    {
       System.out.println("Area of square:"+(a*a));
	}
	 void area(int a,int b)
    {
       System.out.println("Area of rectangle:"+(a*b));
	}
	public static void main(String args[])
	{
		demo_overload obj=new demo_overload();
		obj.area(2,3);
		obj.area(5);
	}
}