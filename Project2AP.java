import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.*;

public class Project2AP 
{
	public static void main (String args[])
	   {
			ArrayList<String> prez = new ArrayList<String>();
			ArrayList<String> ID = new ArrayList<String>();
			
			prez.add("Adams, John 10-30-1735 02");
			prez.add("Bush, George 06-12-1924 41");
			prez.add("Jefferson, Thomas 04-13-1743 03");
			prez.add("Johnson, Andrew 12-29-1808 17");
			prez.add("Lincoln, Abraham 02-12-1809 16");
			prez.add("Nixon, Richard 01-09-1913 37");
			prez.add("Roosevelt, Franklin 01-30-1882 32");
			prez.add("Taft, William 09-15-1857 27");
			prez.add("Taylor, Zachary 11-24-1784 12"); 
			prez.add("Washington, George 02-22-1732 01");
			
			ID.add("JAdams021735");
			ID.add("GBush411924");
			ID.add("TJeffe031743");
			ID.add("AJohns171808");
			ID.add("ALincoln161809");
			ID.add("RNixon371913");
			ID.add("FRoose321882");
			ID.add("WTaft27271857");
			ID.add("ZTaylor121784"); 
			ID.add("GWashin011732");
			
			System.out.println(prez);
			
			String newPrez;	
			String newID;
			int cycle;
			int comp;
			boolean found = false;
			
			String last;
			String first;
			String year;
			String num;
			
			do
			{
				last = JOptionPane.showInputDialog("Enter a last name of a President: ");	
				first = JOptionPane.showInputDialog("Enter a first name of a President: ");	
				year = JOptionPane.showInputDialog("Enter the DOB of a President: (dd-mm--yyyy) ");	
				num = JOptionPane.showInputDialog("Enter the number of a Presidency: (xx) ");
							
				newPrez = last + ", " + first + " " + year + " " + num;	
				found = false;
			
				for(cycle = 0; cycle < prez.size(); cycle++)
				{
					comp = newPrez.compareTo(prez.get(cycle));
				
					if (comp == 0)
					{
						found = true;
						JOptionPane.showMessageDialog (null, "President is already in the list. Please enter another President.");  
						break;
					}
				}
				prez.add(newPrez);
			}
			while (found == true);
			
			String prezID = "";
			
			first.replaceAll(subtring(0,first.length()), substring(0));
			last = last.substring(0,4);
			year = year.substring(6, 10);
			
			prezID = first + last + num + year;
			
			System.out.println(prezID);
			
			Collections.sort(ID);
			Collections.sort(prez);
			
			StringBuilder builder = new StringBuilder("<html>"); 
			
			for (int i = 0; i < prez.size(); i++) 
			{
			    builder.append(prez.get(i));
			    builder.append("<br>");
			}
			builder.append("</html>");
			JOptionPane.showMessageDialog(null, builder.toString(), "Printing results", JOptionPane.INFORMATION_MESSAGE);
			
			for (int i = 0; i < ID.size(); i++) 
			{
			    builder.append(ID.get(i));
			    builder.append("<br>");
			}
			builder.append("</html>");
			JOptionPane.showMessageDialog(null, builder.toString(), "Printing results", JOptionPane.INFORMATION_MESSAGE);
	   }
}
