import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class firstP implements ActionListener {
JFrame fr=new JFrame("First Page");
JButton but=new JButton("Add New Student");

JTabbedPane tp=new JTabbedPane();
JPanel p1 =new JPanel();
JPanel p2 =new JPanel();
JButton bu=new JButton("Stage 1");
JButton bu2=new JButton("Stage 2");
JButton bu3=new JButton("Stage 3");
JButton bu4=new JButton("Stage 4");

firstP(){
	

	


	
	but.setBounds(100,160,200,40);


	p1.setSize(420,420);
	fr.setSize(420,420);
	p1.setLayout(null);
	tp.setBounds(10,10,500,500);
    
    fr.add(tp);
	fr.add(p1);
   
    tp.add("Add",p1);
	fr.setSize(400,400);
	bu.setBounds(50,100,80,40);
	bu2.setBounds(130,100,80,40);
	bu3.setBounds(50,150,80,40);
	bu4.setBounds(130,150,80,40);
	p2.add(bu);
	p2.add(bu2);
	p2.add(bu3);
	p2.add(bu4);
	p2.setLayout(null);
	bu.addActionListener(this);
	bu2.addActionListener(this);
	bu3.addActionListener(this);
	bu4.addActionListener(this);
	tp.add("See Student Data",p2);
	   fr.setLayout(null);
	    fr.setVisible(true);
    
p1.add(but);
but.addActionListener((ActionListener) this);


}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==but) {
		AddStu add=new AddStu();
	}
	
	else if(e.getSource()==bu) {
		Student_Data1 SD1=new Student_Data1();
	}
	else if(e.getSource()==bu2) {
		Student_Data2 SD2=new Student_Data2();
	}
	else if(e.getSource()==bu3) {
		Student_Data3 SD3=new Student_Data3();
	}
	else if (e.getSource()==bu4){
		Student_Data4 SD4=new Student_Data4();
	}


}

}
