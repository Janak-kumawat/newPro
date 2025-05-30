class even1
{
     double x; 
     void evn()
 {
  for(x=0; x<=50; x++,x++)
   {
  System.out.println("even number is :" +x);
   }
  }
}
 class even2
 {
   public static void main(String k[])
  {
    even1 obj=new even1();
    obj.evn();
  }
}