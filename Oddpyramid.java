import java.util.*;
class Oddpyramid
{
  public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in);
    int i,j,k,n;
    System.out.println("Enter value of n:");
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
      for(j=n;j>i;j--)
      {
        System.out.print(" ");
      }
      for(k=1;k<=i;k++)
      {
       if(k=2*i-1)
       {
         System.out.print("*"+" ");
       }
      }
      System.out.println(" ");
    }
  
  }
}