class x
{
 void test()
 {
     System.out.println("I am in X class");
 }
}
class y extends x
{
 void test()
 {
	  super.test();
      System.out.println("I am in Y class");
 }
 public static void main(String args[])
 {
    y obj=new y();
    obj.test();
 }
}