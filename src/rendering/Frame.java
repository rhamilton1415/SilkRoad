package rendering;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class Frame extends JFrame 
{

	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 800;
	
	private DrawCanvas frameCanvas;
	
	public Frame() throws HeadlessException 
	{
		frameCanvas = new DrawCanvas();
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
		@Override
		public void paintComponent(Graphics g)
		{
	         super.paintComponent(g);     // paint parent's background
	         setBackground(Color.BLACK);  // set background color for this JPanel
	 
	         // Your custom painting codes. For example,
	         // Drawing primitive shapes
	         g.setColor(Color.YELLOW);    // set the drawing color
	         g.drawLine(30, 40, 100, 200);
	         g.drawOval(150, 180, 10, 10);
	         g.drawRect(200, 210, 20, 30);
	         g.setColor(Color.RED);       // change the drawing color
	         g.fillOval(300, 310, 30, 50);
	         g.fillRect(400, 350, 60, 50);
	         // Printing texts
	         g.setColor(Color.WHITE);
	         g.setFont(new Font("Monospaced", Font.PLAIN, 12));
	         g.drawString("Testing custom drawing ...", 10, 20);
		}
	}

}
