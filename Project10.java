import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Project10 
{
	public static void main (String[] args)
	   {				
		
		System.out.println("Prime Numbers - Javier Favela");
		System.out.println("The first 50 prime numbers are: ");
		
	   
		//ArrayList<Integer> primeNum = new ArrayList<>();
		
	    int num = 0;
	    int check = 2;
        boolean prime;
    	int []primeNum = new int[50];
    	int primeCount = 0;
    	
    	while (primeCount < 50)
    	{

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
    	            //primeNum.add(num);
    	        	
    	            	primeNum[primeCount] = num;
    	            	System.out.print(primeNum[primeCount] + " ");
    	        }
    	        num++;
    	    }
            primeCount++;
    	}
    	
       
       }
}

