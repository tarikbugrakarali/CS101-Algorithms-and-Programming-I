import java.util.Scanner;

/**
 * __in order to calculate sum , difference , multiply, divison and remainder two integer___ 
 * @author __tarik bugra___
 * @version __15.10.2019__
 */ 
public class lab02d
{
   public static void main( String[] args)
   {
     System.out.println( "Welcome to area and flower number calculator "); 
     double a,b,c,s,area;
     int flowers;
     Scanner scan = new Scanner( System.in);
     System.out.println( "Please enter first lenght of triangle ");

       a = scan.nextInt();
       System.out.println( "Please enter second lenght of triangle ");
       b  = scan.nextInt();
       System.out.println( "Please enter third lenght of triangle ");
       c  = scan.nextInt();
       s = ( a + b + c) / 2;
       area = Math.sqrt( s * (s-a) * (s-b) * (s-c));
       flowers = (int)(17 * area);
      
      

      

      // program code
      System.out.print( "The semi-perimetre of triangle = ");
      System.out.println(s);
      System.out.print( "The area of the triangle = ");
      System.out.println(area);
      System.out.print( "The number of the flowers = ");
      System.out.println(flowers);
      
     

      System.out.println( "Good bye");
   }
}