import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Project9 
{
	public static void main (String[] args)
	   {		
		/*
		String title = "", resultT;
		resultT = "Prime Numbers - Javier Favela";
		JOptionPane.showMessageDialog (null, resultT);
		
		String list = "", resultL;
		resultL = "The first 50 prime numbers are:";
		JOptionPane.showMessageDialog (null, resultL);
	    */
		
		System.out.println("Prime Numbers - Javier Favela");
		System.out.println("The first 50 prime numbers are: ");
		
	   
		ArrayList<Integer> primeNum = new ArrayList<>();
		
	    int num = 0;
	    int check = 2;
        boolean prime;
	  
	    //for (num = 2; num < 230; num++) 
        while (num <= 230)
	    {
	    	prime = true;
	    	
	    	//System.out.println (num + " number inputed");
	        
	    	for (check = 2; check < num; check++) 
	        {
	    		//System.out.println (check + " check 1");
	            if (num % check == 0) 
	            {
	                prime = false;
	                //System.out.println (check + " check 2");
	                //System.out.println (prime + " prime");
	                break;
	            }
	        }
	        if (prime && num != 1 && num != 0) 
	        {
	        	//System.out.println (num + " saved");
	            primeNum.add(num);

	        }
	        num++;
	    }
        System.out.println(primeNum);
       
       }
}

