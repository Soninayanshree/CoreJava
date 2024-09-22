import java.util.*;
class demo
{
public static void main(String args[])
{
	int x=5,y=0,z=0;
	Scanner sc=new Scanner(System.in);
	try
	{
		z=x/y;
		System.out.println(z);
	}
	catch(Exception e)
	{
		System.out.println("You cannot divide by zero");
		System.out.println("Enter the value of Y:");
		y=sc.nextInt();
		z=x/y;
		System.out.println(z);
	}
}
}