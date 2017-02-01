package grid.controller;

import javax.swing.JOptionPane;
import grid.controller.GridRunner;
import grid.view.*;
import grid.model.*;

public class GridController 
{
	private GridFrame appFrame;	
	private Airplane [][] grid;
	
	public GridController()
	{
		//create model objects here!
		grid = new Airplane[6][5];
		appFrame = new GridFrame(this);
	}
	
	
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, "Hey look, it's my 2D creation!");
	}
	
	public Airplane [][] getGrid()
	{
		return grid;
	}
	
	public GridFrame getFrame()
	{
		return appFrame;
	}
}
