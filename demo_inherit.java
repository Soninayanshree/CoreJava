import java.util.*;
class stu//declare variable
{
  int roll;
  String name;
  int marks;
}
class input extends stu//get data
{
  Scanner sc=new Scanner(System.in);
  void get_data()
  {
   roll=sc.nextInt();
   name=sc.next();
   marks=sc.nextInt();
  }
}
class disp extends input//display data
{
  void show()
  {
   System.out.println("Roll no:"+roll);
   System.out.println("Name:"+name);
   System.out.println("Marks:"+marks);
  }
  public static void main(String arg[])
  {
   disp obj=new disp();
   obj.get_data();
   obj.show();
  }
}
