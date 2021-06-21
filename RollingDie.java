public class RollingDie
{
 
   public static void main (String[] args)
   {
      Die die1, die2;
 
      die1 = new Die();
      die2 = new Die();
      
      int sum;
      boolean again;

      int [] resultArray = new int [9];
      
      for (int rollTimes = 0; rollTimes < 1000; rollTimes++)
      {   	  
    	  die1.roll();
          die2.roll();
    	  
          again = true;
         
    	  while (again == true)
          {
        	  if (die1.getFaceValue() == 6 || die2.getFaceValue() == 6)
              {
            	  die1.roll();
                  die2.roll();
              }
        	  else
        	  {
        		  again = false;
        		  //System.out.println ("Die One: " + die1 + ", Die Two: " + die2);
            	  sum = die1.getFaceValue() + die2.getFaceValue();
                  //System.out.println ("Sum: " + sum);
                  
                  resultArray[sum - 2]++;
        	  }       	 
          }
      }
      
      int sumNum = 2;
      
      for (int ph = 0; ph < 9; ph++) 
      {
    	  System.out.println ("The number of sums of "+ sumNum + "s is: "  + resultArray[ph]);
    	  sumNum++;
      } 
   }
}