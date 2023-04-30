import java.util.Scanner;
import object.*;
/**
 * __in order to create a library___ 
 * @author __tarik bugra___
 * @version __05.11.2019__
 */ 
public class LibraryTest
{
   public static void main( String[] args)
   {     
      System.out.println( "Welcome to Library");
      System.out.println();
      Library lib = new Library();
      for(int t = 0 ; t > -1 ; t ++ )
      {
         System.out.println( "Show");
         System.out.println( "Find");
         System.out.println( "Add");
         System.out.println( "Exit");
         System.out.println( "------------------------"); 
         Scanner scan = new Scanner( System.in);
         System.out.println( "Please choose operation: ");
         String y = scan.next();
         String s1 = new String("Show");
         String s2 = new String("Find");
         String s3 = new String("Add");
         String s4 = new String("Exit");
         
         if (s1.equals(y))
         {
            System.out.println(lib.toString()+ "\n");  
         }
         
         else if (s2.equals(y))
         {
            System.out.println("Please write the title: ");
            String x =scan.next();
            
            if (lib.findByTitle(x)!= null)
            {
               LibraryBook a = lib.findByTitle(x);
               System.out.println("The Book is in Library");
               System.out.println( "Loan");
               System.out.println( "Return");
               System.out.println( "Remove");
               System.out.println( "Exit");
               String lo = new String("Loan");
               String re = new String("Return");
               String rem = new String("Remove");
               String ex = new String("Exit");
               System.out.println( "Please choose operation: ");
               String z = scan.next();
               
               if (z.equals(lo))
               {
                  System.out.println("Please enter the date: ");
                  String date =scan.next();
                  a.loanBook(date);
               }
               
               if (z.equals(re))
               {
                  a.returnBook();
               }
                            
               if (z.equals(rem))
               {
                  lib.remove(a);
               }
               
               else
               {
               } 
            }

            else
            {
               System.out.println("Book could not find !!"); 
            }
         }
        
         else if (s3.equals(y))
         {
            System.out.println( "Please enter book's title: ");
            String v = scan.next();
            System.out.println( "Please enter book's author: ");
            String z = scan.next();
            lib.add(v,z);             
         }
         
         else
         {
            break;
         }  
      }
   }
}   
