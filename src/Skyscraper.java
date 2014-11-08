import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

class Skyscraper
		{
			public static void  draw_building(Graphics g)
			{
				g.setColor(new Color(110,116,117));
				g.fillRect(100,100,200,500);
			}
					
			public static void  draw_windows (Graphics g)
			{
				int i_1=0;
				int i_2=0;// lcv 
				int st_windowx = 125;  // starting x coordinate of windows
				int st_windowy=125;	// starting y coordinate of windows 
				
			
				//g.setColor(new Color(255,255,0));
				
				while (i_1<2)
				{
					while (i_2 < 5)
					{
						g.setColor(new Color(255,255,100));
						
						g.fillRect(st_windowx,st_windowy,50,50);
						st_windowy=(st_windowy+80);
						
						
						i_2++;
					}
					st_windowy=125;
					i_2=0;
					st_windowx= st_windowx+100;
					
					i_1++;
				}
				
			}
				
			public static void  draw_door(Graphics g) 
			{
				g.setColor(new Color(181,181,181)); //Color of outline
				
				g.fillRect(162, 525, 75, 75);// draw outline
				
				
				g.setColor(new Color(0,0,0)); //glass color
				g.fillRect(167,530,65,65); // draw glass
				
				
				
				g.setColor(new Color(181,181,181)); // 
				g.fillRect(162,562,75,5);// horizontal handle
				g.fillRect(197,525,5,75); // verticle handle 
			}
			
			public static void  draw_celltower(Graphics g)
			{
				//right diagonal
				g.setColor(new Color(181,181,181));
				
				int i = 0; //lopp counter
				int cell_bx2 = 110; //point of intersection with building
					
				while (i<5)
					{
						g.drawLine(158, 23, cell_bx2, 100); //drawing right diagonal line 
					
						cell_bx2++;
						i++;
					}
				
				//left diagonal
				i =0; //reseting lcv
				
				cell_bx2 = 196; //point of intersection with building
				while (i<5)
				{
					g.drawLine(158, 23, cell_bx2, 100);
				
					cell_bx2++;
					i++;
				}

				// beams

				Polygon top_beam = new Polygon();
				top_beam.addPoint(135,60);
				top_beam.addPoint(133,65);
				top_beam.addPoint(180,65);
				top_beam.addPoint(177,60);
				
				g.fillPolygon(top_beam);
				
				Polygon low_beam = new Polygon();
				low_beam.addPoint(122,80);
				low_beam.addPoint(122,85);
				low_beam.addPoint(189,85);
				low_beam.addPoint(189,80);
				
				g.fillPolygon(low_beam);

				
				//circle
				g.setColor(Color.red);
				g.fillOval(150,20,17,17);
				
			}
		
		}