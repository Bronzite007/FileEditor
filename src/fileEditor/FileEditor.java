package fileEditor;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class FileEditor extends JFrame{
	
	//Define a private file for absolute directory
	private JTextField selectField;
	
	//Define a private editArea
	private JTextArea editArea;
	
	//Define a private saveButton
	private JButton saveButton;
	
	//Define a private browse button
	private JButton browse;
	
	//Define a directory to count the level
	private in level = 0;
	
	public FileEditor(){
		this.init();
	}
	
	//File initialization
	public void init() {}
	
	//File save
	private void saveFile() {}
	
	//open directory or file
	private void openDirOrFile() {}
	
	//show directory and build a tree map
	private void showDir() {}

	//main function
	public static void main(String[] args) {}
}
