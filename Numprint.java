import java.util.*;
class Numprint
{
 public static void main(String args [])
 {
  Scanner sc=new Scanner(System.in);
  int i,j,k,n,m;
  System.out.println("Enter the limit for loop:");
  n=sc.nextInt();
  for(i=1;i<n;i++)//for row
  {
    for(j=n;j>i;j--)//for space
    {
     System.out.print("#");
    }
    for(k=1;k<=i;k++)//condition for increment
    {
     System.out.print(k);
    }
     for(m=i+1;m>=i;m--)//for numprinting in ascending and decending
    {
     System.out.print(m);
    }
     System.out.println(" ");
  }
 }
}