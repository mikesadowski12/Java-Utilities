/*
#NAME: Mike Sadowski
#DATE:
#STUDENT ID: 0864810
#ASSIGNEMNT:
*/

import java.io.*;
import java.util.*;
import java.lang.String;

public class Main
{
	private int int_val = 0;
	private double real_val = 0.0;
	private boolean bool_val = false;
	private String str_val = ""; 
	private GuiClass myGui;
	
	public static void main(String[] args)
	{
		myGui = new GuiClass();
		myGui.add_button("my button", "./JavaSwingGUI/Button/images/run.png");
	}

/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  */

	public void set_int_val(int new_value)
	{
		this.int_val = new_value;
	}
	
	public void set_real_val(double new_value)
	{
		this.real_val = new_value;
	}
	
	public void set_bool_val(boolean new_value)
	{
		this.bool_val = new_value;
	}
	
	public void set_str_val(String new_value)
	{
		this.str_val = new_value;
	}
	
/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  */
	
	public int get_int_val()
	{
		return this.int_val;
	}
	
	public double get_real_val()
	{
		return this.real_val;
	}
	
	public boolean get_bool_val()
	{
		return this.bool_val;
	}
	
	public String get_str_val()
	{
		return this.str_val;
	}
}	
		


