abstract class shape
{
	abstract void area(int a,int b);
}
class tri extends shape//triangle
{
	public void area(int a,int b)
	{
		System.out.println("Area of triangle:"+(0.5*a*b));
	}
}
class rho extends tri//rhombus
{
	public void area(int l,int h)
	{
		super.area(6,6);
		System.out.println("Area of rhombus:"+(l*h));
	}
}
class para extends rho//parallelogram
{
	public void area(int b,int h)
	{
		super.area(3,4);
		System.out.println("Area of parallelogram:"+(b*h));
	}
}

class rect extends para//reactangle
{
	public void area(int l,int b)
	{
		super.area(6,2);
		System.out.println("Area of reactangle:"+(l*b));
	}
	public static void main(String args[])
	{
		rect obj=new rect();
		obj.area(2,3);
	}
}