 class table
{
   static final int mam =10;
   public static void main (String k[])
   {
      int row, column;
      for( row = 1; row<=mam; row++)
      {
         for( column= 1; column<=mam; column++)
         System.out.println(row*column +"");
         System.out.println();
      }
   }
}