
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;

public class ConnectFourBug extends Bug
{
	private static Color RED = Color.red;
	private static Color BLUE = Color.blue;
	private static int change = 0;
	private static Bug reggie;
	private static int row = 6;


	public ConnectFourBug()
	{
		setDirection(180);
		
		if (change == 0)
		{
			 setColor(RED);
			 change++;
		}
		else
		{
			setColor(BLUE);
			change--;
		}
		
		if (canMove())
		{
			move();
		}
		else
		{
			turn();
		}
	}
	
	public void move()
    {
     
		Grid<Actor> gr = getGrid();
        if (gr == null)
        {
        	return;
        }
        
        Location loc = getLocation();
        
        int col = loc.getCol();
  
        Location loc2 = new Location(row,col);
        
        if (gr.isValid(loc2))
        {
             reggie = (Bug) gr.get(loc2);
        
             if (reggie instanceof ConnectFourBug)
             {
            	 row--;
             }
             else
             {
            	 moveTo(loc2);  
            	 row = 6;
             }
   
        } 
        
    }
	public void turn()
	{}
	
	
}
