import java.util.Scanner;
import java.nio.file.*;  
import java.io.*;
/**
 * __in order to create a webpage to new comers___ 
 * @author __tarik bugra___
 * @version __22.10.2019__
 */ 




public class Lab03c
 {
   public static void main( String[] args)
   {
     Scanner scan = new Scanner( System.in);
      

      // constants

      // variables
      String name;
      int age;
      double grossSalary;
      double tax;
      double ratioTax;
      String comment;
      double netSalary;
      System.out.println(" Please enter the name: ");
      name = scan.nextLine();
      System.out.println("Please enter the age : ");
      age = scan.nextInt();
      // program code
      if ( age > 0 )
      {
      System.out.println("Please enter the salary:  ");
      grossSalary = scan.nextDouble();
        if ( grossSalary < 10000 )
        {
          System.out.println("Please enter the comment : ");
          comment = scan.nextLine();
          comment = scan.nextLine();
          if ( grossSalary < 1000 )
          {
            tax = (grossSalary - 100) * 5 / 100;
            ratioTax = 5;
            netSalary = (grossSalary - 100) * 95 / 100;
          }  
          else if ( grossSalary > 5000 )
          {
            tax = (grossSalary - 100) * 25 / 100;
            ratioTax = 25;
            netSalary = (grossSalary - 100) * 75 / 100;
          }
          else
          {
            tax = (grossSalary - 100) * 15 / 100;
            ratioTax = 15;
            netSalary = (grossSalary - 100) * 85 / 100;
          }
           
          System.out.println( "<h1> "+name+" </h1>");
          System.out.println( "<p>Age: "+age+" </p>");
          System.out.println( "<p>Salary: "+netSalary+"(tax ratio is "+ratioTax+" %)) </p>");
          System.out.println( "<p>Comments: " +comment+ " </p>");
          System.out.println( "<hr>");
          if(Files.exists( Paths.get( name +".jpg") ))
          {
             System.out.println( "<img src="+name+".jpg>");
             System.out.println( "</body>");
             System.out.println("</html>");
             System.out.println( "<!DOCTYPE html>");
             System.out.println( "<html>");
             System.out.println( "<head>");
             System.out.println( "</head>");
             System.out.println( "<body>");
             System.out.println( "<hr>");
             System.out.println( "Start...");
             System.out.println( "End.");
          }
          else
          {
             System.out.println( "</body>");
             System.out.println("</html>");
             System.out.println( "<!DOCTYPE html>");
             System.out.println( "<html>");
             System.out.println( "<head>");
             System.out.println( "</head>");
             System.out.println( "<body>");
             System.out.println( "<hr>");
             System.out.println( "Start...");
             System.out.println( "End.");
          }
        }
         else 
         { 
           System.out.println( " Excess the maximum value of salary " );
         }
      }
      else
      { 
        System.out.println( " Given age is not proper." );
      }
   }
 }