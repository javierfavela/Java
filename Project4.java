import javax.swing.JOptionPane;

public class Project4 
{
	public static void main(String[] args) 
	{
		String n = "", resultN;
		resultN = "Coin Counting - Javier Favela";
		
		JOptionPane.showMessageDialog (null, resultN);
		
		String currentStr = "", resultCurrent;
		int current = 0;
		
		currentStr = JOptionPane.showInputDialog("Enter an amount of dollars and cents: ");   
        
        current = Integer.parseInt(currentStr);

        resultCurrent = "Amount of dollars and cents " + current;
        
        JOptionPane.showMessageDialog (null, resultCurrent); 
        
        String twentyStr = "", resultTwenty;
        int twenty = current / 2000;
        
        resultTwenty = "Amount of twenty dollar bills recieved is " + twenty;
        JOptionPane.showMessageDialog (null, resultTwenty); 
        
        current = current % 2000;
       
        String tenStr = "", resultTen;
        int ten = current / 1000;
        
        resultTen = "Amount of ten dollar bills recieved is " + ten;
        JOptionPane.showMessageDialog (null, resultTen); 
        
        current = current % 1000;
        
        String fiveStr = "", resultFive;
        int five = current / 500;
        
        resultFive = "Amount of five dollar bills recieved is " + ten;
        JOptionPane.showMessageDialog (null, resultFive); 
        
        current = current % 500;
        
        String oneStr = "", resultOne;
        int one = current / 100;
        
        resultOne = "Amount of one dollar bills recieved is " + one;
        JOptionPane.showMessageDialog (null, resultOne); 
        
        current = current % 100;
        
        String quartStr = "", resultQuart;
        int quart = current / 25;
        
        resultQuart = "Amount of quarters recieved is " + quart;
        JOptionPane.showMessageDialog (null, resultQuart); 
        
        current = current % 25;
        
        String diStr = "", resultDi;
        int di = current / 10;
        
        resultDi = "Amount of dimes recieved is " + di;
        JOptionPane.showMessageDialog (null, resultDi); 
        
        current = current % 10;
        
        String nicStr = "", resultNic;
        int nic = current / 5;
        
        resultNic = "Amount of nickles recieved is " + nic;
        JOptionPane.showMessageDialog (null, resultNic); 
        
        current = current % 5;
        
        String penStr = "", resultPen;
        int pen = current / 1;
        
        resultPen = "Amount of pennies recieved is " + pen;
        JOptionPane.showMessageDialog (null, resultPen); 
        
        
     
	    
	    
	}
}
