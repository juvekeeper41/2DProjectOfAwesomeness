package grid.controller;

import javax.swing.JOptionPane;

public class GridController 
{
	private GridFrame appFrame;
	
	public GridController()
	{
		//create model objects here!
		
		appFrame = this;
	}
	
	private void start()
	{
		JOptionPane.showMessageDialog(appFrame, "Hey look, it's my 2D creation!");
	}
}
