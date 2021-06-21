import java.util.ArrayList;
import javax.swing.JOptionPane;


public class GoFish 
{
	public static void main (String[] args)
	{
		 DeckOfCards deck = new DeckOfCards();
	     Card card = new Card();

	     int draw;
	     int cycle1, spot1 = 0;
	     int cycle2, spot2 = 0;
	     int points = 0;
	     int points2 = 0;
	     int pairs1, pairs2;
	     boolean ask;
	     boolean ifFound;
	     String resultP1 = "", resultP2, notFound;
	     String cardName;
	     
	     ArrayList<Card> player1 = new ArrayList<Card>();
	     ArrayList<Card> player2 = new ArrayList<Card>();
	    
	     ArrayList<Integer> valuesP1 = new ArrayList<Integer>(); 
	     ArrayList<Integer> valuesP2 = new ArrayList<Integer>();   
	     
	     deck.shuffle();
	    
	     for (draw = 0; draw < 5; draw++)
	     {
	    	 card = deck.deal();
	    	 player1.add(card);
	    	 card = deck.deal();
	    	 player2.add(card);
	     }	     
	    
	     for (pairs1 = 0; pairs1 < player1.size()-1; pairs1++)
	     {
	    	 if (player1.get(pairs1).getFaceName() == player1.get(pairs1+1).getFaceName())
	    	 {
	    		 spot1 = pairs1;
	    		 spot2 = pairs1 + 1;
	    		 
	    		 player1.remove(spot1);
	    		 player1.remove(spot2);
	    	 }
	     }	     
	     
	     resultP1 = "Player1's cards: " + player1;
	     JOptionPane.showMessageDialog (null, resultP1); 
	     System.out.println(player1);
	     
	     resultP2 = "Player2's cards: " + player2;
	     JOptionPane.showMessageDialog (null, resultP2); 
	     System.out.println(player2);
	     
	     ask = true;
	     ifFound = false;
	     
	     while (ask == true)
	     {
	    	 cardName = JOptionPane.showInputDialog("Ask player2 for a card in your hand: ");
	    	 ifFound = false;
	    	 ask = false;
	    	 
	    	 for (cycle1 = 0; cycle1 < player1.size(); cycle1++)
	    	 {
	    		 if (cardName.equals(player1.get(cycle1).getFaceName()))
	    		 {
	    			 ifFound = true;
	    			 spot1 = cycle1;
	    			 
	    		 }
	    	 }
	    	 
	    	 for (cycle2 = 0; cycle2 < player2.size(); cycle2++)
	    	 {
	    		 if (player1.get(spot1).getFaceName().equals(player2.get(cycle2).getFaceName()))
	    		 {
	    			 ifFound = true;	
	    			 spot2 = cycle2;
	    			 
	    		 }
	    		 	    		
	    	 }
	    	
	    	 if (ifFound)
	    	 {
	    		 player1.remove(spot1);
	    		 player2.remove(spot2);	    		 
	    		 points++;
	    		 ask = true;
	    	 }
	    	 else
	    	 {
	    		 notFound = "Card not found, go fish!";
	    		 JOptionPane.showMessageDialog(null, notFound);
	    		 card = deck.deal();
		    	 player1.add(card);
		    	
		    	 for (pairs1 = 0; pairs1 < player1.size()-1; pairs1++)
			     {
			    	 if (player1.get(pairs1).getFaceName() == player1.get(pairs1+1).getFaceName())
			    	 {
			    		 spot1 = pairs1;
			    		 spot2 = pairs1 + 1;
			    		 
			    		 player1.remove(spot1);
			    		 player1.remove(spot2);
			    	 }
			     }	    			    	 
	    	 }	    	
	     }
	     resultP1 = "Player1's cards: " + player1 + "\nPoints for Player1: " + points;
	     JOptionPane.showMessageDialog (null, resultP1); 
	     System.out.println(points);
	     
	     resultP2 = "Player2's cards: " + player2 + "\nPoints for Player2: " + points2;
	     JOptionPane.showMessageDialog (null, resultP2);
	     System.out.println(points2);
	     
	     resultP1 = "Player1's cards: " + player1;
	     JOptionPane.showMessageDialog (null, resultP1); 
	     System.out.println(player1);
	     
	     resultP2 = "Player2's cards: " + player2;
	     JOptionPane.showMessageDialog (null, resultP2); 
	     System.out.println(player2);
	}
}
