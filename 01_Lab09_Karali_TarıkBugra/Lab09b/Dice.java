// in orde to compare two die
public class Dice
{
   //1
   
   //properties
   public int die1;
   public int die2;
   //constructor
   public Dice()
   {
      Die die = new Die();
      die1 = die.roll();
      die2 = die.roll(); 
   }
   //methods
   public int roll()
   { 
      Die die = new Die();
      die1 = die.roll();
      die2 = die.roll();
      return die1 + die2;
   }
   
   public int getDie1FaceValue()
   {
      return die1;
   }
   
   public int getDie2FaceValue()
   {
      return die2;
   }
   
   public int getDiceTotal() 
   {
      return die1 + die2;
   }
   public String toString()
   {
     return "int roll :  "  + (die1 + die2) + "  getFace1Value : " +die1+ " getDie2FaceValue(): " + die2 + " getDiceTotal: "+ (die1 + die2);
   }
   
}