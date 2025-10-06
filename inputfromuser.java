import java.util.Scanner;
class inputfromuser {

    public static void main(String k[])
    {
        Scanner obj =new Scanner(System.in);
        int a,b,result;
        System.out.println("enter value of a");
        a=obj.nextInt();
        System.out.println("enter value of b");
       
        b= obj.nextInt();
        result=(a*a)+(b*b);
        System.out.println("the calculation of a and b is :"+result);
        System.out.println("hello calculator user");
    }

    
}
