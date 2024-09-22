interface shape
{
	void area(int a,int b);
}
class test implements shape
{
	public void area(int a,int b)
	{
		System.out.println("Area of rectangle:"+(a*b));
	}
	public void area(double x,int y)
	{
		System.out.println("Area of parallelogram:"+(x*y));
	}
	public void area(double l,double h)
	{
		System.out.println("Area of triangle:"+(0.5*l*h));
	}
	public void area(int s)
	{
		System.out.println("Area of square:"+(s*s));
	}
	public static void main(String args [])
	{
		test obj=new test();
		obj.area(4.5,6.7);
	}
}
