public class DiceGame
{
   //properties
   public Dice dice;
   
   //constructors
   public DiceGame()
   {
       dice = new Dice();
   }
   
   //methods
   public int play()
   {
      int i = 0;
      do 
      {
         i++;  
      }
      while(dice.roll() != 12);
      return i;
   }   
}