import object.*;
public class TestLibraryBook
{
  public static void main( String[] args)
   {
      LibraryBook a;
      LibraryBook b;
      a = new LibraryBook("o" , "mehmet" , "11,11,2000" ,20);
      b = new LibraryBook("xyz" , "ali" , "11,10,2010" ,36);

       System.out.println( a );
       System.out.println( b );
       System.out.println( a.hasSameTitle(a,b) );
       System.out.println( a.hasSameAuthor(a,b) );
   }
 

}