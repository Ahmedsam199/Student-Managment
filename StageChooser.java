import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class StageChooser implements ActionListener {
	JFrame fr=new JFrame();
	JButton bu=new JButton("Stage 1");
	JButton bu2=new JButton("Stage 2");
	JButton bu3=new JButton("Stage 3");
	JButton bu4=new JButton("Stage 4");
	StageChooser(){
		fr.setSize(400,400);
		bu.setBounds(100,160,200,40);
		bu2.setBounds(100,200,200,40);
		bu3.setBounds(100,240,200,40);
		bu4.setBounds(100,280,200,40);
		fr.add(bu);
		fr.add(bu2);
		fr.add(bu3);
		fr.add(bu4);
		bu.addActionListener(this);
		bu2.addActionListener(this);
		bu3.addActionListener(this);
		bu4.addActionListener(this);
		   fr.setLayout(null);
		    fr.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bu) {
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

