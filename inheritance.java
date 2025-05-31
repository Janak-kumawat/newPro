class inherit
{
    double a,b;
    void show()
    {
        System.out.println("value of a is:"+a);
         System.out.println("value of b is:"+b);
    }
}
class inherit1 extends inherit
{
    double c;
    void showc()
    {
        System.out.println("value of c is :"+c);
    }
}
class inheritance
{
    public static void main( String k[])
    {
        inherit obj=new inherit();
         inherit1 obj1=new inherit1();
         obj1.a=10;
         obj1.b= 20;
         obj1.show();
         obj1.c=30;
         obj1.showc();

    }
}