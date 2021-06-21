public class FunctionalDecomposition 
{
	/*
	 * Functional Decomposition is essentially the breaking down of a process
	 * into small steps. For example, making tea!
	*/
	public static void main(String[] args) 
	{
		String tea = getCup();
		System.out.println(tea);
		tea = puttingTea();
		System.out.println(tea);
		tea = boil();
		System.out.println(tea);
		tea = pour();
		System.out.println(tea);
		tea = tea(tea);
		System.out.println(tea);

	}
	public static String getCup()
	{
		return "You now have an empty cup";
	}
	public static String puttingTea()
	{
		return "There is a teabag in your cup";
	}
		
	public static String boil()
	{
		return "You have boiling water";
	}
	public static String pour()
	{
		return "You now poured boiling water in the cup with the teabag inside";
	}
	public static String tea(String tea)
	{
		if (tea.equals(pour()))
			return "Your empty cup now has a teabag with boiling water";
		else
			return null;
	}
}
