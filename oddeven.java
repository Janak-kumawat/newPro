class oddeven1
{
    double a;
    double b;
    void evn()
    {
        for(a=0; a<=10; a++)
        System.out.println(+a);
    }
}
class oddeven
{
    public static void main (String k[])
    {
    oddeven1 obj =new oddeven1();
    obj.evn();
    }
}