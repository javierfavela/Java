
import java.util.Scanner;
public class Project2 
	{
	public static void main(String[] args) {
	int highTemp;
	int lowTemp;
	
	Scanner scan = new Scanner(System.in);
	
	    String h = "Javier Favela's Program";
	    System.out.println(String.format("%1000s", h));
	
	System.out.print("Enter the low temperature: ");
	lowTemp = scan.nextInt();
	System.out.print("Enter the high temperature: ");
	highTemp = scan.nextInt();
	
	System.out.println("The low temperature is " +lowTemp);
	System.out.println("The high temperature is " + highTemp);
	
	int rangeTemp;
	double averageTemp;
	
	rangeTemp = highTemp - lowTemp;
	
	System.out.println("The temperature range for the day is " + rangeTemp + " degrees");
	
	averageTemp = ((double) highTemp + lowTemp) / 2;
	
	System.out.println("The average of the temperatures is " + averageTemp + " degrees");
	
	int quotient = highTemp / lowTemp;
	int remainder = highTemp % lowTemp;
	
	System.out.println("High temp / Low temp \"equals\" " + quotient);
	System.out.println("The remainder from the division is " + remainder);
	

}
	}