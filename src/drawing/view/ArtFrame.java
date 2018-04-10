package drawing.view;

import javax.swing.*;
import drawing.controller.*;

public class ArtFrame extends JFrame
{
	private ArtPanel appPanel;
	
	public artFrame(DrawingController app)
	{
		super();
		appPanel = new ArtPanel(app);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(1200, 700);
		this.setContentPane(appPanel);
		this.setTitle("creating modern art in java");
		this.setVisible(true);
	}
}
