import java.util.Scanner;

/**
 * __program description___
 * @author __tarik bugra___
 * @version __12.11.2019__
 */
public class lab06
{
   /**
    * Calculation of power of real numbers.
    * @param a an example input parameter
    * @param b another example input
    * @return c is a to the power b
    */
   
   public static double powReal(double a, int b)
   {
      double c = 1;
      for (int i = 0 ; i < b ; i ++)
      {
         c = c * a ;
      }
      return c;
   }
   
   /**
    * Calculate the factorial of integers.
    * @param a an example input parameter
    * @return c is multiply the numbers of 1 to a 
    */
   
   public static int facInt(int a)
   {
      int c = 1;
      
      for (int i = 1 ; i < a +1 ; i ++)
      {
         c = c * i ;
      }
      return c;
   }
   /**
    * Reverse the words.
    * @param a an example input parameter
    * @return b is reverse written of a
    */
   
   public static String reverseWord(String a)
   {
      String b = "";
      
      for(int i = a.length() - 1; i >= 0; i--)
      {
         b = b + a.charAt(i);
      }
      
      return b;
   }
   
   /**
    * Base 2 value turns to Base 10 value.
    * @param a an example input parameter
    * @return b is decimal value of a
    */
   
   public static int toDecimal(int a)
   {
      int b = 0, i = 0;
      
      while(a != 0)
      {
         b = b + (a % 10) * (int)Math.pow(2, i);
         ++i;
         a = a / 10;
      }
      
      return b;
   }
   
   /**
    * Base 10 value turns to Base 2 value.
    * @param a an example input parameter
    * @return b is base 2  value of a
    */
  
   public static int decToBinary(int a)
   {
      int b = 0, i = 0;
      
      while(a != 0)
      {
         b = b + (a % 2) * (int)Math.pow(10, i);
         ++i;
         a = a / 2;
      }
      
      return b;
   }
   
   public static void main( String[] args)
   {  
      // 1
      System.out.println("|---------------------------------------------------------------------------|");
      System.out.print("n : ");
     
      for (int n = -1 ; n < 11 ; n ++)
      {
         System.out.print(powReal(n,1)+" | ");
      }
      
      System.out.println();
      System.out.println("|---------------------------------------------------------------------------|");
      System.out.print("n square : ");
     
      for (int n = -1 ; n < 11 ; n ++)
      {
         System.out.print(powReal(n,2)+" | ");     
      }
      
      System.out.println();
      System.out.println("|---------------------------------------------------------------------------|");
      System.out.print("n cube: ");
      
      for (int n = -1 ; n < 11 ; n ++)
      {
         System.out.print(powReal(n,3)+" | ");
      }
      
      System.out.println();
      System.out.println("|---------------------------------------------------------------------------|");
      System.out.print("n to the power 4: ");
      
      for (int n = -1 ; n < 11 ; n ++)
      {
         System.out.print(powReal(n,4)+" | ");
      }
      
      //2
      System.out.println();
      System.out.println("|---------------------------------------------------------------------------|");
      System.out.print("n factorial: ");
      
      for (int n = 1 ; n < 6 ; n ++)
      {
         System.out.print("n= " +n+",  "+n+"! = "+ facInt(n)+" | ");
      }
      
      System.out.println();
      System.out.println("|---------------------------------------------------------------------------|");
      
      //3
      Scanner scan = new Scanner( System.in);
      System.out.println("Please write an integer form base 2: ");
      int a = scan.nextInt();
      System.out.println("Please write an integer form base 2: ");
      int b = scan.nextInt();
      int a1 = toDecimal(a);
      int b1 = toDecimal(b);
      int sum = a1 + b1 ;
      int result = decToBinary(sum);
      System.out.println("Sum of the two numbers in base 2 : "+result);

      //4
      System.out.println("Please write a sentence or word :");
      scan.nextLine();
      String text = scan.nextLine();
      String end = reverseWord(text);
      System.out.println("result : " + end);
      
      //5
      System.out.println("Please write a number :");
      double x = scan.nextInt();
      x =  Math.toRadians(x);
      
      for (int n = 0; n < 11; n++)
      {
         double summ = 0 ;
         double m = powReal(-1, n) * powReal(x , 2 * n +1) / facInt(2 * n + 1) ; // Taylor series
         summ = summ + m ;
         System.out.println("n = "+n+" :   sin("+x+") = "+summ);
         System.out.println("|---------------------------------------------------------------------------|");
      }  
      
      //6
      System.out.println("Please write a number :");
      double y = scan.nextInt();
      y =  Math.toRadians(y);
      
      for (int n = 0; n < 11; n++)
      {
         double summm = 0 ;
         double t = powReal(-1, 0) * powReal(y , 1) / facInt(1) ; // First term of the series  
         double f = t * (-1) * powReal(y , 2) / (2 * n + 2)*(2 * n + 3); // We built up other terms in terms of previous
         summm = summm + t + f ; // t for the first term f for the other terms
         System.out.println("n = "+n+" :   sin("+y+") = "+summm+"for Math.sin(x): "+Math.sin(y) );
         System.out.println("|---------------------------------------------------------------------------|");
      }
      
   }
}