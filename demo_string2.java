import java.util.*;
class demo2
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the index position of given String");
   int n=sc.nextInt();
   String str="Nayan";
   char ch=str.charAt(n);
   System.out.println(ch); 
 }
}