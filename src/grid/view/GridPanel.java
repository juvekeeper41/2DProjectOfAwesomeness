package grid.view;

import javax.swing.*;
import grid.controller.GridController;
import java.awt.Color;
import javax.swing.table.*;
import java.awt.Dimension;

public class GridPanel extends JPanel
{
	private JTextField rowField;
	private JTextField columnField;
	private JTextField inputField;
	private JLabel inputLabel;
	private JLabel rowLabel;
	private JLabel columnLabel;
	private JButton submitButton;
	private SpringLayout baseLayout;
	private GridController baseController;
	
	public GridPanel(GridController)
	{
		this.baseController = baseController;
		this.baseLayout = springLayout()
		
	}
	
	private void setupTable()
	{
		DefaultTableModel data = new DefaultTableModel(baseController.getGrid(), new String []{"one", "two", "three", "four", "five"});
		gridTable = new JTable();
		gridTable.setModel(data);
		gridPane = new JScrollPane();
		gridPane.setViewportView(gridTable);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setMinimumSize(new Dimension(700, 700));
		this.setBackground(Color.GREEN);
		this.add(gridPane);
		this.add(columnField);
	}
	
	
	private void setupLayout()
	{
		
	}
	
	public gridController getBaseController()
	{
		return baseController()
	}
	
	private setupListeners()
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.columnField = new JTextField(5);
	}
}
