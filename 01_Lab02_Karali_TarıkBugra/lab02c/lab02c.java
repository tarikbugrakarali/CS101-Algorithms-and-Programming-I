import java.util.Scanner;

/**
 * __in order to calculate sum , difference , multiply, divison and remainder two integer___ 
 * @author __tarik bugra___
 * @version __15.10.2019__
 */ 
public class lab02c
{
   public static void main( String[] args)
   {
     System.out.println( "Welcome to calculator of sum"); 
     Scanner scan = new Scanner( System.in);
     System.out.println( "Please enter two integer ");

      int a = scan.nextInt();
      int b = scan.nextInt();
      int sum = a + b;
      int difference = a - b;
      int multiply = a * b;
      double division = a / b;
      double remainder = a % b;

      

      // program code
      System.out.print( "The sum of the integers = ");
      System.out.println(sum);
      System.out.print( "The differance of the integers = ");
      System.out.println(difference);
      System.out.print( "The multiply of the integers = ");
      System.out.println(multiply);
      System.out.print( "The division of the integers = ");
      System.out.println(division);
       System.out.print( "The remainder of the integers = ");
      System.out.println(remainder);

      System.out.println( "Good bye");
   }

}