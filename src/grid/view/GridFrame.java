package grid.view;

import javax.swing.JFrame;
import grid.controller.GridController;
import java.awt.Dimension;

public class GridFrame  extends JFrame
{
	private GridController baseController;
	private GridPanel appPanel;
	
	public GridFrame(GridController baseController)
	{
		this.baseController = baseController;
		appPanel = new GridPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(new Dimension(700, 700));
		this.setTitle("Airplane");
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public GridController getBaseController()
	{
		return baseController;
	}
}
