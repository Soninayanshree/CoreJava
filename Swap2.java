import java.util.*;
class Swap2
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter value of a:");
    a=sc.nextInt();
    System.out.println("Enter value of b:");
    b=sc.nextInt();
    //condition for swapping
    c=a;
    a=b;
    b=c;
    System.out.println("After swapping");
    System.out.println("Value of a:"+a);
    System.out.println("Value of b:"+b);
  }
}