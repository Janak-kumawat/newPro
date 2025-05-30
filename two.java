class one
{
    double a,b,c;
    void add(){
    c = a+b;
  
     System.out.println("addition is:" +c);
   }  
}
class two 
{
     public static void main(String k[])
  {
     one obj = new one();
     obj.a=7;
     obj.b=8;
     obj.add();
  } 
}
