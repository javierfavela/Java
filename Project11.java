public class Project11
{
 
   public static void main (String[] args)
   {
      Die die1;
 
      die1 = new Die();
      int [] dieArray = new int [5];
      int total = 0;    
      
      System.out.print("The dice rolled were: ");
      
      for (int rollTimes = 0; rollTimes < 5; rollTimes++ )
      {
    	  die1.roll();
    
    	  dieArray[rollTimes] = die1.getFaceValue();
          System.out.print(dieArray[rollTimes] + " ");
      }
      System.out.print("-- not too bad");
      
      total = dieArray[0] + dieArray[1] + dieArray[2] + dieArray[3] + dieArray[4];
      System.out.println("\nThe total score is " + total);
      
      
      
      
      
      
      
   }
}