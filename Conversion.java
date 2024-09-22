import java.util.*;
class Conversion
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int inches;
    double cm;
    System.out.println("Enter value:");
    inches=sc.nextInt();
    cm=2.54*inches;
    System.out.println("Equivalent of inches in centimeter:"+cm);
  }
}