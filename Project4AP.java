
public class Project4AP 
{	
	public static void main (String args[])
	{
		int result;
		Incursion fourteen = new Incursion();
		result = fourteen.mystery(0, fourteen.arr.length - 1, 4);
		System.out.println(result);
		
		Incursion ten = new Incursion();
		ten.mystery(1234);
		System.out.println("\n");
		
		Dog fido = new UnderDog();
		fido.act();
		
	}

	public static class Incursion
	{
		private int[]arr = {0, 1, 2, 3, 4,};
	
		public int mystery(int low, int high, int num)
		{
			int mid = (low + high) / 2;
		
			if (low > high)
			{
				return low;
			}
			else
			{
				if (arr[mid] < num)
				{
					return mystery(mid + 1, high, num);
				}
				else
				{
					if (arr[mid] > num)
					{
						return mystery(low, mid - 1, num);
					}
					else //arr[mid] == num
					{
						return mid;
					}
				}
			}
		}
		public void mystery(int x)
		{
			System.out.print(x % 10);
			if ((x / 10) != 0)
			{
				mystery(x / 10);
			}
			System.out.print(x % 10);
		}
	}
	public static class Dog
	{
		public void act()
		{
			System.out.print("run ");
			eat();
		}
		public void eat()
		{
			System.out.print("eat ");
		}
	}
	public static class UnderDog extends Dog
	{
		public void act()
		{
			super.act();
			System.out.println("sleep ");
		}
		public void eat()
		{
			super.eat();
			System.out.print("bark ");
		}
	}
	
}
