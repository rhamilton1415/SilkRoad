package rendering;
import java.awt.*;

import javax.swing.SwingUtilities;

public class Renderer {
	public Renderer() 
	{
	}

	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						new Frame();
					}
				});
	}
}
