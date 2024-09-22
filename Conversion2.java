import java.util.*;
class Conversion2
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int kg,g;
    System.out.println("Enter value in kg:");
    kg=sc.nextInt();
    g=1000*kg;
    System.out.println("Equivalent of kg in g:"+g);
  }
}