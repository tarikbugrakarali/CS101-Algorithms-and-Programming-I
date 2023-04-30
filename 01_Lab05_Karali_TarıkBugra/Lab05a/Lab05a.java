import java.util.Scanner;

/**
 * __in order to create an rectangle with given character___ 
 * @author __tarik bugra___
 * @version __05.11.2019__
 */ 
public class Lab05a
{
   public static void main( String[] args)
   {     
      System.out.println( "Welcome to rectangle show");
      for(int t = 0 ; t > -1 ; t ++ )
      {  
         Scanner scan = new Scanner( System.in);
         System.out.println( "Please enter width: ");
         double width = scan.nextDouble();
         System.out.println( "Please enter height: ");
         double height = scan.nextDouble();
         System.out.println( "Please enter wall thickness: ");
         double thickness = scan.nextDouble();
         int a;
         int b;
         int c ;
         a = (int)width;
         b = (int)height;
         c = (int)thickness;
         if ( a > 0 && b > 0 && c >= 0 && a == width && b == height && c == thickness )
         {
            if (a < 2*c || b < 2*c)
            {
               for(int i = 0; i < b; i++ )
               {
                  for(int j = 0 ; j < a; j++)
                  {
                     System.out.print("*");
                  }
                  System.out.println();
               }
               System.out.print("Oops... no hole!");
            }
            else
            {
               for(int k = 0; k < b; k++ )
               {
                  if(k < c   || k > b-c-1 )
                  {
                     for(int l = 0 ; l < a; l++)
                     {
                        System.out.print("*");
                     }
                     System.out.println();
                  }
                  else
                  {
                     for (int m = 0; m < c ; m++ )
                     {
                        System.out.print("*");
                     }
                     for (int m = 0; m < a - 2 * c ; m++)
                     {
                        System.out.print(" ");
                     }
                     for (int m = 0; m < c ; m++ )
                     {
                        System.out.print("*");
                     }
                     System.out.println();
                  }  
               }
            }
         }
         else
         {
            System.out.println( "error !! invalid values");
         }
         System.out.println( "Do you want another rectangle? ");
         String responce = scan.next();
         String s1 = new String ("y");
         String s2 = new String ("Y");
         if (s1.equals(responce)|| s2.equals(responce))
         {
            System.out.println( "Let's continue ");
         }
         else
         {
            System.out.println( "GOOD BYE !! "); 
            break;
         }
      }  
   }
}   