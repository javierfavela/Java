import java.util.*;

public class Project5AP 
{

	public static void main(String[] args) 
	{
		int[][] bofa = new int[10][10];
		int[] sum = new int [bofa.length];
		
		int matrixRow;
		int matrixCol;		
		Random num = new Random();
		
		
		System.out.println("The 2D array: ");
		
		for (matrixRow = 0; matrixRow < bofa.length; matrixRow++)
		{
			for (matrixCol = 0; matrixCol < bofa[matrixRow].length; matrixCol++)
			{				
				
				bofa[matrixRow][matrixCol] = num.nextInt(89) + 10;
				System.out.print(bofa[matrixRow][matrixCol] + " "); 
			}
			System.out.println("");
		}
		
		System.out.print("\n");
		
		System.out.println("The 2D array with evens multiplied: ");

		for (matrixRow = 0; matrixRow < bofa.length; matrixRow++)
		{
			for (matrixCol = 0; matrixCol < bofa[matrixRow].length; matrixCol++)
			{				
				
				if (bofa[matrixRow][matrixCol] % 2 == 0)
				{
					bofa[matrixRow][matrixCol] = bofa[matrixRow][matrixCol] * 2;
				}
				else
				{}
				if (bofa[matrixRow][matrixCol] % 10 == 0)
				{
					bofa[matrixRow][matrixCol] = bofa[matrixRow][matrixCol] / 10;
				}
				else
				{}
				if (bofa[matrixRow][matrixCol] == 59)
				{
					bofa[matrixRow][matrixCol] = 99;
				}
				else
				{}
				System.out.print(bofa[matrixRow][matrixCol] + " "); 
			}
			System.out.println("");
		}
		
		int ph = 0;
		int x = 0;
		int y = 0;
		int stor;
		int stor2;
		
		System.out.print("\n");
		
		while (y < bofa.length)
		{
			while (ph < bofa.length - 1)
			{
				while (x < bofa.length)
				{
					if (bofa[y][ph] <= bofa[y][x])
					{	
		
					}
					else
					{
						stor = bofa[y][ph];
						stor2 = bofa[y][x];
						bofa[y][ph] = stor2;
						bofa[y][x] = stor;
					
					}							
					x++;
				}
				ph++;
				x = ph + 1;
			}
			ph = 0;
			x = 0;
			y++;
		}
		System.out.print("\n");
		
		System.out.println("The 2D array sorted: ");
		
		for (matrixRow = 0; matrixRow < bofa.length; matrixRow++)
		{
			for (matrixCol = 0; matrixCol < bofa[matrixRow].length; matrixCol++)
			{				
				System.out.print(bofa[matrixRow][matrixCol] + " "); 
			}
			System.out.println("");
		}
		
		int total = 0;
		int i = 0;
		
		System.out.print("\n");
		
		for (matrixCol = 0; matrixCol < bofa.length; matrixCol++)
		{				
			for (matrixRow = 0; matrixRow < bofa.length; matrixRow++)
			{
				total = total + bofa[matrixRow][matrixCol];
			}
			sum[i] = total;
			total = 0;
			i++;
		}
		for (x = 0; x < sum.length; x++)
		{
			System.out.print(sum[x] + " ");
		}

		
	}
}
