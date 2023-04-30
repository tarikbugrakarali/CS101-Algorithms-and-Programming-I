import java.util.Scanner;

/**
 * __in order to calculate sum of given integer___ 
 * @author __tarik bugra___
 * @version __30.10.2019__
 */
public class Lab04b
{
   public static void main( String[] args)
   {     
     System.out.println( "Welcome to calculator of sum"); 
     Scanner scan = new Scanner( System.in);
     int n =  scan.nextInt(); 
     int m = 0 ;
     int sum = 0;
     while (m < n )
     {
        m ++; 
        System.out.println( "Please enter an integer ");
        double a = scan.nextDouble();
        int b = (int)a;
        if ( b == a)
        {
           sum = sum + b;
           System.out.println("The sum of integer= "+sum+" The number of integer= "+m);
        }
        else
        {
           System.out.println("Given number is not an integer");
        }
     }
   }
}   