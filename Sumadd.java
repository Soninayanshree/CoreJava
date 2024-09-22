import java.util.*;
class Sumadd
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n,a,sum=0;
    float avg;
    System.out.print("Enter total no digit required:");
    n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
     System.out.println("Enter the number:");
     a=sc.nextInt();
     sum=sum+a;
     }
     avg=sum/n;
    System.out.println("Sum:"+sum);
    System.out.println("Average:"+avg);
  }
}