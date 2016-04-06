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

public class GuiClass extends JFrame
{
	private Button[] buttons; 
	private int button_count;
	
	public GuiClass()
	{
		button_count = 0;
	}
	
	public void add_button(String button_text, String path_to_image)
	{
		this.button_count++;
		
		this.buttons[button_count] = new Button(button_text, path_to_image);	
	}

}	
		


