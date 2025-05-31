class great1
{
    double a,b;
    void great()
  {
    if(a>b)
   {
     System.out.println("a is :"+a);
     System.out.println("b is :"+b);
     System.out.println(" a is greater then b, and the value of a is :"+a);
   }
  else 
   {
     System.out.println(" b is greater then a, and the value of b is :"+b);
   }
 }
}
 class great2
 {
   public static void main(String k[])
  {
    great1 obj = new great1();
    obj.a=20;
    obj.b=4;
    obj.great();
   }
}