import java.util.ArrayList;
import java.util.Scanner;  

public class Project1AP 
{
	public static void main (String args[])
	   {
	     DeckOfCards deck = new DeckOfCards(); // Creates a deck
	     Card card = new Card(); // Creates a method header for Card class

	     ArrayList<Card> player1 = new ArrayList<Card>();  //Creates an array to store cards
	     ArrayList<Card> player2 = new ArrayList<Card>();  
	     ArrayList<Card> player3 = new ArrayList<Card>();
	     
	     int[] values = new int[13];
	     int[] values2 = new int[13];
	     int[] values3 = new int [13];
	     
	     ArrayList<Integer> suit1 = new ArrayList<Integer>();
	     ArrayList<Integer> suit2 = new ArrayList<Integer>();
	     ArrayList<Integer> suit3 = new ArrayList<Integer>();
	     
	     Scanner sc = new Scanner(System.in);
	     
	     deck.shuffle();
	     
	     int firstDeal;
	    
	     int face1;
	     int face2;
	     int face3;
	
	     int name1;
	     int name2;
	     int name3;
	    
	     for (firstDeal = 0; firstDeal < 13; firstDeal++) // Deals cards into the each players' hands
	     {
	    	 card = deck.deal();
	    	 face1 = card.getFace();
	    	 name1 = card.getSuit();
	    	 player1.add(card);   	
	    	 values[firstDeal] = face1;	   
	    	 suit1.add(name1);
	    	 
	    	 card = deck.deal();
	    	 face2 = card.getFace();
	    	 name2 = card.getSuit();
	    	 player2.add(card);
	    	 values2[firstDeal] = face2; 
	    	 suit2.add(name2);
	    	 
	    	 card = deck.deal();
	    	 face3 = card.getFace();
	    	 name3 = card.getSuit();
	    	 player3.add(card);
	    	 values3[firstDeal] = face3;
	    	 suit3.add(name3);
	     }
	     
	     // #4
	     
	     int sum1 = 0;
	     int sum2 = 0;
	     int sum3 = 0;
	     
	     for (int add = 0; add < 13; add++)
	     {
	    	 sum1 = values[add] + sum1;
	    	 sum2 = values2[add] + sum2;
	    	 sum3 = values3[add] + sum3;
	     }

	     System.out.println("The sum of player 1 is: " + sum1);
	     System.out.println("The sum of player 2 is: " + sum2);
	     System.out.println("The sum of player 3 is: " + sum3);
	     
	     if (sum1 > sum2)
	     {
	    	 if (sum1 > sum3)
	    	 {
	    		 System.out.println("Player1 has the highest sum with a whopping: " + sum1);
	    	 }
	    	 else
	    	 {
	    		 System.out.println("Player3 has the highest sum with a whopping: " + sum3);
	    	 }
	     }
	     else
	     {
	    	 if (sum2 > sum3)
	    	 {
	    		 System.out.println("Player2 has the highest sum with a whopping: " + sum2);
	    	 }
	    	 else
	    	 {
	    		 System.out.println("Player3 has the highest sum with a whopping: " + sum3);
	    	 }
	     }
	     // #5

	     System.out.print("\n");
	     
	     Suits blue = new Suits();
	     
	     int p1c = blue.bluescoos(suit1, 1);
	     int p1d = blue.bluescoos(suit1, 2);
	     int p1h = blue.bluescoos(suit1, 3);
	     int p1s = blue.bluescoos(suit1, 4);
	     
	     int p2c = blue.bluescoos(suit2, 1);
	     int p2d = blue.bluescoos(suit2, 2);
	     int p2h = blue.bluescoos(suit2, 3);
	     int p2s = blue.bluescoos(suit2, 4);
	     
	     int p3c = blue.bluescoos(suit3, 1);
	     int p3d = blue.bluescoos(suit3, 2);
	     int p3h = blue.bluescoos(suit3, 3);
	     int p3s = blue.bluescoos(suit3, 4);
	     
	     System.out.println("         C : D : H : S");
	     
	     System.out.println("Player1: " + p1c + "   " + p1d + "   " + p1h + "   " + p1s);
	     System.out.println("Player2: " + p2c + "   " + p2d + "   " + p2h + "   " + p2s);
	     System.out.println("Player3: " + p3c + "   " + p3d + "   " + p3h + "   " + p3s);
	     
	     System.out.print("\n");
	     
	     System.out.println(blue.bluesclues(suit1, suit2, suit3, 1) + " clubs!");
	     System.out.println(blue.bluesclues(suit1, suit2, suit3, 2) + " diamonds!");
	     System.out.println(blue.bluesclues(suit1, suit2, suit3, 3) + " hearts!");
	     System.out.println(blue.bluesclues(suit1, suit2, suit3, 4) + " spades!");
	     
	     // #6
	     
	     System.out.print("\n");
	     
	     int clubs = 13 - blue.bluesmoos(suit1, suit2, suit3, 1);
	     int diamonds = 13 - blue.bluesmoos(suit1, suit2, suit3, 2);
	     int hearts = 13 - blue.bluesmoos(suit1, suit2, suit3, 3);
	     int spades = 13 - blue.bluesmoos(suit1, suit2, suit3, 4);

	     System.out.println("The deck has: " + clubs + " clubs remaining!");
	     System.out.println("The deck has: " + diamonds + " diamonds remaining!");
	     System.out.println("The deck has: " + hearts + " hearts remaining!");
	     System.out.println("The deck has: " + spades + " spades remaining!");

}    
	
	
     public static class Suits
     {
    	 public String bluesclues (ArrayList<Integer> hand, ArrayList<Integer> hand2, ArrayList<Integer> hand3, int num)
    	 {
    		 int one = 0;
    		 int two = 0;
    		 int three = 0;
    
    		 for (int cycle = 0; cycle < hand.size(); cycle++)
    		 {
    			 if (hand.get(cycle).equals(num))
    			 {
    				 one++;
    			 }
    			 if (hand2.get(cycle).equals(num))
    			 {
    				 two++;
    			 }
    			 if (hand3.get(cycle).equals(num))
    			 {
    				 three++;
    			 }
    		 }
    		 if (one > two)
    		 {
    			 if (one > three)
    			 {
    				 return "Player1 has the most";
    			 }
    			 else
    			 {
    				 return "Player3 has the most";
    			 }
    		 }
    		 else
    		 {
    			 if (two > three)
    			 {
    				 return "Player2 has the most";
    			 }
    			 else
    			 {
    				 return "Player3 has the most";
    			 }
    		 }
    	 }
    	 public int bluesmoos(ArrayList<Integer> hand, ArrayList<Integer> hand2, ArrayList<Integer> hand3, int num)
    	 {
    		 int sum = 0;
    		    
    		 for (int cycle = 0; cycle < hand.size(); cycle++)
    		 {
    			 if (hand.get(cycle).equals(num))
    			 {
    				 sum++;
    			 }
    			 if (hand2.get(cycle).equals(num))
    			 {
    				 sum++;
    			 }
    			 if (hand3.get(cycle).equals(num))
    			 {
    				 sum++;
    			 }
    		 }
    		 
    		 return sum;
    	 }
    	 public int bluescoos(ArrayList<Integer> hand, int num)
    	 {
    		 int sum = 0;
    		 
    		 for (int cycle = 0; cycle < hand.size(); cycle++)
    		 {
    			 if (hand.get(cycle).equals(num))
    			 {
    				 sum++;
    			 }
    		 }
    		 
    		 return sum;
    	 }
     }
}

