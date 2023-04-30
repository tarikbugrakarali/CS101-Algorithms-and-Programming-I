import java.util.Scanner;

/**
 * __in order to create an chart table with given numbers___ 
 * @author __tarik bugra___
 * @version __04.11,2019__
 */ 
public class Lab05d
{
   public static void main( String[] args)
   {     
      System.out.println( " pi calculator"); 
      double a ;
      a = Math.PI;
      System.out.println(a);
      Scanner scan = new Scanner( System.in);
      System.out.println( "Please enter the number of terms of the series to compute: ");
      double n = scan.nextDouble();
      double pi=0 ;
      for (int k = 0; k < n ; k ++)
      {
         double b;
         
         if ( k % 2 == 0 )
         {
            b= 4.0 / (2.0 * k +1.0);
         } 
         else
         {
            b=  -4.0 / (2.0 * k +1.0);
         } 
         pi = pi + b;
      }   
      System.out.println(pi);
      System.out.println( "Please enter the errors tolerance : ");
      double m = scan.nextDouble();
      double f = 0;
      for (int r = 0; r > -1 ; r ++)
      {
         double b;
         
         if ( r % 2 == 0 )
         {
            b= 4.0 / (2.0 * r +1.0);
         } 
         else
         {
            b=  -4.0 / (2.0 * r +1.0);
         } 
         f = f + b;
         if (Math.PI - f < m && Math.PI - f > -m )
         {
            System.out.print(f +" ");
            break;
         }  
      }   
   }
}   