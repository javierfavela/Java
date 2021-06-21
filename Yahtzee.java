import java.util.Arrays;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Yahtzee 
{
	static ImageIcon mario = new ImageIcon(Test.class.getResource("Mario.png"));
	static ImageIcon luigi = new ImageIcon(Test.class.getResource("Luigi.png"));
	
	public static void main (String[] args)
	   {
			Die die;		
		
			
			ArrayList<Integer> b1 = new ArrayList<Integer>();
			ArrayList<Integer> b2 = new ArrayList<Integer>();
			
			die = new Die();
			
			
			for (int n = 0; n < 6; n++) //Creates the basic combination to assist methods
			{
				b1.add(n + 1);
				b2.add(n + 1);
			}
		
			int points1 = 0;
			int points2 = 0;
			
			
			int[] numrolls1 = new int[5];
			int[] numrolls2 = new int[5]; 
			
			boolean game, roll1, roll2;
			String player1, player2;
			
			game = true;
			roll1 = true;
			roll2 = true;
			
			player1 = JOptionPane.showInputDialog("Enter name of Player1: "); //Enters name of Players
			JOptionPane.showMessageDialog(null, "Player1: " + player1);
			
			player2 = JOptionPane.showInputDialog("Enter name of Player2: ");
			JOptionPane.showMessageDialog(null, "PLayer2: " + player2);
	        	
			while (game)
			{		
				Integer[] basic1 = new Integer[b1.size()];
				Integer[] basic2 = new Integer[b2.size()];
				
				for (int num = 0; num < b1.size(); num++)
				{
					basic1[num] = b1.get(num);
				}
				
				for (int num = 0; num < b2.size(); num++)
				{
					basic2[num] = b2.get(num);
				}
				
				//Player1's Turn
				while (roll1)
				{
					
					for (int x = 0; x < 5; x++) //Fills hand with number of die rolled
					{
						die.roll();
						numrolls1[x] = die.getFaceValue();	
					}
					
					JOptionPane.showMessageDialog(null, player1 + "'s rolls are: " + Arrays.toString(numrolls1));
					System.out.println(player1 + "'s rolls are: " + Arrays.toString(numrolls1));
		
					
					int ask = JOptionPane.showConfirmDialog(null, "Would you like to roll any?"); //Asks user if wants to roll any
					
					if (ask == JOptionPane.YES_OPTION) //if yes, roll certain ones
					{
						
						for (int i = 0; i < 5; i ++)
						{
							int reRoll = JOptionPane.showConfirmDialog(null, "Would you like to reroll #" + (i + 1) + "?", null, JOptionPane.YES_NO_OPTION);
							
							if (reRoll == JOptionPane.YES_OPTION)
							{
								die.roll();
								numrolls1[i] = die.getFaceValue();
							}
						}
					
			
						JOptionPane.showMessageDialog(null, player1 + "'s rolls are: " + Arrays.toString(numrolls1));
						System.out.println(player1 + "'s rolls are: " + Arrays.toString(numrolls1));
						
						ask = JOptionPane.showConfirmDialog(null, "Would you like to roll for the second time?"); //Asks to reroll for the second time
						
						if (ask == JOptionPane.YES_OPTION)
						{
							for (int i = 0; i < 5; i ++)
							{
								int reRoll = JOptionPane.showConfirmDialog(null, "Would you like to reroll #" + (i + 1) + "?", null, JOptionPane.YES_NO_OPTION);
								
								if (reRoll == JOptionPane.YES_OPTION)
								{
									die.roll();
									numrolls1[i] = die.getFaceValue();
								}
								else{}
								
							}
							JOptionPane.showMessageDialog(null,player1 + "'s rolls are:" + Arrays.toString(numrolls1));
							System.out.println(player1 + "'s rolls are: " + Arrays.toString(numrolls1));
							
							
							
							JOptionPane.showMessageDialog(null, player1 + "'s points are: " + points1 + "\n" + player2 + "'s points are: " + points2);
						}
						else //if none is rolled again, asks user if wants to use any of the basic combinations
						{
							points1 = points1 + basicComb1(numrolls1, basic1, b1);
							JOptionPane.showMessageDialog(null, player1 + "'s points are: " + points1 + "\n" + player2 + "'s points are: " + points2);
						}
						
						
						
					} 
					else //if none is rolled again, asks user if wants to use any of the basic combinations
					{
						points1 = points1 + basicComb1(numrolls1, basic1, b1);
						JOptionPane.showMessageDialog(null, player1 + "'s points are: " + points1 + "\n" + player2 + "'s points are: " + points2);
					}

					roll1 = false;
				}
				
				//Player2's Turn
				
				while (roll2)
				{
					
					for (int x = 0; x < 5; x++) //Fills Player2's hand with number die
					{
						die.roll();
						numrolls2[x] = die.getFaceValue();	
					}
					
					JOptionPane.showMessageDialog(null, player2 + "'s rolls are: " + Arrays.toString(numrolls2)); //Shows rolls
					System.out.println(player2 + "'s rolls are: " + Arrays.toString(numrolls2));					
					
					int ask = JOptionPane.showConfirmDialog(null, "Would you like to roll any?"); //Asks if user wants to reroll certain ones
					
					if (ask == JOptionPane.YES_OPTION) //If yes, roll again
					{
						
						for (int i = 0; i < 5; i ++)
						{
							int reRoll = JOptionPane.showConfirmDialog(null, "Would you like to reroll #" + (i + 1) + "?", null, JOptionPane.YES_NO_OPTION);
							
							if (reRoll == JOptionPane.YES_OPTION)
							{
								die.roll();
								numrolls2[i] = die.getFaceValue();
							}
						}
					
			
						JOptionPane.showMessageDialog(null, player2 + "'s rolls are: " + Arrays.toString(numrolls2));
						System.out.println(player2 + "'s rolls are: " + Arrays.toString(numrolls2));
						
						ask = JOptionPane.showConfirmDialog(null, "Would you like to roll for the second time?");
						
						if (ask == JOptionPane.YES_OPTION)
						{
							for (int i = 0; i < 5; i ++)
							{
								int reRoll = JOptionPane.showConfirmDialog(null, "Would you like to reroll #" + (i + 1) + "?", null, JOptionPane.YES_NO_OPTION);
								
								if (reRoll == JOptionPane.YES_OPTION)
								{
									die.roll();
									numrolls2[i] = die.getFaceValue();
								}
								else{}
								
							}
							JOptionPane.showMessageDialog(null,player2 + "'s rolls are:" + Arrays.toString(numrolls2));
							System.out.println(player2 + "'s rolls are: " + Arrays.toString(numrolls2));
							
							points2 = points2 + basicComb2(numrolls2, basic2);

							JOptionPane.showMessageDialog(null, player1 + "'s points are: " + points1 + "\n" + player2 + "'s points are: " + points2);
							
						}
						else
						{
							points2 = points2 + basicComb2(numrolls2, basic2);

							JOptionPane.showMessageDialog(null, player1 + "'s points are: " + points1 + "\n" + player2 + "'s points are: " + points2);
						}
						
						
						
					}
					else //If none is rerolled, asks for basic combos
					{
						points2 = points2 + basicComb2(numrolls2, basic2);

						JOptionPane.showMessageDialog(null, player1 + "'s points are: " + points1 + "\n" + player2 + "'s points are: " + points2);
					}

					roll2 = false;
				}
			
				if (basic1.equals(0) == true && basic2.equals(0) == true)
				{
					game = false;
				}
				else
				{
					roll1 = true;
					roll2 = true;
				}
			}
			
	   }
	
	public static int basicComb1(int[] nr, Integer[] array, ArrayList<Integer> refresh) //Method that allows Player1 to choose a basic combo and then removes the option later
	{
		int sum = 0;

		
		int check = JOptionPane.showOptionDialog(null, "Choose which basic combination you would like to use",
		            "Basic Combinations",
		            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, mario, array, array[0]);
		
		for (int i = 0; i < 5; i++)
		{
			if (nr[i] == array[check])
			{
				sum = sum + nr[i];
			}
		}
		
		for (int x = 0; x < array.length; x++)
		{
			refresh.add(array[x]);
		}
		
		refresh.remove(check);
		array = new Integer[refresh.size()];

		
		for (int y = 0; y < refresh.size(); y++)
		{
			array[y] = refresh.get(y);
		}

		return sum; //Adds to Player1's points
		
		
	}
	public static int basicComb2(int[] nr2, Integer[]array2) //Method that allows Player2 to choose a basic combo and then removes the option later
	{
		int sum = 0;
		
		ArrayList<Integer> refresh = new ArrayList<Integer>();
		
		int check = JOptionPane.showOptionDialog(null, "Choose which basic combination you would like to use",
	            "Basic Combinations",
	            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, luigi, array2, array2[0]);
	
		for (int i = 0; i < 5; i++)
		{
			if (nr2[i] == array2[check])
			{
				sum = sum + nr2[i];
			}
		}
		
		for (int x = 0; x < array2.length; x++)
		{
			refresh.add(array2[x]);
		}
		
		refresh.remove(check);
		array2 = new Integer[refresh.size()];
		
		
		for (int y = 0; y < refresh.size(); y++)
		{
			array2[y] = refresh.get(y);
		}
		
		return sum; //Adds to Player2's points
	}
}
