import java.util.Scanner;

/**
 * __in order to calculate the number of flowers whic will be placed in triangle___ 
 * @author __tarik bugra___
 * @version __22.10.2019__
 */ 
public class Lab03b
{
   public static void main( String[] args)
   {
     System.out.println( "Welcome to area and flower number calculator "); 
     //variables
     double a,b,c,s,area;
     int flowers;
     //program code
     Scanner scan = new Scanner( System.in);
     System.out.println( "Please enter first lenght of triangle ");
     a = scan.nextInt();
     System.out.println( "Please enter second lenght of triangle ");
     b  = scan.nextInt();
     System.out.println( "Please enter third lenght of triangle ");
     c  = scan.nextInt();
     s = ( a + b + c) / 2;
     double d = a + b; // define the values in order the check triangle inequality
     double e = Math.abs(a - b);
    
     if ( c > e && d > c )
     {
       area = Math.sqrt( s * (s-a) * (s-b) * (s-c)); // compute the area
       flowers = (int)(17 * area);
       System.out.print( "The semi-perimetre of triangle = ");
       System.out.println(s);
       System.out.print( "The area of the triangle = ");
       System.out.println(area);
       System.out.print( "The number of the flowers = ");
       System.out.println(flowers);
       System.out.println( "Good bye");
     }   
     else 
     {
       System.out.print( "The values are not proper for a triangle !!  ");
     }
     

  }
}