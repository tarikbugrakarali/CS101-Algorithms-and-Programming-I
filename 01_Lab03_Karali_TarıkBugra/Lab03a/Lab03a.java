import java.util.Scanner;
/**
 * __find the qualities of number in the given loob___ 
 * @author __tarik bugra karali___
 * @version __22.10.2019__
 */ 
public class Lab03a
{
   public static void main( String[] args)
   {
      System.out.println( "Welcome to remainder "); 
      Scanner in = new Scanner(System.in);
      System.out.println( "Please write an integer :  ");
      //variables
      int n = in.nextInt();
      int s = 0 ;
      int m ;
      //program code
      for ( int x = 0; x <= 50; x++ )//define the loob
      {
         if (  x < 25 && x > 12 )// we define the interval
         {  
            if ( x % 5 == 0 ) // if x can divisible by 5 say hi five 
            { 
               System.out.println( x + " Hi Five ");
            }
            else if ( x % 2 == 0 )//if x can divisible by 2 say hi two 
            { 
               System.out.println(x + " Hi Two ");
            }
            else if ( x % 3 == 0 || x % 7 == 0  )//if x can divisible by 3 and 7 say hi threeorseven
            { 
               System.out.println(x + " Hi Three0orSeven ");
            } 
            else 
            { 
               System.out.println( x + " Hi Others ");//if x can not divisible by any given number say hi others
            }
         }   
         else 
         { 
            System.out.println(x + " out of range 12-25 ");
         }
         if ( x > n ) // we calculate the sum according to n
         {  
            s = n * ( n + 1 ) / 2 ;
         }
         else 
         {  
            s = x * ( x + 1 ) / 2 ;
         }
      }
         m = n * (n + 1) / 2;
         if ( s == m ) // we compare the sums 
         {  
            System.out.println( " sums are " + s + " and " + m + " so same ");
         }
         else 
         {
            System.out.println( " sums are " + s + " and " + m + " so different"); 
         }
         System.out.println( " There are 7 odd values of x and there are 6 even values of x ");
}       
}