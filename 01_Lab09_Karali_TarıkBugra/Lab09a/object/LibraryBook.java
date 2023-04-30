package object;

//in order to identify the qualities and get information about book 
public class LibraryBook
{
   // properties
   private String title;
   private String  author;
   private String dueDate;
   public int timesLoaned;
   
   // constructors
   public LibraryBook(String bookName , String writer , String date ,int loaned)
   {
      title = bookName;
      author = writer;
      dueDate = date;
      timesLoaned = loaned;
   }
   public LibraryBook(LibraryBook c)
   {
      title = c.title;
      author = c.author;
      dueDate = c.dueDate;
      timesLoaned = c.timesLoaned ;
   }
   
   // methods
   public String toString()
   {
      return "title: "+title +"  / author:  "+ author +"  /Due Date: "+ dueDate +"  / Times Loaned:  "+ timesLoaned+"  /On loan:  "+ onLoan()+ "  "+onLoann();
   }
   public  String loanBook(String actualDate)
   {
      dueDate = actualDate;
      timesLoaned++;
      return"title: "+title +"  / author:  "+ author +"  /Due Date: "+ actualDate +"  / Times Loaned:  "+ timesLoaned+"  /On loan:  "+ onLoan()+ "  "+onLoann();
      
   }
   public String returnBook()
   {
      dueDate = " " ; 
      return "title: "+title +"  / author:  "+ author +"  /Due Date: "+ dueDate +"  / Times Loaned:  "+ timesLoaned+"  /On loan:  "+ onLoan()+ "  "+onLoann();
   }
   
   public boolean onLoan()
   {
      if (dueDate.equals(""))
      {
         return true; 
      }
      else
      {
         return false;
      }
   }
   
   public String onLoann()
   {
      if (dueDate.equals(""))
      {
         return "It is available"; 
      }
      else
      {
         return " It is not available";
      }
   }
   
   public int getTimesLoaned()
   {
      return timesLoaned;
   }
   public boolean equals(LibraryBook a )
   {
      if (title == a.title && author == a.author)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   public boolean hasSameTitle(LibraryBook a,LibraryBook b)
   {
      if (b.title == a.title)
      {
         return true; 
      }
      else
      {
         return false;
      }
   }
   public boolean hasSameAuthor(LibraryBook a,LibraryBook b)
   {
      if (b.author == a.author)
      {
         return true; 
      }
      else
      {
         return false;
      }
   }
   
   public String getTitle()
   {
     return title;
   }

   
   public static void main( String[] args)
   {
      //a
      LibraryBook p1 = new LibraryBook("book1","writer1","11,11,2000",5);
      LibraryBook p2 = p1;
      
      if (p1 == p2)
      {
         System.out.println("equal");
      }
      else
      {
         System.out.println("not equal");
      }
      
      if (p1.equals(p2))
      {
         System.out.println("equal");
      }
      else
      {
         System.out.println("not equal");
      }
      //b
      LibraryBook p3 = new LibraryBook("book2","writer2","11,12,2000",6);
      LibraryBook p4 = new LibraryBook("book3","writer3","12,12,2000",7);
      
      if (p3 == p4)
      {
         System.out.println("equal");
      }
      else
      {
         System.out.println("not equal");
      }
      
      if (p3.equals(p4))
      {
         System.out.println("equal");
      }
      else
      {
         System.out.println("not equal");
      }
      //c
      LibraryBook p5 = new LibraryBook("book4","writer4","08,12,2000",1);
      LibraryBook p6 = new LibraryBook("book4","writer4","08,12,2000",1);
      
      if (p5 == p6)
      {
         System.out.println("equal");
      }
      else
      {
         System.out.println("not equal");
      }
      
      if (p5.equals(p6))
      {
         System.out.println("equal");
      }
      else
      {
         System.out.println("not equal");
      }
      
      
      
   }
}