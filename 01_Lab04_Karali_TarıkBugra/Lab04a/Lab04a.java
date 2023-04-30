import java.util.Scanner;

/**
 * __in order to identify some loob results___ 
 * @author __tarik bugra___
 * @version __30.10.2019__
 */ 
public class Lab04a
{
   public static void main( String[] args)
   {
      System.out.println("Please write an positive integer: ");
      Scanner in = new Scanner(System.in);
      double n = in.nextDouble();
      int a;
      int b = 0;
      a = (int)n;
      if ( n == a && n > 0 )
      {           
         while ( b < n-1 )
         {
            b ++;
            System.out.print(b+" ");        
         }
      }
      else
      {
         System.out.println("entered number is not an integer !");
      }
      System.out.print("Please write an positive integer: ");
      double m = in.nextDouble();
      int f ;
      int h = 0;
      f = (int)m;
      if ( m == f   && m > 0 )
      {           
         while ( h < m  )
         {
            h ++ ;
            int c;
            c = h % 5;
            if ( c == 1 )
            {
               System.out.print(h+" ");
            }
            else if ( c == 2 )
            {
               System.out.print(h+" ");
            }
            else if ( c == 3 )
            {
               System.out.print(h+" ");
            }
            else if ( c == 4 )
            {
               System.out.print(h+" ");
            }
            else
            {
               System.out.println(h+" ");
            }
         }
            
          
         
      }
      else
      {
         System.out.println("entered number is not an integer !");
      }
      System.out.println("Please write an positive integer: ");
      double number = in.nextDouble();
      int d;
      int e = -1;
      d = (int)number;
      if ( number == d && number > 0 )
      {           
         while ( e < number )
         {
            e ++;
            System.out.print(e+" ");        
         }
      }
      else
      {
         System.out.println("entered number is not an integer !");
      }
      System.out.println("Please write an positive integer: ");
      double numberTwo = in.nextDouble();
      int g;
      g = (int)numberTwo;
      int j = -1*g-1;
      if ( numberTwo == g && numberTwo > 0 )
      {           
         while ( j < n + 1 )
         {
            j ++;
            System.out.print(j+" ");        
         }
      }
      else
      {
         System.out.println("entered number is not an integer !");
      }
      System.out.print("Please write an positive integer: ");
      double numberThree = in.nextDouble();
      int ff ;
      int p = -1;
      ff = (int)numberThree;
      if ( numberThree == ff   && numberThree > 0 )
      {           
         while ( p < numberThree / 2  )
         { 
            p ++ ;
            int cc;
            cc = p % 5;
            if ( cc == 0 )
            {
               System.out.print((int)Math.pow(2*p,2)+" ");
            }
            else if ( cc == 1 )
            {
               System.out.print((int)Math.pow(2*p,2)+" ");
            }
            else if ( cc == 2 )
            {
               System.out.print((int)Math.pow(2*p,2)+" ");
            }
            else if ( cc == 3 )
            {
               System.out.print((int)Math.pow(2*p,2)+" ");
            }
            else
            {
               System.out.println((int)Math.pow(2*p,2)+" ");
            }
         }
      }
      else
      {
         System.out.println("entered number is not an integer !");
      }
      System.out.print("Please write an positive integer: ");
      double numberFour = in.nextDouble();
      int fff ;
      int pp = -1;
      fff = (int)numberFour;
      if ( numberFour == fff   && numberFour > 0 )
      {           
         while ( pp < numberFour )
         { 
            pp ++ ;
            int ccc;
            ccc = pp % 12;
            if ( ccc == 3 )
            {
               System.out.print(pp+" ");
            }
            else if ( ccc == 4 )
            {
               System.out.print(pp+" ");
            }
            else if ( ccc == 6 )
            {
               System.out.print(pp+" ");
            }
            else if ( ccc == 8 )
            {
               System.out.print(pp+" ");
            }
            else if (ccc == 9)
            {
               System.out.println(pp+" ");
            }
         }
      }
      else
      {
         System.out.println("entered number is not an integer !");
      }
      System.out.print("Please write an positive integer: ");
      double numberFive = in.nextDouble();
      int ffff ;
      int divisor = 0;
      ffff = (int)numberFive;
      if ( numberFive == ffff   && numberFive > 0 )
      {           
         while ( divisor < numberFive )
         { 
            divisor ++ ;
            if ( numberFive % divisor == 0 )
            {
               System.out.print  (divisor+" ");
            }   
         }
      }
      else
      {
         System.out.println("entered number is not an integer !");
      }
      System.out.print("Please write an positive integer: ");
      double numberSix = in.nextDouble();
      int fffff ;
      fffff = (int)numberSix;
      int k = 0;
      if ( numberSix == fffff   && numberSix > 0 )
      {           
         while ( k < numberSix )
         { 
            k ++ ;
            double kk ;
            kk = 1 / k;
            if( kk > 00.1)
            {
               System.out.print  (kk+" ");
            }   
         }
      }
      else
      {
         System.out.println("entered number is not an integer !");
      }
     
   }

}