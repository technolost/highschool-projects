import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

class SnowFlakePanel extends JPanel
{
	public SnowFlakePanel()
	{
		super.setPreferredSize(new Dimension(400, 400));
		super.setBackground(Color.WHITE);
	}

	public void paintComponent(Graphics g)
	{
		int width  = getWidth();
		int height = getHeight();
		int center_x = getWidth()/2;
		int center_y = getHeight()/2;
		super.paintComponent(g);

		/*
		 * DRAWING CODE BELOW
		 */
		g.setColor(Color.BLUE);
		//g.drawLine(0, 0, width/2 - 1, height - 1);
		drawStar(g,center_x, center_y, width/3);
//		for(int i=0; i<(int)(Math.random()*200000000);i++)
//		{
//			g.setColor(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
//			drawStar(g, (int)(Math.random()*width), (int)(Math.random()*height), (int)(Math.random()*25));
//		}
//		drawSquare(g, 0+75, 75, 50);
//		drawSquare(g, 75, 225, 50);
//		for(int i=0; i<(int)(Math.random()*200000);i++)
//		{
//				g.setColor(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
//				drawSquare(g, center_x, center_y, 25);
//		}
//		int x = 75;
//		int y=75;
//		while(y<height)
//		{
//			g.setColor(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
//			drawSquare(g, x, y, 50);
//			x+=(50*3);
//			if (x>width)
//			{
//				x=75;
//				y+=150;
//			}
//			
//		}
	}
	void drawStar(Graphics g, int x, int y, int size)
	{
		Graphics2D g2 = (Graphics2D) g;
		//g2.setStroke(new BasicStroke((float) (Math.random()*20)));
		g2.setStroke(new BasicStroke(2));
		if(size<5)
		{
			return;
		}
		else
		{
			
			for(int i=0; i<6; i++)
			{	
				double angle = i*((2*Math.PI)/6);
				
				
				g2.drawLine(x,y,x+(int)(size*Math.cos(angle)),y+(int)(size*Math.sin(angle)));
				drawStar(g,x, y+(int)(size*Math.sin(angle)), size/3);
				
			}
		}
	}
	void drawSquare(Graphics g, int x, int y, int size)
	{
		//g.drawRect(x, y, size, size);
		
		if (size<5)
		{
			return;
		}
		else
		{
			g.fillRect((int)(x-(size*1.5)), (int)(y-(size*1.5)),size*3, size*3);
			g.setColor(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
			drawStar(g, x, y, size);
		}
	}
}

public class Snowflake
{
	public static void main ( String[] args )
	{
		/*
		 * A frame is a container for a panel
		 * The panel is where the drawing will take place
		 */
		JFrame frame = new JFrame("Snowflake");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new SnowFlakePanel());
		frame.pack();
		frame.setVisible(true);
	}
}
