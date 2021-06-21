import javax.swing.JOptionPane;

public class Project12 
{
	public static void main (String[] args)
	{	
		String test = "Testing";
		String result = "";
		
		result = "The length of the word, testing is: " + test.length();
		JOptionPane.showMessageDialog (null, result);  
		result = "The word \"testing\" capitalized: " + test.toUpperCase();
		JOptionPane.showMessageDialog (null, result);  
		result = "Additional words added to the word \"testing\": " + test.concat(" - This Bob Ross and this is my PAWN SHOP");
		JOptionPane.showMessageDialog (null, result);  
		result = "-ing is removed from  the word \"testing\": " + test.substring(0, 4);
		JOptionPane.showMessageDialog (null, result);  
		result = "-ing is the only thing printed from the word \"testing\": " + test.substring(4);
		JOptionPane.showMessageDialog (null, result);  
		result = "Replaces the word \"test\" with \"work\": " + test.replace("Test", "Work");
		JOptionPane.showMessageDialog (null, result);  
		result = "Printing out the first letter in the word \"testing\": " + "" + test.charAt(0);
		JOptionPane.showMessageDialog (null, result);  
	}
}
