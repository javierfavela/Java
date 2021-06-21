
public class Project14 
{
	public static void main (String[] args)
	{
		int [] numArray = {10, 30 , 5, 25, 123, 12, 44, 16, 60, 200, 12, 20};
		int ph = 0; 
		int x = 0;
		int stor;
		int stor2;
		int printing;
		
		System.out.print("Initial array Values --- ");
		
		for (printing = 0; printing < numArray.length; printing++)
		{
			System.out.print(numArray[printing] + " ");
		}
		System.out.println();
		
		while (ph < numArray.length - 1)
		{
			while (x < numArray.length)
			{
				if (numArray[ph] <= numArray[x])
				{	
					//System.out.println(numArray[ph] + " less than " + numArray[x]);
				}
				else
				{
					//System.out.println(numArray[ph] + " greater than " + numArray[x]);
					
					stor = numArray[ph];
					stor2 = numArray[x];
					numArray[ph] = stor2;
					numArray[x] = stor; 				
				}			
				x++;
			}
			ph++;
			x = ph + 1;
			
		}
	
		System.out.print("Sorted Values --- ");
		
		for (printing = 0; printing < numArray.length; printing++)
		{
			System.out.print(numArray[printing] + " ");
		}		
	}
}
