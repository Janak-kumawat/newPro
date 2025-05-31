class method
{
    double a,b;
    void display()
    {
        a=12;
        b=12;
        System.out.println("addition is :"+(a+b));

    }
    void display(double x, double y)
    {
        System.out.println("the subtraction is :"+(a-b));
    }
    void display(double p, double q, double r)
    {
        System.out.println("multiplication is :"+(p*q*r));
    }
    void display(double j, double k, double l,double s)
    {
        s=(j*k*l)/100;
        System.out.println("intreast is :"+s);
    }

}
class methodoverload
{
    public static void main(String k[])
    {
        method obj = new method();
        obj.display();
        obj.display(12,12);
        obj.display(12,12,12);
        
    }
}