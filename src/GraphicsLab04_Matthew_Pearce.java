import java.applet.Applet;
import java.awt.*;


public class GraphicsLab04_Matthew_Pearce extends Applet {
	//testing github
	//testing sync speeds
	public void paint(Graphics g)
	{
	
			Antialiasing.apply_antialiasing(g); 
		
		//outline
			g.drawRect(0, 0, 800, 650);
		
		//-----------Sky-----------//
			Sky.draw_background(g);
			Sky.draw_moon(g);
			Sky.draw_stars(g);	
		//-----------End Sky------//
				
		//-------Draw Skyscraper--------//
			Skyscraper.draw_building(g);
			Skyscraper.draw_windows(g);
			Skyscraper.draw_celltower(g);
			Skyscraper.draw_door(g);
		//-------End Draw Skyscraper----//
		
		//-------Brick building-------//
			Brick_build.draw_frame(g);
			Brick_build.draw_building(g);
			Brick_build.draw_windows(g);
			Brick_build.draw_door(g);
			Brick_build.draw_light(g);
		//-------End Brick Building-----//
			
		//-----Clouds----------//
			Sky.draw_cloud(g);
		//------End Clouds-----//
			
			Sidewalk.draw_sidewalk(g);
		
		
		
		
	}
}

	
	
	