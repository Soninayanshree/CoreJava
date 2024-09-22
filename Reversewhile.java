import java.util.*;
class Reversewhile
{
  public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int n,a,s=0;
   System.out.print("Enter the number:");
   n=sc.nextInt();
   while(n!=0)
   {
     a=n%10;
     n=n/10;
     s=s*10+a;
   }
     System.out.print("Reverse number:"+s);
 }
}