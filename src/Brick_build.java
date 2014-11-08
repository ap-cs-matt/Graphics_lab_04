import java.awt.*;

public class Brick_build 
{

	public static void  draw_building (Graphics g)
	{
		//outline
		//g.setColor(new Color(240,0,0));
		//g.fillRect(450, 350, 200, 250);	
	
		//bricks
	
		int i_1=0;
		int i_2=0;
	
		int red=0;
		int brick_x =400; 
		int brick_y=587; 
	 	
		while (i_1 <10)
		{
			while (i_2<20)
			{
			
				red = (int)(Math.random()*100)+140;
				g.setColor(new Color(red,0,0));
			
				g.fillRect(brick_x, brick_y, 25, 13);
			
				brick_y= brick_y-15;
				i_2++;		
			}
		
			i_2=0;
			brick_y=587;
			brick_x = brick_x+27;
			i_1 = i_1+1;
		
		}
	
	int i=0;
		
	int line_x=372;
	int line_y=600;
	
	int line_x2=372;
	int line_y2=300;
	
	
	g.setColor(new Color(20,20,20));
	
	//horizontal lines
		while (i<=10)
		{
			line_x=line_x+26;
			line_x2=line_x2+26;
			g.drawLine(line_x, line_y, line_x2, line_y2);
			
			line_x++;
			line_x2++;
			g.drawLine(line_x, line_y, line_x2, line_y2);
			
			
			i++;	
		}
		
		i=0; //reset lcv
			
		//verticle lines
		int line_x3=398;
		int line_y3=286;
		int line_x4=668;
		int line_y4=286;
		
		
		while(i<20)
		{
			line_y3= line_y3+14;
			line_y4= line_y4+14;
			g.drawLine(line_x3, line_y3, line_x4, line_y4);
			
			line_y3++;
			line_y4++;
			g.drawLine(line_x3, line_y3, line_x4, line_y4);
			
			i++;	
		}
		
		
		
	}

	public static void  draw_frame (Graphics g)
	{
		g.setColor(new Color(175,175,175));
		g.fillRect(387,280,295,320);
	}
	
	public static void  draw_windows (Graphics g)
	{
		//windows outline
		g.setColor(new Color(175,175,175));
		g.fillRect(425, 350, 75, 100);
		g.fillRect(568, 350, 75, 100);
		
		//window glass
		g.setColor(new Color(0,50,250));
		g.fillRect(433, 358, 59, 84);
		g.fillRect(576, 358, 59, 84);
		
		//window pane
			//verticle pane
			g.setColor(new Color(0,0,0));
			g.fillRect(461, 358, 5, 84);
			g.fillRect(604, 358, 5, 84);
			
			//horizontal pane
			g.setColor(new Color(0,0,0));
			g.fillRect(433, 398, 58, 5);
			g.fillRect(576, 398, 58, 5);
		
	}
	
	public static void  draw_door (Graphics g)
	{
		//door outline
		g.setColor(new Color(175,175,175));
		g.fillRect(496,500,75,100);
		
		//window on top
		g.fillArc(496,480,75,40,0,180);
			
		//glass part
		g.setColor(new Color(0,50,250));
		g.fillArc(502,484,63,35,0,180);
		
		//colored door
		g.setColor(new Color(120,50,0));
		g.fillRect(506,504,55,93);
		
		//doornob
		g.setColor(Color.black);
		g.fillOval(513,545,10,10);
		
	}
	
	public static void draw_light (Graphics g)
	{
		
		light(g,475,500,10,10,100,0);
		
		light(g,582,500,10,10,100,0);
		
		
		
	}

	public static void light(Graphics g,int lamp_x,int lamp_y,int lamp_width,int lamp_hieght,int alpha,int i)
	{
		
		while (i<10)
		{
			g.setColor(new Color(255,255,100,alpha));
			g.fillOval(lamp_x,lamp_y,lamp_width,lamp_hieght);
			
			lamp_x--;
			lamp_y--;
			lamp_width= lamp_width+2;
			lamp_hieght=lamp_hieght+2;
			
			alpha = alpha -10;
			
			
			
			i++;
		}
		// draw light frame
		i=0;			
		g.setColor(Color.black);
		int width=23;
		int hieght=23;
					while (i<4)
					{
						g.drawRect(lamp_x+3,lamp_y+3,width,hieght);
						lamp_x--;
						lamp_y--;
						width= width+2;
						hieght= hieght+2;
						i++;
					}
					
			
	}
	
	
}
