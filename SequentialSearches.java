import java.util.*;

public class SequentialSearches 
{
	private static ArrayList<Integer> keys = new ArrayList<Integer>();
	
	public static void main(String[] args) 
	{
		for (int x = 0; x < 5; x++)
		{
			keys.add(x + 1);
		}
		System.out.println(keys);
		
		int door = 3; 
		
		int found = search(keys, door);
		
		System.out.println("Key #" + found +" fits the door!");
		
	}

	public static int search(ArrayList numbers, int correct)
	{
		 for (int index = 0; index < numbers.size(); index++)
	      {
	           if (numbers.get(index).equals(correct)) 
	           {
	        	   return index + 1;
	           }
	      }
		 return -1;
	}
}
