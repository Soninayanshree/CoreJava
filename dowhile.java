import java.util.*;
class dowhile
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int a;
  System.out.println("Enter three number:");
  a=sc.nextInt();
  do
  {
   System.out.println(a);
   //a++;
   break;
  }
  while(a>=10);
   System.out.println(a);
 }
}