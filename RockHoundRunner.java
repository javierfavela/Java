
import info.gridworld.actor.ActorWorld;
import java.awt.*;
import javax.swing.JOptionPane;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;


public class RockHoundRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        int num =  (int) (Math.random() * 7);
        int num2 =  (int) (Math.random() * 7);
        boolean game = true;
        boolean diff = false;
        
        BoundedGrid bound = new BoundedGrid(7,7);
        world.setGrid(bound);     
   
        while (diff == false)
        {
        	if (num2 == num)
        	{
        		num2 = (int) (Math.random() * 7);
        	}
        	else
        	{
        		diff = true;
        	}
        	
        }
        
       
            world.show();
            world.add(new Location(0, num), new ConnectFourBug());
            world.show();
            world.step();
     
            world.add(new Location(0,  num2), new ConnectFourBug());
            world.show();
            world.step();
           
        
           
       

        
    }
}