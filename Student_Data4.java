import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
public class Student_Data4 implements ActionListener {
    String filePath = "Stage4.csv";
    File file = new File(filePath);
	JFrame frame=new JFrame();
	JPanel p1=new JPanel();
	Student_Data4(){
		
	
		JTable JT=new JTable();
		 
		frame.setSize(400,500);
		JT.setBounds(30,70,100,100);          
		    JScrollPane sp=new JScrollPane(JT);  
		   
		    frame.add(sp);     
		    frame.setVisible(true);  
		  
		 
		 
				
			
			  
		
		
		 
		  
	        try {
	            BufferedReader br = new BufferedReader(new FileReader(file));
	            // get the first line
	            // get the columns name from the first line
	            // set columns name to the jtable model
	            String firstLine = br.readLine().trim();
	            String[] columnsName = {"ID","Name","Address","PhoneNO","Course1","Course2","Course3"};
	            
	            DefaultTableModel model = (DefaultTableModel)JT.getModel();
	            model.setColumnIdentifiers(columnsName);
	            
	            // get lines from txt file
	            Object[] tableLines = br.lines().toArray();
	            System.out.print(tableLines[0]);
	            // extratct data from lines
	            // set data to jtable model
	            for(int i = 0; i < tableLines.length; i++)
	            {
	                String line = tableLines[i].toString().trim();
	                String[] dataRow = line.split(",");
	                model.addRow(dataRow);
	            }
	           JTextArea Search=new JTextArea();
	           Search.setBounds(400,400,140,40); 
	            JButton bt=new JButton("Remove");
	            JButton bt2=new JButton("Update");
	            JTextArea Course=new JTextArea();
	            Course.setBounds(300,500,140,40);
	            frame.add(Course);
	            JButton bt4=new JButton("ADD Course1");
	            bt4.setBounds(100,500,140,40);
	            frame.add(bt4);
	            
	            JTextArea Course2=new JTextArea();
	            Course2.setBounds(300,600,140,40);
	            frame.add(Course2);
	            JButton bt5=new JButton("ADD Course2");
	            bt5.setBounds(100,600,140,40);
	            frame.add(Course2);
	            frame.add(bt5);
	            
	            JTextArea Course3=new JTextArea();
	            Course3.setBounds(300,700,140,40);
	            frame.add(Course3);
	            JButton bt6=new JButton("ADD Course3");
	            bt6.setBounds(100,700,140,40);
	            frame.add(Course3);
	            frame.add(bt6);
	            bt6.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if(e.getSource()==bt6) {
							String cour3=Course3.getText();
							if(cour3.equals("Math") || cour3.equals("English") || cour3.equals("CPP") ){
								int x=JT.getSelectedRow();

								if(x>=0) {
								model.setValueAt(Course3.getText()
										, x, 5);
							
						}
	            }else {
	            	JOptionPane.showMessageDialog(null,"This subject is not Included");
	            }
						}
						
					}
	            	
	            });
	            bt5.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(e.getSource()==bt5) {
							String cour2=Course2.getText();
							if(cour2.equals("Math") || cour2.equals("English") || cour2.equals("CPP") ){
								int x=JT.getSelectedRow();

								if(x>=0) {
								model.setValueAt(Course2.getText()
										, x, 4);
							
						}
	            }else {
	            	JOptionPane.showMessageDialog(null,"This subject is not Included");
	            }
						}
					}
	            	
	            });
	            
	            
	            // Coruses Section
	            bt4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if(e.getSource()==bt4) {
							String cour1=Course.getText();
							if(cour1.equals("Math") || cour1.equals("English") || cour1.equals("CPP") ){
								int x=JT.getSelectedRow();

								if(x>=0) {
								model.setValueAt(Course.getText()
										, x, 3);
							
						}
	            }else {
	            	JOptionPane.showMessageDialog(null,"This subject is not Included");
	            }
					
						}
						
					}
	            	
	            });
	            bt2.setBounds(400,300,140,40);
	  		  bt.setBounds(400,200,140,40); 
	  		  frame.add(bt);
	  		frame.add(bt2);
	  		frame.add(Search);
	  	  JButton bt3=new JButton("Search");
          bt3.setBounds(550,400,140,40);
          frame.add(bt3);
          
          bt3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DefaultTableModel model = (DefaultTableModel)JT.getModel();
				String Search1=Search.getText();
				TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(model);
				JT.setRowSorter(tr);
				tr.setRowFilter(RowFilter.regexFilter(Search1));
				System.out.print("done");
			}
        	  
          });
	  		bt2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==bt2) {
						try 
			  	        {
			  				// just repeat typing the file After getting edited
			  	            File archivo = new File("Stage4.csv");
			  	            TableModel modelo = JT.getModel();
			  	            FileWriter excel = new FileWriter(archivo);
			  	             for(int i = 0; i < modelo.getColumnCount(); i++)
			  	             {
			  	                excel.write(modelo.getColumnName(i) + ",");
			  	             }
			  	             excel.write("\n");
			  	             for(int i=0; i< modelo.getRowCount(); i++) 
			  	             {
			  	                for(int j=0; j < modelo.getColumnCount(); j++) 
			  	                {
			  	                    String data = (String)modelo.getValueAt(i, j);
			  	                    if(data == "null")
			  	                    {
			  	                        data="";
			  	                    }
			  	                    excel.write(data+",");
			  	                }
			  	                excel.write("\n");
			  	            }

			  	        excel.close();
			  	            JOptionPane.showMessageDialog(null, "Done");
			  	            
			  	        } catch (IOException ex) 
			  	        {
			  	        	
			  	        }
					}
					
				}
	  			
	  		});
	  		bt.addActionListener(new ActionListener() { 
	  		  public void actionPerformed(ActionEvent e) { 
	  		if (e.getSource()==bt) {
	  			try 
	  	        {
	  			
	  				int k=JT.getSelectedRow();
	  				model.removeRow(k);
	  	            File archivo = new File("Stage4.csv");
	  	            TableModel modelo = JT.getModel();
	  	            FileWriter excel = new FileWriter(archivo);
	  	             for(int i = 0; i < modelo.getColumnCount(); i++)
	  	             {
	  	                excel.write(modelo.getColumnName(i) + ",");
	  	             }
	  	             excel.write("\n");
	  	             for(int i=0; i< modelo.getRowCount(); i++) 
	  	             {
	  	                for(int j=0; j < modelo.getColumnCount(); j++) 
	  	                {
	  	                    String data = (String)modelo.getValueAt(i, j);
	  	                    if(data == "null")
	  	                    {
	  	                        data="";
	  	                    }
	  	                    excel.write(data+",");
	  	                }
	  	                excel.write("\n");
	  	            }

	  	        excel.close();
	  	            JOptionPane.showMessageDialog(null, "Deleted");
	  	            
	  	        } catch (IOException ex) 
	  	        {
	  	        	
	  	        }}
	  			
	  		  } 
	  		} );

	  		frame.setLayout(null);
	  		
	        } catch (Exception ex) {
	            System.out.println("error");
	            
	        }
	       	  
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
	}


	

