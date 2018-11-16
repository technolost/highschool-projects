import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

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
		drawStar(g,center_x, center_y, width/4,3);
	}
	void drawStar(Graphics g, int x, int y, int size,int lines)
	{

//		for(int i=0; i<6; i++)
//		{
//			
//			double angle = i*((2*Math.PI)/6);
//			g.drawLine(x,y,x+(int)(size*Math.cos(angle)),y+(int)(size*Math.sin(angle)));
//		}
		
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
