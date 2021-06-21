import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CardDriver
{
   //-----------------------------------------------------------------
   //  Creates a deck, shuffles the deck and deals the cards.
   //-----------------------------------------------------------------
   public static void main (String args[])
   {
     DeckOfCards deck = new DeckOfCards();
     Card card = new Card();

     int faceValue;
     
     int totalOfHand, totalOfHand2;
     ArrayList<Card> player1 = new ArrayList<Card>();
     ArrayList<Card> player2 = new ArrayList<Card>();
    
     ArrayList<Integer> values = new ArrayList<Integer>(); 
     ArrayList<Integer> values2 = new ArrayList<Integer>();   
     
     deck.shuffle();
    
     String result = "", result2;  
     
     result2 = "Player 1's turn!";
     JOptionPane.showMessageDialog (null, result2); 
     
     for (int firstDeal = 0; firstDeal < 2; firstDeal++)
     {
    	 card = deck.deal();
    	 faceValue = card.getFace();
    	 if (faceValue >= 10)
    	 {
    		 faceValue = 10;
    	 }
    	 player1.add(card);   
    	 values.add(faceValue);
      }
   
     
     totalOfHand = 0;
     
     for (int placeH = 0; placeH < values.size(); placeH++)
     {
    	 totalOfHand = totalOfHand + values.get(placeH);
     }
     result = "Your first two cards are: " + player1 + "\n" + "Your total of the cards is: " + totalOfHand;
     JOptionPane.showMessageDialog (null, result);  
     
     boolean dealing = true;
     int ifYes = 0;
     
     while (dealing == true)
     {
    	 ifYes = JOptionPane.showConfirmDialog (null, "Would you like to hit (YES) or hold (NO)?");
    	 
    	 if (ifYes == JOptionPane.YES_OPTION)
    	 {   		
    	    card = deck.deal();
    	    faceValue = card.getFace();
    	    if (faceValue >= 10)
    	    {
    	    	faceValue = 10;
    	    }
    	    player1.add(card);
    	    values.add(faceValue);
    	    
    	    totalOfHand = 0;
    	    
    	    for (int placeH = 0; placeH < values.size(); placeH++)
    	    {
    	    	totalOfHand = totalOfHand + values.get(placeH);
    	    }
    	    
    	        	    
    	    result = "Your cards now are: " + player1 + "\n" + "Your total of the cards is: " + totalOfHand;
    	    JOptionPane.showMessageDialog (null, result);  
    	    
    	    if (totalOfHand > 21)
     	    {
     	    	result = "Sorry! You busted! Your total was: " + totalOfHand;
     	    	JOptionPane.showMessageDialog (null, result); 
     	    	dealing = false;
     	    
     	    }
    	    
    	 }
    	 else
    	 {
    		 dealing = false; 
    	 }
    	 
     }
    	
    	 
    	 result2 = "Player 2's turn!";
         JOptionPane.showMessageDialog (null, result2); 
         
         for (int firstDeal = 0; firstDeal < 2; firstDeal++)
         {
        	 card = deck.deal();
        	 faceValue = card.getFace();
        	 if (faceValue >= 10)
        	 {
        		 faceValue = 10;
        	 }
        	 player2.add(card);   
        	 values2.add(faceValue);
          }
       
         
         totalOfHand2 = 0;
         
         for (int placeH = 0; placeH < values2.size(); placeH++)
         {
        	 totalOfHand2 = totalOfHand2 + values2.get(placeH);
         }
         result = "Your first two cards are: " + player2 + "\n" + "Your total of the cards is: " + totalOfHand2;
         JOptionPane.showMessageDialog (null, result);  
         
         boolean dealing2 = true;
         int ifYes2 = 0;
         
         while (dealing2 == true)
         {
        	 ifYes2 = JOptionPane.showConfirmDialog (null, "Would you like to hit (YES) or hold (NO)?");
        	 
        	 if (ifYes2 == JOptionPane.YES_OPTION)
        	 {   		
        	    card = deck.deal();
        	    faceValue = card.getFace();
        	    if (faceValue >= 10)
        	    {
        	    	faceValue = 10;
        	    }
        	    player2.add(card);
        	    values2.add(faceValue);
        	    
        	    totalOfHand2 = 0;
        	    
        	    for (int placeH = 0; placeH < values2.size(); placeH++)
        	    {
        	    	totalOfHand2 = totalOfHand2 + values2.get(placeH);
        	    }
        	    
        	        	    
        	    result = "Your cards now are: " + player2 + "\n" + "Your total of the cards is: " + totalOfHand2;
        	    JOptionPane.showMessageDialog (null, result);  
        	    
        	    if (totalOfHand2 > 21)
        	    {
        	    	result = "Sorry! You busted! Your total was: " + totalOfHand2;
        	    	JOptionPane.showMessageDialog (null, result); 
        	    	dealing2 =  false;
        	  
        	    }

        	 }
        	 else
        	 {
        		 dealing2 = false;
        	 }         	 
         }            
   }
}