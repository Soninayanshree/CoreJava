import java.util.*;
class Student
{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  String name;
  int rollno;
  float per;
  System.out.println("Enter the student name:");
  name=sc.next();
  System.out.println("Enter the student roll no.:");
  rollno=sc.nextInt();
  System.out.println("Enter the student percentage:");
  per=sc.nextFloat();
  System.out.println("Student name:"+name);
  System.out.println("Student rollno:"+rollno);
  System.out.println("Percentage:"+per);
}
}