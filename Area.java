import java.util.*;
class Area
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int r;
      float ar,p=3.14f;
      System.out.println("Enter the radius:");
      r=sc.nextInt();
      ar=p*r*r;
      System.out.println("Area of circle:"+ar);
   }
}