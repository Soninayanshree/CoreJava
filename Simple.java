import java.util.*;
class Simple
{  
  public static void main(String args[])  
  {
    Scanner sc=new Scanner(System.in);
    int p;
    double r,t,si;
    System.out.println("Enter pricipal value:");
    p=sc.nextInt();
    System.out.println("Enter rate interest:");
    r=sc.nextDouble();
    System.out.println("Enter time:");  
    t=sc.nextDouble();

    si=(p*r*t)/100;
    System.out.println("Simple interest:"+si);
  }
}