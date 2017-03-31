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
	private int level = 0;
	
	public FileEditor(){
		this.init();
	}
	
	//File initialization
	public void init() {
		this.setTitle("FileEditor");
		//set the frame size and location
		this.setBounds(300,600,300,300);
        selectField = new JTextField(40); 
        
        //create a button called browse
        browse = new JButton("Browse");  
        //create a action listener
        browse.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				FileEditor.this.level = 0;
				String path = selectField.getText();
				
				openDirOrFile(path.replaceAll("//", "\\\\"));
			}
        	
        });
        //create a new panel
        JPanel upPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));  
        
        //set the background color
        upPanel.setBackground(Color.CYAN);  
        
        //add selected field
        upPanel.add(selectField);

        //add browse button
        upPanel.add(browse); 

        //add the upPanel to the north
        this.add(upPanel, BorderLayout.NORTH);  

        /* 
         * create an area for editing
         */ 
        editArea = new JTextArea();  
        ScrollPane scollPanel = new ScrollPane(ScrollPane.SCROLLBARS_AS_NEEDED);  
        scollPanel.add(editArea);  
        this.add(scollPanel, BorderLayout.CENTER);  

        /* 
         * create a listening action for the button
         */ 
        saveButton = new JButton("Save");  
        saveButton.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent ae) {  
                // save 
                saveFile();  
            }
        }); 
        
        JPanel southPanel = new JPanel();  
        southPanel.setBackground(Color.green);  
        southPanel.add(saveButton);  
        this.add(southPanel, BorderLayout.SOUTH);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setVisible(true);  

	}
	
	//File save
	private void saveFile() {}
	
	//open directory or file
	private void openDirOrFile(String absolutePath) {}
	
	//show directory and build a tree map
	private void showDir() {}

	//main function
	public static void main(String[] args) {}
}
