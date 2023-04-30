import java.util.Scanner;

public class lab02e
 {
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      

      // constants

      // variables
       String name;
       int age;
       int salary;
       String comment;
       System.out.println(" Please enter the name: ");
       name = scan.nextLine();
       System.out.println("Please enter the age : ");
       age = scan.nextInt();
       System.out.println("Please enter the salary:  ");
       salary = scan.nextInt();
       System.out.println("Please enter the comment : ");
       comment = scan.nextLine();
       comment = scan.nextLine();
      
       System.out.println( "<h1> "+name+" </h1>");
       System.out.println( "<p>Age: "+age+" </p>");
       System.out.println( "<p>Salary: "+salary+" </p>");
       System.out.println( "<p>Comments: " +comment+ " </p>");
       System.out.println( "<hr>");
       System.out.println( "</body>");
       System.out.println("</html>");

      // program code
      System.out.println( "<!DOCTYPE html>");
      System.out.println( "<html>");
      System.out.println( "<head>");
      System.out.println( "<title>Tarýk's Home Page</title>");
      System.out.println( "</head>");
      System.out.println( "<body>");
      System.out.println( "<hr>");
      System.out.println( "Start...");
      System.out.println( "End.");
   }
 }

   
