import java.util.Scanner;

/**
 * __in order to create an calculator___ 
 * @author __tarik bugra___
 * @version __05.11.2019__
 */ 
public class Lab05c
{
   public static void main( String[] args)
   {     
      System.out.println( "Welcome to Calculator");
      double result = 0.0 ;
      System.out.println( "[ 0.0 ]");
      for(int t = 0 ; t > -1 ; t ++ )
      {
         System.out.println( "Operations : +,-,*,/");
         System.out.println( "clear");
         System.out.println( "quit");
         System.out.println( "------------------------"); 
         Scanner scan = new Scanner( System.in);
         System.out.println( "Please choose operation: ");
         String y = scan.next();
         String s1 = new String("+");
         String s2 = new String("-");
         String s3 = new String("*");
         String s4 = new String("/");
         String s5 = new String ("quit");
         String s6 = new String ("Quit");
         String s7 = new String("clear");
         String s8 = new String ("Clear");
         if (s7.equals(y)|| s8.equals(y))
         {
           result = result*0 ;
           System.out.println(result);
         }
         else if (s5.equals(y)|| s6.equals(y))
         {
            System.out.println("GOOD BYE !!");
            break;
         }
         else if (s1.equals(y))
         {
           System.out.println( "Please enter a number: ");
           Double z = scan.nextDouble();
           result = result + z ;
           System.out.println("----------------------------------");
           System.out.println("[ "+result+" ]");
           System.out.println("----------------------------------");
         }
         else if (s2.equals(y))
         {
           System.out.println( "Please enter a number: ");
           Double z = scan.nextDouble();
           result = result - z ;
           System.out.println("----------------------------------");
           System.out.println("[ "+result+" ]");
           System.out.println("----------------------------------");
         }
         else if (s3.equals(y))
         {
           System.out.println( "Please enter a number: ");
           Double z = scan.nextDouble();
           result = result * z ;
           System.out.println("----------------------------------");
           System.out.println("[ "+result+" ]");
           System.out.println("----------------------------------");
         }
         else if (s4.equals(y))
         {
           System.out.println( "Please enter a number: ");
           Double z = scan.nextDouble();
           result = result + z ;
           System.out.println("----------------------------------");
           System.out.println("[ "+result+" ]");
           System.out.println("----------------------------------");
         }
         else 
         {
            System.out.println("ERROR : Your opration is invalid");
         }
         

         
      }
   }
}   
