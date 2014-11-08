import java.awt.*;

public class Sidewalk 
{

	public static void draw_sidewalk (Graphics g)
		{
			//sidewalk outline
			g.setColor(new Color(200,175,175));
			g.fillRect(0,600,800,50);
			
			//sidewalk lines
			
			int i=0;
			int k=0;
			int break_x=50;
			int break_y=600;
			
			g.setColor(new Color(50,50,50));
			
			while (i<14)
			{
				
				while (k<3)
				{
					
					g.drawLine(break_x,break_y,break_x,break_y+50);
					
					break_x++;
					
					k++;
				}
				
				break_x= break_x+50;
				k=0;
				
				i++;
			}
		}
	
}
