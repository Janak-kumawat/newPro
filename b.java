class a
{
   double x,y,z;
   void add()
  {
    z=x+y;
     System.out.println("addition is : "+z);
  }
}
class b
{
    public static void main(String k [])
  {
    a obj=new a();
    obj.x=12;
    obj.y=12;
    obj.add();
  }
}