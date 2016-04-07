/*
#NAME: Mike Sadowski
#DATE:
#STUDENT ID: 0864810
#ASSIGNEMNT:
*/

import java.io.*;
import javax.swing.*;
import javax.swing.text.*;
import java.util.*;
import java.lang.String;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFileChooser;
import java.io.File;
import javax.swing.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GUI extends JFrame implements KeyListener
{
	private JMenuBar menu_bar;
	
	/* Button Items */
	private JToolBar button_bar;
	private JButton button_one;
	private ImageIcon button_one_image;
	private ActionListener button_one_listener;
	
	/* Drop down tab items*/
	private JMenu tab_one;
	private JMenuItem tab_one_item;
	private ActionListener tab_one_item_listener;
	
	public static void main(String[] args)
	{
		new GUI();
	}
		
	public GUI()
	{
		super();
		setSize(800, 600);
		setLocation(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addWindowListener(new FrameListener());	
		
		menu_bar = new JMenuBar();
		button_bar = new JToolBar();
		
		/* Button Bar */
		button_one_image = new ImageIcon("../JavaSwingGUI/images/run.png");
		button_one = new JButton(button_one_image);
		button_one_listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{								
				
			}
		};
		button_one.addActionListener(button_one_listener);
		button_bar.add(button_one);
		
		/* Setup Drop Down Menu (and the listener) */
		tab_one = new JMenu("Tabs");
		tab_one_item = new JMenuItem("tab_one");			
		tab_one_item_listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{								
				
			}
		};		
		tab_one_item.addActionListener(tab_one_item_listener);
		tab_one.add(tab_one_item);
		menu_bar.add(tab_one);		
			
			
		/* Add elements to JFrame */	
		setJMenuBar(menu_bar);
		getContentPane().add(button_bar, BorderLayout.NORTH);
		setVisible(true);		
	}
	
	class FrameListener extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			
		}
	}
	
	public void keyPressed(KeyEvent e)
	{
		
	}
	public void keyTyped(KeyEvent e)
	{
		
	}
	public void keyReleased(KeyEvent e)
	{
		
	}
	
}	
		


