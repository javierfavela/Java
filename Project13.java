
import java.util.ArrayList;

public class Project13
{
   //-----------------------------------------------------------------
   //  Stores and modifies a list of band members.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      ArrayList band = new ArrayList();

      band.add ("Paul");
      band.add ("Pete");
      band.add ("John");
      band.add("Yoko");
      band.add ("George");
      band.add ("Javier");
      
      System.out.println (band);
      band.remove("Yoko");

      System.out.println (band);

      //int location = band.indexOf ("Pete");
      //band.remove (location);

      System.out.println (band);
      System.out.println ("At index 1: " + band.get(1));
      
      band.add ("Paul");
      System.out.println (band);

      int location = band.indexOf("Paul");
      System.out.println ("At index " + location + " for the name of Paul");
      
      boolean found = true;
      found = band.contains("Javier");
      System.out.println ("True if \"Javier\" is found, false if \"Javier\" is not found: " + found);
      
      found = band.contains("Mary");
      System.out.println ("True if \"Mary\" is found, false if \"Mary\" is not found: " + found);
      
      System.out.println ("Size of the band: " + band.size());
      
      band.add(3, "Mary");
      System.out.println (band);
      
      boolean empty = true;
      empty = band.isEmpty();
      System.out.println ("True if band is empty, false if band is not empty: " + empty);
      
      band.clear();
      empty = band.isEmpty();
      System.out.println ("True if band is empty, false if band is not empty: " + empty);
      
      
   }
}
