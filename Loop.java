import java.util.*;
class Loop
{
  public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int i,n,F=1;
   System.out.print("Enter the number:");
   n=sc.nextInt();
   for(i=n;i>=1;i--)
   {
     F=F*i;
   }
     System.out.print("Factorial:"+F);
 }
}