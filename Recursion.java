
public class Recursion 
{
	public int factorial(int num)
	{
		int end = 0;
		 
		if (num == 0 || num == 1)
		{
			end = 1;				
		}
		else
		{
			end = num * factorial(num - 1);

		}
		return end;
	}
}
