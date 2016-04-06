/*
#NAME: Mike Sadowski
#DATE:
#STUDENT ID: 0864810
#ASSIGNEMNT:
*/

import java.io.*;
import java.util.*;
import java.lang.String;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;

public class Button extends JFrame
{
	private JButton button;
	private String button_text;
	private ImageIcon button_image;
	
	public Button(String button_text, String path_to_image)
	{
		set_button_text(button_text);
		set_button_image(path_to_image);
		
		refresh_button();
	}
	
	public void refresh_button()
	{
		this.button = new JButton(this.button_text, this.button_image);
	}
		
	public void set_button_text(String new_value)
	{
		this.button_text = new_value;
	}
		
	public void set_button_image(String path_to_image)
	{
		this.button_image = new ImageIcon(path_to_image);
	}
	
}
