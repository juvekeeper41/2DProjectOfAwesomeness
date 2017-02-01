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
	
	private JTable gridTable;
	private JScrollPane gridPane;
	
	public GridPanel(GridController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		this.rowField = new JTextField (5);
		this.columnField = new JTextField (5);
		
		this.rowLabel = new JLabel ("Row");
		baseLayout.putConstraint(SpringLayout.EAST, rowLabel, -39, SpringLayout.WEST, rowField);
		
		this.columnLabel = new JLabel ("Column");
		this.submitButton = new JButton ("Submit");
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 27, SpringLayout.SOUTH, rowField);
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupTable()
	{
		DefaultTableModel data = new DefaultTableModel(baseController.getGrid(), new String []{"one", "two", "three", "four", "five"});
		gridTable = new JTable();
		gridTable.setModel(data);
		gridPane = new JScrollPane();
		
		gridPane.setViewportView(gridTable);
		
		this.inputField = new JTextField ("");
		gridPane.setColumnHeaderView(inputField);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setMinimumSize(new Dimension(700, 700));
		this.setBackground(Color.GREEN);
		this.add(gridPane);
		this.add(columnField);
		this.add(rowField);
		this.add(rowLabel);
		this.add(submitButton);
		
	}
	
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, rowField, 0, SpringLayout.WEST, columnField);
		baseLayout.putConstraint(SpringLayout.NORTH, columnField, 51, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, columnField, 146, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, gridPane, 250, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, submitButton, -22, SpringLayout.WEST, gridPane);
		baseLayout.putConstraint(SpringLayout.NORTH, rowLabel, 1, SpringLayout.NORTH, gridPane);
		baseLayout.putConstraint(SpringLayout.NORTH, rowField, -4, SpringLayout.NORTH, gridPane);
		baseLayout.putConstraint(SpringLayout.SOUTH, gridPane, -80, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 37, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 68, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, inputField, -762, SpringLayout.EAST, this);
	}
	
	public GridController getBaseController()
	{
		return baseController();
	}
	
	private setupListeners()
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.columnField = new JTextField(5);
	}
}
