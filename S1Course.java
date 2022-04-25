import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class S1Course {
	
	JFrame frame=new JFrame();
	S1Course() throws IOException{
JTable JT=new JTable();
	    
		frame.setSize(400,500);
		JT.setBounds(30,70,100,100);          
		    JScrollPane sp=new JScrollPane(JT);    
		    frame.add(sp);     
		    frame.setVisible(true);  
		  
		    
		 
            }
	}

