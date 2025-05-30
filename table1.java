 class table
{
   static final int mam =10;
    int row, column;
   void tbl()
   {
      for( row = 1; row<=mam; row++)
      {
         for( column= 1; column<=mam; column++)
         System.out.print(row*column +"");
         System.out.println("");
      }
   }
}
class table1{
    public static void main (String args[])
    {
    table obj = new table();
    obj.tbl();
    }
}
