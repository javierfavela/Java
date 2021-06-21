import java.util.Random;

public class FavelaQ1 
{
	c
	   {
		int [] matrix = new int[10];			
		Random rand = new Random();
		int x, total;
		double average;
		int count = 0;
		int sum = 0;
		
		System.out.print("The orignal array: ");
		
		for (x = 0; x < matrix.length; x++)
		{
			matrix[x] = rand.nextInt(100) + 1;
			System.out.print(matrix[x] + " ");						
		}
		
		System.out.print("\n" +  "Value less than or equal to 30: ");
		
		for (x = 0; x < matrix.length; x++)
		{
			if (matrix[x] <=30)
			{
				count++;
			}
		}	
		
		System.out.print(count + " values");
		
		//for (int i : matrix)
		//{
		//	sum+=i;
		//}
		int i;
		for (i = 0; i < matrix.length; i++)
		{
			sum = sum + matrix[i];
		}
		
		total = (int) sum;	
		average = (double) total/matrix.length;
		
		System.out.println("\n" + "The average value of the array is: " + average);
	   }
}
