import java.util.Scanner;
/**
 * __calculating maxiumum , minimum and average value___
 * @author __TarýkBugraKarali___
 * @version __04.11.2019__
 */
public class Lab04c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      int number;     
      double sum;
      double average;
      int n;
      int max;
      int min;
      sum = 0;
      number = 0;
      n = 1;
      max = 0;
      min = 2000000;
      while ( 0 < n + 1)
      {
         n = scan.nextInt();
         number++;
         if ( max < n )
           {
              max = n;
           }
          if ( n < min && n + 1 > 0 )
          {
             min = n ;
          }
         
          sum = sum + n;    
      }
     
      average = ( sum - n ) / ( number - 1 );  // we did't take number because the last negative was already counted in to number 
      System.out.println("The maximum value is : " + max);
      System.out.println("The minimum value is : " + min);
      System.out.println("The average is : " + average);

   }

}

