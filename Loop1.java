import java.util.*;
class Loop1
{
  public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int i,n,sum=0;
   System.out.print("Enter the number:");
   n=sc.nextInt();
   for(i=0;i<n;i++)
   {
     if(i%2==0)//for odd(i%2!=0)
    {
      System.out.println(i);
      sum=sum+i;
    }
   }
  System.out.println("Sum:"+sum); 
 }
}