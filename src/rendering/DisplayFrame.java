package rendering;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.JFrame;

import geography.Drawable;

public class DisplayFrame extends JFrame 
{

	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 800;
	
	private DrawCanvas frameCanvas;
	
	public DisplayFrame(ArrayList<Drawable> toDraw) throws HeadlessException 
	{
		frameCanvas = new DrawCanvas(toDraw);
		frameCanvas.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
		Container frameContentPane = getContentPane();
		frameContentPane.add(frameCanvas);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setTitle("Silk Road");
		setVisible(true);
	}

	private final class DrawCanvas extends JPanel
	{
		ArrayList<Drawable> toDraw;
		public DrawCanvas(ArrayList<Drawable> entitiesToDraw)
		{
			toDraw = entitiesToDraw;
		}
		@Override
		public void paintComponent(Graphics g)
		{
	         super.paintComponent(g);     // paint parent's background
	         setBackground(Color.BLACK);
	         g.setColor(Color.YELLOW); 
	         for(int i = 0;i<toDraw.size();i++)
	         {
	        	 toDraw.get(i).draw(g);
	         }
		}
	}

}
