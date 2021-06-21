import javax.swing.*;

public class Test
{

    public static void main(String[] args) 
    {

    	/*
        //String[] options = {"abc", "def", "ghi", "jkl"};
        
        Integer[] options = {1, 3, 5, 7, 9, 11};
        //Double[] options = {3.141, 1.618};
        //Character[] options = {'a', 'b', 'c', 'd'};
        
        ImageIcon icon = new ImageIcon(Test.class.getResource("Toad.png"));
        
        int x = JOptionPane.showOptionDialog(null, "Toad wants you to click a button",
                "Toad has a demand",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, options[0]);
        System.out.println(x);
		*/
    	
    	 Binary ob = new Binary();
         
    	 int arr[] = {2,3,4,10,40};
         int n = arr.length;
         int x = 10;
         int result = ob.binarySearch(arr,0, n-1, x);
         
         if (result == -1)
             System.out.println("Element not present");
         else
             System.out.println("Element found at index "+result);
    }
}