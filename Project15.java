
public class Project15 
{
	 public static void main (String[] args)
	   {
		int [][] matrix = new int[][]				 
		{
		            {0,1,2,3},
		            {4,5,6,7},
		            {8,9,10,11}

		 };
		int matrixRow;
		int matrixCol;	
		int x = 0;
	
		
		System.out.println("The original array is: ");
		
		for (matrixRow = x ;matrixRow < matrix.length; matrixRow++)
		{
			
			for (matrixCol = x; matrixCol < matrix[matrixRow].length; matrixCol++)
			{				
				System.out.print( matrix[matrixRow][matrixCol] + " "); 
			}
			System.out.println("");
			
		}
		
		System.out.print("\n");
		
		System.out.println("The updated array is: ");
		
		for (matrixRow = x; matrixRow < matrix.length; matrixRow++)
		{
			for (matrixCol = x; matrixCol < matrix[matrixRow].length; matrixCol++)
			{			
				matrix[matrixRow][matrixCol] = matrix[matrixRow][matrixCol] + 10;
				
				System.out.print( matrix[matrixRow][matrixCol] + " "); 
			}	
			System.out.println("");
		}
		
		System.out.print("\n");
		
		System.out.println("The array in reverse order is: ");
		
		for (matrixRow = matrix.length - 1; matrixRow >= x; matrixRow--)			
		{	
			
			
			for (matrixCol = matrix[matrixRow].length -1 ; matrixCol >= x; matrixCol--)
			{
				System.out.print( matrix[matrixRow][matrixCol] + " "); 				
				
			}
			System.out.println("");
		}
		
		 
	   }
}
