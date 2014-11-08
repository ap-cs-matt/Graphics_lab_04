import java.awt.Color;
import java.awt.Graphics;

public class Sky {

	public static void  draw_background(Graphics g)
	{
		g.setColor(new Color(0,87,155));
		g.fillRect(0,0,800,600);
	}
		
	public static void  draw_moon(Graphics g)
	{
		//outline
		g.setColor(new Color(247,247,247));
		g.fillArc(700,-100,200,200,180,90);
		
		//craters
		g.setColor(new Color(222,222,222));
		int i = 0;
		int crater_x = 0;
		int  crater_y = 0;
		int width=0; //diameter
		int height=0; //diameter
		
		while (i<15)
		{
			crater_x = (int)(Math.random()*55)+725;
			crater_y = (int)(Math.random()*55);
			width = (int)(Math.random()*15+5);
			height = (int)(Math.random()*15+5);
			g.fillOval(crater_x, crater_y, width, height);
				
			i++;
		}
		
	}
	
	public static void  draw_stars(Graphics g)
	{
		
		int i = 0;
		int star_x1 =0;
		int star_y1 =0;
		int star_x2 =0;
		int star_y2 =0;
		while (i<600)
		{
			//will draw line 2 pixels long
			g.setColor(new Color(222,222,222));
			star_x1 = (int)(Math.random()*800);
			star_x2 = star_x1+1;
			
			star_y1 = (int)(Math.random()*600);
			star_y2= star_y1+1;
			
			g.drawLine(star_x1,star_y1,star_x2,star_y2);
			i++;
		}
				
	}
	
	
	public static void  draw_cloud(Graphics g)
	{
		
		int i= 0;
		
		//cloud coordinates + width/height
		int cloud_width =0;
		int cloud_height =0;
		int cloud_x = 0;
		int cloud_y =0;
		
		//color variables
		int r1=240;
		int g1=240;
		int b1=240;
		int alpha=0;    //transparency value 
		
		while (i<90)
		{
			
			alpha = (int)(Math.random()*60)+40;
			g.setColor(new Color(r1,g1,b1,alpha));
			
			//far  right
			cloud_width = (int)(Math.random()*50);
			cloud_height = (int)(Math.random()*50);
			cloud_x = (int)(Math.random()*150)+500;
			cloud_y = (int)(Math.random()*50)+125;
			g.fillOval(cloud_x,cloud_y,cloud_width,cloud_height);
			
			//far left
			cloud_width = (int)(Math.random()*50);
			cloud_height = (int)(Math.random()*50);
			cloud_x = (int)(Math.random()*150)+10;
			cloud_y = (int)(Math.random()*50)+140;
			g.fillOval(cloud_x,cloud_y,cloud_width,cloud_height);
			
			//middle down
			cloud_width = (int)(Math.random()*50);
			cloud_height = (int)(Math.random()*50);
			cloud_x = (int)(Math.random()*160)+240;
			cloud_y = (int)(Math.random()*75)+250;
			g.fillOval(cloud_x,cloud_y,cloud_width,cloud_height);
			
			//middle uplong
			cloud_height = (int)(Math.random()*50);
			cloud_width = (int)(Math.random()*50);
			cloud_x = (int)(Math.random()*250)+180;
			cloud_y = (int)(Math.random()*50)+50;
			g.fillOval(cloud_x,cloud_y,cloud_width,cloud_height);
			
			i++;
		}
		
	}
}
