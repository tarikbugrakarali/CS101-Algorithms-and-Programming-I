//in order to find values from one dice
public class Die
{
   //properties
   public int die ;

   //methods
   public int roll()
   {
      double k;
      int m;
      k = 10 * Math.random() + 1 ; //we multiply with 10 , otherwise possibility of 6 and the others not equal
      die =  (int) k; // dice contains integer value so we turn it integer
      
      if (die < 7) // we eliminate the invalid values
      {
         return die; 
      }
      else
      {
         do
         {
            k = 10 * Math.random() + 1 ; //we multiply with 10 , otherwise possibility of 6 and the others not equal
            die =  (int) k; // dice contains integer value so we turn it integer  
         }
         while (die > 6);
         return die;
      }
   }
   
   public int getFaceValue()
   {
      return die;
   }
  
   public String toString()
    {
      return "Roll :  " + die + "  getFaceValue : " + die;
    }
}