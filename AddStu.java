import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.*;
public class AddStu {

JFrame frame=new JFrame("Add Student");
JButton but=new JButton("Add");

	AddStu(){
		
	
		but.setBounds(100,300,200,40);
		
		frame.setSize(420,420);
	    frame.setLayout(null);
	    frame.setVisible(true);
	    JLabel label1=new JLabel("Enter Name");
		JLabel label2=new JLabel("Enter PO");
		JLabel label3=new JLabel("Enter Adress");
		JLabel label4=new JLabel("Enter ID");
		label1.setBounds(20,100,120,40);
		frame.add(label1);
		label2.setBounds(10,150,120,40);
		frame.add(label2);
		label3.setBounds(20,200,120,40);
		frame.add(label3);
		label4.setBounds(20,250,120,40);
		frame.add(label4);
		
		 JTextArea name =new JTextArea();
		 JTextArea PO =new JTextArea();
		 JTextArea Address =new JTextArea();
		 JTextArea ID =new JTextArea();
		 ID.setBounds(100,250,120,40);
		 name.setBounds(100,100,120,40);
		 PO.setBounds(100,150,120,40);
		 Address.setBounds(100,200,120,40);
		frame.add(ID);
		

		ButtonGroup G=new ButtonGroup();
		JRadioButton rb1,rb2,rb3,rb4;
	
		rb1=new JRadioButton("Stage1");    
		rb1.setBounds(30,50,100,30);      
		rb2=new JRadioButton("Stage2");    
		rb2.setBounds(130,50,100,30);   
		rb3=new JRadioButton("Stage 3");    
		rb3.setBounds(230,50,100,30); 
		rb4=new JRadioButton("Stage 4");    
		rb4.setBounds(330,50,100,30); 
		frame.add(rb1);
		frame.add(rb2);
		frame.add(rb3);
		frame.add(rb4);
		G.add(rb4);
		G.add(rb3);
		G.add(rb2);
		G.add(rb1);
	
	
		 frame.add(name);
		 frame.add(PO);
		 frame.add(Address);
	    frame.add(but);
		

	
	    but.addActionListener(new ActionListener() {
			private String fname;

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
			if(rb1.isSelected()) {
				fname="Stage1.csv";
			}
			else if(rb2.isSelected()) {
				fname="Stage2.csv";
			}
			else if(rb3.isSelected()) {
				fname="Stage3.csv";
			}
			else if(rb4.isSelected()) {
				fname="Stage4.csv";
			}
			
					FileWriter fr=new FileWriter(fname,true);
					
					 BufferedWriter out = new BufferedWriter(fr);
				StuInfo IO=new StuInfo();
	IO.ID=ID.getText();
				IO.name=name.getText();
				IO.Address=Address.getText();
				IO.PO=PO.getText();
				
				out.write(IO.ID);
				out.write(",");
				out.write(IO.name);
				out.write(",");
				out.write(IO.Address);
				out.write(",");
				out.write(IO.PO);
				
				out.write("\n");
				out.close();

				JOptionPane.showMessageDialog(null, "The Student have been added");
				System.out.println(IO.name);

				}catch (Exception E){
					System.out.print("error in writing");
				}
				

				
			}

			
			
	    });  
	    	
	}
}