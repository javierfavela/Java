import java.util.ArrayList;

public class CrazyEights 
{

	public static void main(String[] args) 
	{
		DeckOfCards deck = new DeckOfCards();
		Card card = new Card();
		
		ArrayList<Card> player1 = new ArrayList<Card>(); 
	    ArrayList<Card> player2 = new ArrayList<Card>(); 
	    
	    deck.shuffle();
	    int points1 = 0, points2 = 0; 
	    boolean game = true;
	    
	    for (int deal = 0; deal < 7; deal++) 
	    {
	    	card = deck.deal();
	    	player1.add(card);   	
	    	
	    	card = deck.deal();
	    	player2.add(card);
	    }
	    
	    ArrayList<String> rank1 = getRanks(player1); 
	    ArrayList<String> rank2 = getRanks(player2);  
	    
	    ArrayList<String> suit1 = getSuits(player1); 
	    ArrayList<String> suit2 = getSuits(player2);  
	     
	    System.out.println(rank1);
	    System.out.println(suit1);
	    System.out.println(rank2);
	    System.out.println(suit2);
	        
	    
	    while (game)
	    {
	    	card = deck.deal();
	    	Card discard = card;
	    }
	    
	}
	public static ArrayList<String> getRanks(ArrayList<Card> values)
	{
		ArrayList<String> ranks = new  ArrayList<String>();
		
		for(int x = 0; x < values.size(); x++)
		{
			ranks.add(values.get(x).getFaceName());
		}
		
		return ranks;
	}
	public static ArrayList<String> getSuits(ArrayList<Card> values)
	{
		ArrayList<String> suits = new  ArrayList<String>();
		
		for(int x = 0; x < values.size(); x++)
		{
			suits.add(values.get(x).getSuitName());
		}
		
		return suits;
	}
	

}
