package object;
import java.util.ArrayList;

public class Library
{
   private ArrayList<LibraryBook> book;
   
   //constructer
   public Library()
   {
      book = new ArrayList<LibraryBook>();
   }
   //methods
   public Boolean isEmpty()
   {
      int k = book.size();
      if ( k == 0 )
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   public String toString()
   {
      String a = "";
      if(book.size() > 0)
      {
         for (int i = 0; i < book.size(); i++)
         {
            a = a + book.get(i).toString() + "\n";
         }
         return a;
      }
      else
      {
         return "the Library is empty ";
      }
      
      
   }
   
   public void add(String a,String b)
   {
      LibraryBook x;
      x = new LibraryBook(a,b,"",0);
      book.add(x);
   }
   
   public boolean remove(LibraryBook a)
   {
      int m = book.size();
      for (int i = 0; i < m ; i++)
      {
         LibraryBook k = book.get(i);
         boolean c = k.hasSameTitle(a,k);
         if (c)
         {
            book.remove(i);
            return true;
         }    
      }
      return false;
   }
   
   public LibraryBook findByTitle(String a)
   {
      for (LibraryBook book : book)
      {
         if (book.getTitle().equals(a))
         {
            return book;
         }    
      }
      return null;
   }
}