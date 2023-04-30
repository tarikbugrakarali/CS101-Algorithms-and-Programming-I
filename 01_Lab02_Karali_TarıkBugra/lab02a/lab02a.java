import java.util.Scanner;

/**
 * __in order to calculate sum two integer___ 
 * @author __tarik bugra___
 * @version __15.10.2019__
 */ 
public class lab02a
{
   public static void main( String[] args)
   {
     System.out.println( "Welcome to calculator of sum"); 
     Scanner scan = new Scanner( System.in);
     System.out.println( "Please enter two integer ");

      int a = scan.nextInt();
      int b = scan.nextInt();
      int sum = a + b;

      

      // program code
      System.out.print( "The sum of the integers = ");
      System.out.println(sum);

      System.out.println( "Good bye");
   }

}