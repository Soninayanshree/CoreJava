import java.util.*;
class Pyramid2
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int i,j,k,n,m;
		System.out.println("Enter the size :");
		n=sc.nextInt();
		for(i=1;i<n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++)//for increment 
			{
				System.out.print(k);
			}
			for(m=i-1;m>1;m--)//for decrement printing of num
			{
				System.out.print(m);
			}
			System.out.println(" ");
		}
	}
}