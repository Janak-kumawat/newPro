class exception
{
    public static void main (String k[])
    {
        try
        {
            int a =10;  //int a = k.length;
            System.out.println("a="+a);
            int b=10/a;
            int c[]= {3};
            c[10]=87;
        }
        catch(ArithmeticException e)
        {
            System.out.println("divide by zero"+e);

        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("array index out of bonds "+e);

        }
        System.out.println("after try or catch block");

    }
}